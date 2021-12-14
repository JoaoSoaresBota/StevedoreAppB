package com.stevedores.stevedores.controller;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.Stevedores.Stevedores.dto.Order;
import com.Stevedores.Stevedores.dto.OrderStatus;
import com.Stevedores.Stevedores.dto.Pilot;
import com.Stevedores.Stevedores.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest()
public class RestTest {


    @Autowired
    private OrderService orderService;

    @BeforeAll
    public void repositoryCheck(){
        assertNotNull(orderService);
    }

    @Test
    public void crud(){
        //Testing if order can be saved and retrieved
        Order order = new Order();
        Pilot testPilot = new Pilot();

        List<UUID> changeRequests = new ArrayList<UUID>();

        testPilot.setPk(1L);
        order.setChangeRequests(changeRequests);
        order.setPilot(testPilot);
        order.setStatus(OrderStatus.PLACED);
        order.setReason("test");
        order.setPk(1);

        orderService.placeOrder(order);
        Order foundOrder = orderService.findByUUID(order.getUUID());

        assertThat(foundOrder.getUUID()).isEqualTo(order.getUUID());


    }


}
