package com.Stevedores.Stevedores.Model.PortServiceOrder.dto;


import com.Stevedores.Stevedores.Model.Resource.dto.Resource;
import com.Stevedores.Stevedores.Model.party.dto.PartyHref;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

//TODO add JPA annotations
@Entity
@Table(name = "PortServiceOrders")
public class PortServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Long id;

    private String href;
    @GeneratedValue(generator = "UUID")
    @ApiModelProperty(hidden = true)
    private UUID uuid = UUID.randomUUID();
    private String shipUuid;
    private LocalDate orderCreated;
    private LocalDate startDate;
    private LocalDate endDate;
    //The party that created the order
    @OneToOne
    private PartyHref orderOwner;
    //A list of all changes that were made to the order

    @OneToMany()
    private List<OrderChangeRequestHref> changeRequests;
    //A list of all required resources
    @OneToMany()
    private List<Resource> requestedResources;
    private PortOrderStatus orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getShipUuid() {
        return shipUuid;
    }

    public void setShipUuid(String shipUuid) {
        this.shipUuid = shipUuid;
    }

    public LocalDate getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(LocalDate orderCreated) {
        this.orderCreated = orderCreated;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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

    public List<Resource> getRequestedResources() {
        return requestedResources;
    }

    public void setRequestedResources(List<Resource> requestedResources) {
        this.requestedResources = requestedResources;
    }

    public PortOrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(PortOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
