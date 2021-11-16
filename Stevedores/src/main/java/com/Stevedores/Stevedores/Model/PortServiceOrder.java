package com.Stevedores.Stevedores.Model;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

//TODO add JPA annotations

public class PortServiceOrder {


    private int orderId;

    public PortServiceOrder(int orderId, String shipName, LocalDate orderCreated, ArrayList<Resource> requestedResources, PortOrderStatus orderStatus) {
        this.orderId = orderId;
        this.shipName = shipName;
        this.orderCreated = orderCreated;
        this.requestedResources = requestedResources;
        this.orderStatus = orderStatus;
    }

    public PortServiceOrder() {
        this.orderId = 1;
        this.shipName = "testShipName";
        this.orderCreated = LocalDate.of(2021, Month.NOVEMBER,10);
        this.requestedResources = new ArrayList<Resource>(Arrays.asList(
            new Resource(),
            new Resource(),
            new Resource(),
            new Resource()
        ));
        this.orderStatus = orderStatus.PLACED;
    }



    private String shipName;
    private LocalDate orderCreated;
    private ArrayList<Resource> requestedResources;
    private PortOrderStatus orderStatus;


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
