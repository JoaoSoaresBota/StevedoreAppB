package com.Stevedores.Stevedores.Model.PortServiceOrder.implementation;

import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortOrderStatus;
import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortServiceOrder;
import com.Stevedores.Stevedores.Model.PortServiceOrder.repository.PortServiceOrderRepository;
import com.Stevedores.Stevedores.Model.PortServiceOrder.service.IServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceOrderImpl {

    @Autowired
    private  PortServiceOrderRepository orderRepository;


    public PortServiceOrder CreateNewServiceOrder(PortServiceOrder order) {
        //Check for conditions regarding availability (time, resources, payment here)
        //Then set status
        //Then return
        order.setOrderStatus(PortOrderStatus.PLACED);
        orderRepository.save(order);
        return order;
    }


}
