package com.Stevedores.Stevedores.service;

import com.Stevedores.Stevedores.dao.OrderDAO;
import com.Stevedores.Stevedores.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderDAO orderDao;

    public Order placeOrder(Order order){
        return orderDao.save(order);
    }

    public Order findByUUID(UUID uuid){
        return orderDao.findByUUID(uuid);
    }

}
