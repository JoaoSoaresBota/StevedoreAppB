package com.Stevedores.Stevedores.Model.PortServiceOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
//TODO add JPA annotations
@Entity
public class PortServiceOrder {

    private Long id;
    private int orderId;
    private String shipName;
    private LocalDate orderCreated;
    @OneToMany
    private ArrayList<Resource> requestedResources;
    private PortOderStatus orderStatus;



    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public LocalDate getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(LocalDate orderCreated) {
        this.orderCreated = orderCreated;
    }

    public ArrayList<Resource> getRequestedResources() {
        return requestedResources;
    }

    public void setRequestedResources(ArrayList<Resource> requestedResources) {
        this.requestedResources = requestedResources;
    }

    public PortOderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(PortOderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
