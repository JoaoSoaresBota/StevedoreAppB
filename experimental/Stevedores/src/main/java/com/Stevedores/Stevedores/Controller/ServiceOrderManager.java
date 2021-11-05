package com.Stevedores.Stevedores.Controller;


import com.Stevedores.Stevedores.Model.PortServiceOrder.PortServiceOrder;
import com.Stevedores.Stevedores.Model.PortServiceOrder.Resource;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;


public interface ServiceOrderManager {
    PortServiceOrder CreateNewServiceOrder(int orderId, String shipName, LocalDate orderCreated, ArrayList<Resource> resources);
    PortServiceOrder GetServiceOrder(int id);
    boolean DeletePortServiceOrder(int id);
    boolean UpdateServiceOrder(PortServiceOrder order);

}
