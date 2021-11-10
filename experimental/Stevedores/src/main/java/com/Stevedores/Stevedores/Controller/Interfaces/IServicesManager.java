package com.Stevedores.Stevedores.Controller.Interfaces;

public interface IServicesManager {
    boolean ProvisionWaterToShip(int orderId, String shipName);
    boolean RemoveWasteFromShip(int orderId, String shipName);
    boolean OffloadCargoFromShip(int orderId, String shipName);
    boolean OnloadCargoToShip(int orderId, String shipName);
}