package com.company.project.weather.job;

import com.company.project.city.model.City;
import com.company.project.weather.service.CityClient;
import com.company.project.weather.service.WeatherDataCollectionService;
import com.google.common.collect.Lists;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;


/**
 * Weather Data Sync Job.
 *
 * @author ChenYong
 * @since 1.0.0 2017年11月23日
 */
public class WeatherDataSyncJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);


    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;
    @Autowired
    private CityClient cityClient;


    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.info("Weather Data Sync Job. Start！");

        // 获取城市ID列表
        // 改为城市数据api微服务提供数据
        List<City> cityList = null;

        try {
            // 改为由城市数据API微服务提供数据
            cityList = cityClient.listCity();
        } catch (Exception e) {
            logger.error("Exception!", e);
        }
        // 遍历城市ID获取天气
        cityList.forEach(city -> {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job, cityId:" + cityId);

            weatherDataCollectionService.syncDateByCityId(cityId);
        });


        logger.info("Weather Data Sync Job. End！");
    }

}
