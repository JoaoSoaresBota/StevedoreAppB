package com.Stevedores.Stevedores.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;

//TODO add JPA annotations
@Entity
public class Resource {
    private Long id;

    private String href;
    private String uuid;

    public Resource(Long id, String href, String uuid, String name, ArrayList<Characteristic> characteristics, ResourceAccess resourceAccess, String resourceTypeName, String description) {
        this.id = id;
        this.href = href;
        this.uuid = uuid;
        this.name = name;
        this.characteristics = characteristics;
        this.resourceAccess = resourceAccess;
        this.resourceTypeName = resourceTypeName;
        this.description = description;
    }

    public Resource(Long id) {
        this.id = id;
        this.href = "testHref";
        this.uuid = "testUuid";
        this.name = "testName";
        this.characteristics = new ArrayList<Characteristic>(Arrays.asList(
            new Characteristic()
        ));
        this.resourceAccess = resourceAccess;
        this.resourceTypeName = resourceTypeName;
        this.description = description;
    }

    public Resource() {}



    private String name;
    @OneToMany
    private ArrayList<Characteristic> characteristics;
    //TODO Add missing party attribute
    private ResourceAccess resourceAccess;
    private String resourceTypeName;
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

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

    public ArrayList<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(ArrayList<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public ResourceAccess getResourceAccess() {
        return resourceAccess;
    }

    public void setResourceAccess(ResourceAccess resourceAccess) {
        this.resourceAccess = resourceAccess;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
