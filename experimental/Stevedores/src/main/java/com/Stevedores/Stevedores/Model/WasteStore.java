package com.Stevedores.Stevedores.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WasteStore {
    private Long id;

    private String wasteStoreLocation;
    private double wasteStoreMax;
    private double wasteStoreAmount;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getWasteStoreLocation() {
        return wasteStoreLocation;
    }

    public void setWasteStoreLocation(String wasteStoreLocation) {
        this.wasteStoreLocation = wasteStoreLocation;
    }

    public double getWasteStoreMax() {
        return wasteStoreMax;
    }

    public void setWasteStoreMax(double wasteStoreMax) {
        this.wasteStoreMax = wasteStoreMax;
    }

    public double getWasteStoreAmount() {
        return wasteStoreAmount;
    }

    public void setWasteStoreAmount(double wasteStoreAmount) {
        this.wasteStoreAmount = wasteStoreAmount;
    }
}
