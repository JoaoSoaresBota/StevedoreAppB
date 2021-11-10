package com.Stevedores.Stevedores.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Party {

    private Long id;
    private int partyId;
    private String partyname;
    private String key;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
