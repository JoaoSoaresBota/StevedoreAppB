package com.Stevedores.Stevedores.Model;


//TODO add JPA annotations

public class Characteristic {
    private String name;

    public Characteristic(String name, int value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public Characteristic() {
        this.name = "testName";
        this.value = 20;
        this.description = "testDescription";
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    private double value;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
