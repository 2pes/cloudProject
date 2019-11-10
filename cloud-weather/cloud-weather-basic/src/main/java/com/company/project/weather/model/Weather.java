package com.company.project.weather.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class Weather implements Serializable {
    private static final long serialVersionUID = 1L;

    private String city;
    private String ganmao;
    private String wendu;
    private Yesterday yesterday;
    private List<Forecast> forecast;
}