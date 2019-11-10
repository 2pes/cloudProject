package com.company.project.weather.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 *
 */
@Data
@ToString
public class Forecast implements Serializable {
    private static final long serialVersionUID = 1L;

    private String date;
    private String high;
    private String fengxiang;
    private String low;
    private String fengli;
    private String type;


}