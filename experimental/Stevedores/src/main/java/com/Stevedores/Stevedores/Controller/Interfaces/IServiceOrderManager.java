package com.Stevedores.Stevedores.Controller.Interfaces;


import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.Resource;

import java.time.LocalDate;
import java.util.ArrayList;


public interface IServiceOrderManager {
    PortServiceOrder CreateNewServiceOrder(int orderId, String shipName, LocalDate orderCreated, ArrayList<Resource> resources);
    PortServiceOrder GetServiceOrder(int id);
    boolean DeletePortServiceOrder(int id);
    boolean UpdateServiceOrder(PortServiceOrder order);

}
