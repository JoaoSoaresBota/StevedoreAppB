package com.Stevedores.Stevedores.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Long pk;

    private double waterAmount;
    private double wasteAmount;
    private double fuelAmount;
    private double foodAmount;


    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Id
    public Long getPk() {
        return pk;
    }
}
