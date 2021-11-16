package com.Stevedores.Stevedores.Model.PortServiceOrder.dto;


import com.Stevedores.Stevedores.Model.Resource.dto.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TODO add JPA annotations

public class PortServiceOrder {

    private String href;
    private String uuid;
    private String shipName;
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





}
