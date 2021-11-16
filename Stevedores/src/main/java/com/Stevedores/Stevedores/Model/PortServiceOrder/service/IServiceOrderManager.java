package com.Stevedores.Stevedores.Model.PortServiceOrder.service;


import com.Stevedores.Stevedores.Model.party.dto.Party;
import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortServiceOrder;


public interface IServiceOrderManager {
    PortServiceOrder CreateNewServiceOrder(PortServiceOrder order);
    PortServiceOrder GetServiceOrder();
    boolean DeletePortServiceOrder();
    PortServiceOrder UpdateServiceOrder();

}
