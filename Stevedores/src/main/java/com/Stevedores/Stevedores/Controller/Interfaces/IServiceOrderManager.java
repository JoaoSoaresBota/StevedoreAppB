package com.Stevedores.Stevedores.Controller.Interfaces;


import com.Stevedores.Stevedores.Model.Party;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.Resource;

import java.time.LocalDate;
import java.util.ArrayList;


public interface IServiceOrderManager {
    PortServiceOrder CreateNewServiceOrder(String shipName, LocalDate orderCreated, ArrayList<Resource> resources, Party party);
    PortServiceOrder GetServiceOrder(int id, Party party);
    boolean DeletePortServiceOrder(int id, Party party);
    PortServiceOrder UpdateServiceOrder(PortServiceOrder order, Party party);

}
