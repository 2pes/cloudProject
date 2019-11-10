package com.company.project.city.service;


import com.company.project.city.model.City;

import java.util.List;

/**
 * City Data Service.
 *
 * @author ChenYong
 * @since 1.0.0 2017年11月23日
 */
public interface CityDataService {

    /**
     * 获取City列表
     *
     * @return
     * @throws Exception
     */
    List<City> listCity() throws Exception;
}
