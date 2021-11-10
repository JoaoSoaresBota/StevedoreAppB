package com.Stevedores.Stevedores.Controller.Interfaces;

import com.Stevedores.Stevedores.Model.Bill;
import com.Stevedores.Stevedores.Model.PortServiceOrder;

public interface IBillingManager {
    public Bill CreateBill(PortServiceOrder bills);
    public double CalculateCost(PortServiceOrder order);
}
