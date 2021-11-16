package com.Stevedores.Stevedores.Model.Ship.service;

import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortServiceOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/api",produces="application/json")
@RestController
@RequestMapping("/api")
public class ShipService implements IShipService{

    @ApiOperation(value="Update the status of a ship to ARRIVED")
    @RequestMapping(value="/shipArrived",method = RequestMethod.PUT,produces="application/json")
    @Override
    public void ShipArrived(String uuid) {

    }
}
