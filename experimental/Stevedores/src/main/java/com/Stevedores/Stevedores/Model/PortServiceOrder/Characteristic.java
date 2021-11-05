package com.Stevedores.Stevedores.Model.PortServiceOrder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Characteristic {
    private Long id;
    private String name;
    private String value;
    private String description;




    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
