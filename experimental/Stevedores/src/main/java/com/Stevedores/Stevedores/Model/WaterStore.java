package com.Stevedores.Stevedores.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WaterStore {
    private Long id;
    private String waterStoreLocation;
    private double waterStoreReserves;
    private double waterStoreMax;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getWaterStoreLocation() {
        return waterStoreLocation;
    }

    public void setWaterStoreLocation(String waterStoreLocation) {
        this.waterStoreLocation = waterStoreLocation;
    }

    public double getWaterStoreReserves() {
        return waterStoreReserves;
    }

    public void setWaterStoreReserves(double waterStoreReserves) {
        this.waterStoreReserves = waterStoreReserves;
    }

    public double getWaterStoreMax() {
        return waterStoreMax;
    }

    public void setWaterStoreMax(double waterStoreMax) {
        this.waterStoreMax = waterStoreMax;
    }
}

