package com.company.project.weather.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@ToString
@Data
@Accessors(chain = true)
public class Yesterday implements Serializable {
    private static final long serialVersionUID = 1L;

    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;


}
