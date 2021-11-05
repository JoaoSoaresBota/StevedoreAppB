package com.Stevedores.Stevedores.Controller.Interfaces;

public interface IWasteManager {
    public double PercentageFull();
    public boolean IsFull();
    void DisposeWaste(double amount);
    public boolean AddWaste(double amount);

}
