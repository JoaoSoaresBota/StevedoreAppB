package com.Stevedores.Stevedores.Controller;


import com.Stevedores.Stevedores.Model.PortServiceOrder.PortServiceOrder;

import java.time.LocalDate;


public interface ServiceOrderManager {
    PortServiceOrder CreateNewServiceOrder(int orderId, String shipName, LocalDate orderCreated);

}
