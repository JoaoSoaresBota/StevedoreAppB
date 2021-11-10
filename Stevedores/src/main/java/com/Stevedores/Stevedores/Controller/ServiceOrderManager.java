package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Controller.Interfaces.IServiceOrderManager;
import com.Stevedores.Stevedores.Model.Party;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.Resource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@Api(value="/api/OrderManager",produces="application/json")
@RestController
@RequestMapping("/api/OrderManager")
   /*
    All requests in here need to be authorized so the party needs to be sent with them.
    This is the Api the different parties will interact with directly
    */
public class ServiceOrderManager implements IServiceOrderManager {


    @ApiOperation(value="create new port service order",response=PortServiceOrder.class)
    @RequestMapping(value="/PortServiceOrder",method = RequestMethod.POST,produces="application/json")
    @Override
    /*
    Creates a new Port Service order and returns it so that it can be displayed.
    */
    public PortServiceOrder CreateNewServiceOrder(String shipName, LocalDate orderCreated, ArrayList<Resource> resources, Party party) {
        return new PortServiceOrder();
    }

    /*
    Gets a PortServiceOrder by id and returns it
    */
    @ApiOperation(value="Get an existing service order by its id",response=PortServiceOrder.class)
    @RequestMapping(value="/GetServiceOrder",method = RequestMethod.GET,produces="application/json")
    @Override
    public PortServiceOrder GetServiceOrder(int id, Party party) {
        return new PortServiceOrder();
    }

    /*
    Deletes a PortServiceOrder by id and returns if it worked
    */
    @ApiOperation(value="Delete an existing service order by its id",response=Boolean.class)
    @RequestMapping(value="/DeleteServiceOrder",method = RequestMethod.DELETE,produces="application/json")
    @Override
    public boolean DeletePortServiceOrder(int id, Party party) {
        return false;
    }

    /*
    Deletes a PortServiceOrder by id and returns if it worked
    */
    @ApiOperation(value="Update an existing service order",response=PortServiceOrder.class)
    @RequestMapping(value="/UpdateServiceOrder",method = RequestMethod.PUT,produces="application/json")
    @Override
    public PortServiceOrder UpdateServiceOrder(PortServiceOrder order, Party party) {
        return new PortServiceOrder();
    }
}
