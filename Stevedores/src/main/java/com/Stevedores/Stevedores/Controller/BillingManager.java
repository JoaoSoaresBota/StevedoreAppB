package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Controller.Interfaces.IBillingManager;
import com.Stevedores.Stevedores.Model.Bill;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value="/api/BillingManager",produces="application/json")
@RestController
@RequestMapping("/api/BillingManager")
public class BillingManager implements IBillingManager {

    @ApiOperation(value="create new bill",response=Double.class)
    @RequestMapping(value="/CreateBill",method = RequestMethod.POST,produces="application/json")
    @Override
    public Bill CreateBill(PortServiceOrder order) {
        return null;
    }

    @ApiOperation(value="calculate cost",response=Double.class)
    @RequestMapping(value="/CalculateCost",method = RequestMethod.POST,produces="application/json")
    @Override
    public double CalculateCost(PortServiceOrder order) {
        return 0;
    }
}
