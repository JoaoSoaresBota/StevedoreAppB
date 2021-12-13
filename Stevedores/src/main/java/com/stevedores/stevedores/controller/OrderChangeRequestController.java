package com.Stevedores.Stevedores.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;



//TODO implement all necessary methods/calls

@Slf4j
@Api(value="/api/orderChangeRequest",produces="application/json")
@RestController
@RequestMapping("/api/orderChangeRequest")
public class OrderChangeRequestController {

    //Currently only echoes
    //TODO implement
    @GetMapping(value="/{uuid}",produces = "application/json")
    @ApiOperation("Return an orderChangeRequest by UUID.")
    public String FindOrderByUUID(@PathVariable UUID uuid){
        log.info("GET: /api/orderChangeRequest/{uuid} called, uuid="+uuid);
        return uuid.toString();
    }


}
