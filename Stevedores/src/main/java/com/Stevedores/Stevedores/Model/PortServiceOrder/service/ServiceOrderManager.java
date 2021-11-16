package com.Stevedores.Stevedores.Model.PortServiceOrder.service;

import com.Stevedores.Stevedores.Model.PortServiceOrder.service.IServiceOrderManager;
import com.Stevedores.Stevedores.Model.party.dto.Party;
import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortServiceOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value="/api/OrderManager",produces="application/json")
@RestController
@RequestMapping("/api/OrderManager")
public class ServiceOrderManager implements IServiceOrderManager {


    @ApiOperation(value="create new port service order",response=PortServiceOrder.class)
    @RequestMapping(value="/order",method = RequestMethod.POST,produces="application/json")
    @Override
    /*
    Creates a new Port Service order and returns it so that it can be displayed.
    */
    public PortServiceOrder CreateNewServiceOrder(PortServiceOrder order) {
        return new PortServiceOrder();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    /*
    Gets a PortServiceOrder by id and returns it
    */
    @ApiOperation(value="Get an existing service order by its id",response=PortServiceOrder.class)
    @RequestMapping(value="/GetServiceOrder",method = RequestMethod.GET,produces="application/json")
    @Override
    public PortServiceOrder GetServiceOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    /*
    Deletes a PortServiceOrder by id and returns if it worked
    */
    @ApiOperation(value="Delete an existing service order by its id",response=Boolean.class)
    @RequestMapping(value="/DeleteServiceOrder",method = RequestMethod.DELETE,produces="application/json")
    @Override
    public boolean DeletePortServiceOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    /*
    Deletes a PortServiceOrder by id and returns if it worked
    */
    @ApiOperation(value="Update an existing service order",response=PortServiceOrder.class)
    @RequestMapping(value="/UpdateServiceOrder",method = RequestMethod.PUT,produces="application/json")
    @Override
    public PortServiceOrder UpdateServiceOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
