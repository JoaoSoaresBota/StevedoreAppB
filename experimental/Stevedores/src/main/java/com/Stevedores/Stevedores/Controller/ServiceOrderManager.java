package com.Stevedores.Stevedores.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class ServiceOrderManager {


    private Long id;
    private String shipName;
    private LocalDate orderCreated;







    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
