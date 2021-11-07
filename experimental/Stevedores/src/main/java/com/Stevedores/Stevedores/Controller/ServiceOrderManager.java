package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Controller.Interfaces.IServiceOrderManager;
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
public class ServiceOrderManager implements IServiceOrderManager {
    @ApiOperation(value="create new port service order",response=PortServiceOrder.class)




    @RequestMapping(value="/PortServiceOrder",method = RequestMethod.POST,produces="application/json")
    @Override
    public PortServiceOrder CreateNewServiceOrder(int orderId, String shipName, LocalDate orderCreated, ArrayList<Resource> resources) {
        return new PortServiceOrder();
    }


    @RequestMapping(value="/GetServiceOrder",method = RequestMethod.GET,produces="application/json")
    @Override
    public PortServiceOrder GetServiceOrder(int id) {
        return new PortServiceOrder();
    }

    @Override
    public boolean DeletePortServiceOrder(int id) {
        return false;
    }

    @Override
    public boolean UpdateServiceOrder(PortServiceOrder order) {
        return false;
    }
}
