package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Controller.Interfaces.IServicesManager;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/api/ServiceManager",produces="application/json")
@RestController
@RequestMapping("/api/ServiceManager")
public class ServiceManager implements IServicesManager {


    @ApiOperation(value="provide water to ship",response= Boolean.class)
    @RequestMapping(value="/ProvisionWaterToShip",method = RequestMethod.POST,produces="application/json")
    @Override
    public boolean ProvisionWaterToShip(int orderId, String shipName) {
        return false;
    }

    @ApiOperation(value="remove water from ship",response= Boolean.class)
    @RequestMapping(value="/RemoveWasteFromShip",method = RequestMethod.POST,produces="application/json")
    @Override
    public boolean RemoveWasteFromShip(int orderId, String shipName) {
        return false;
    }

    @ApiOperation(value="offload cargo from ship",response= Boolean.class)
    @RequestMapping(value="/OffloadCargoFromShip",method = RequestMethod.POST,produces="application/json")
    @Override
    public boolean OffloadCargoFromShip(int orderId, String shipName) {
        return false;
    }

    @ApiOperation(value="onload cargo from ship",response= Boolean.class)
    @RequestMapping(value="/OnloadCargoFromShip",method = RequestMethod.POST,produces="application/json")
    @Override
    public boolean OnloadCargoToShip(int orderId, String shipName) {
        return false;
    }
}
