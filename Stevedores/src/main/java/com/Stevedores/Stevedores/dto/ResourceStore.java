package com.Stevedores.Stevedores.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name="resourceStores")
public class ResourceStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Long pk;

    private double amount;
    private ResourceType type;





    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Id
    public Long getPk() {
        return pk;
    }
}
