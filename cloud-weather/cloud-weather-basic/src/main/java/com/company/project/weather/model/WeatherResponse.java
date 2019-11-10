package com.company.project.weather.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Weather data;
    private Integer status;
    private String desc;

}