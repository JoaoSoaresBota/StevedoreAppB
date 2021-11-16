package com.Stevedores.Stevedores.Model.PortServiceOrder.dto;


import com.Stevedores.Stevedores.Model.Resource.dto.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TODO add JPA annotations

public class PortServiceOrder {

    private String href;
    private String uuid;
    private String shipUuid;
    private Date orderCreated;
    private Date startDate;
    private Date endDate;
    //The party that created the order
    private PartyHref orderOwner;
    //A list of all changes that were made to the order
    private List<OrderChangeRequestHref> changeRequests;
    //A lost of all required resources
    private ArrayList<Resource> requestedResources;
    private PortOrderStatus orderStatus;

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

    public String getShipUuid() {
        return shipUuid;
    }

    public void setShipUuid(String shipUuid) {
        this.shipUuid = shipUuid;
    }

    public Date getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(Date orderCreated) {
        this.orderCreated = orderCreated;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PartyHref getOrderOwner() {
        return orderOwner;
    }

    public void setOrderOwner(PartyHref orderOwner) {
        this.orderOwner = orderOwner;
    }

    public List<OrderChangeRequestHref> getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(List<OrderChangeRequestHref> changeRequests) {
        this.changeRequests = changeRequests;
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
