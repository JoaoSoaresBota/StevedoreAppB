package com.Stevedores.Stevedores.Model.Resource.dto;

import com.Stevedores.Stevedores.Model.party.dto.Party;

import javax.persistence.Entity;
import javax.persistence.Id;

//TODO add JPA annotations
@Entity
public class Resource {

    private Long id;
    private String href;
    private String uuid;
    private String name;
    private String description;
    private double value;
    //TODO Add missing party attribute
    private String resourceTypeName;
    private Party resourceOwner;
    private ResourceAccess resourceController;



    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
