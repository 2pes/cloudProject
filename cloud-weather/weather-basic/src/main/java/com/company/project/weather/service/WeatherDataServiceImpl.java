package com.company.project.weather.service;

import com.company.project.weather.model.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    // 1800s
    private static final long TIME_OUT = 1800L;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;

        //return this.doGetWeahter(uri);
        return this.doGetWeahterFromRedis(uri, cityId);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_URI + "city=" + cityName;
        //return this.doGetWeahter(uri);
        return this.doGetWeahterFromRedis(uri, cityName);
    }


    private WeatherResponse doGetWeahter(String uri) {


        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse resp = null;

        String strBody = genResponse(uri);
        try {
            resp = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resp;
    }

    /**
     * redis缓存数据
     *
     * @param uri
     * @return
     */
    private WeatherResponse doGetWeahterFromRedis(String uri, String key) {
        String strBody = null;
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse resp = null;
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        // 先查缓存，缓存有的取缓存中的数据
        if (stringRedisTemplate.hasKey(key)) {
            logger.info("Redis has data");
            strBody = ops.get(key);
        } else {
            logger.info("Redis don't has data");
            // 缓存没有，再调用服务接口来获取
              strBody = genResponse(uri);

            // 数据写入缓存
            ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
        }

        try {
            resp = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            //e.printStackTrace();
            logger.error("Error!", e);
        }

        return resp;

    }


    @Override
    public void syncDateByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;
        this.saveWeatherData(uri, cityId);
    }

    /**
     * 把天气数据放在缓存
     *
     * @param uri
     */
    private void saveWeatherData(String uri, String key) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();

        // 调用服务接口来获取
       String strBody = genResponse(uri);

        // 数据写入缓存
        ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);

    }


    private String genResponse(String uri) {
        String strBody = null;
        // 调用服务接口来获取
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);

        if (respString.getStatusCodeValue() == 200) {
            strBody = respString.getBody();
        }
        return strBody;
    }

}