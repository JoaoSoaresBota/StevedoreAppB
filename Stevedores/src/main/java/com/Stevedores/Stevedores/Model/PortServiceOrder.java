package com.Stevedores.Stevedores.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//TODO add JPA annotations
@Entity
public class PortServiceOrder {

    private Long id;
    private int orderId;

    public PortServiceOrder(Long id, int orderId, String shipName, LocalDate orderCreated, ArrayList<Resource> requestedResources, PortOrderStatus orderStatus) {
        this.id = id;
        this.orderId = orderId;
        this.shipName = shipName;
        this.orderCreated = orderCreated;
        this.requestedResources = requestedResources;
        this.orderStatus = orderStatus;
    }

    public PortServiceOrder() {
        this.id = 1L;
        this.orderId = 1;
        this.shipName = "testShipName";
        this.orderCreated = LocalDate.now();
        this.requestedResources = new ArrayList<Resource>(Arrays.asList(
            new Resource(1L),
            new Resource(2L),
            new Resource(3L),
            new Resource(4L)
        ));
        this.orderStatus = orderStatus;
    }



    private String shipName;
    private LocalDate orderCreated;
    @OneToMany
    private ArrayList<Resource> requestedResources;
    private PortOrderStatus orderStatus;



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

    public PortOrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(PortOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
