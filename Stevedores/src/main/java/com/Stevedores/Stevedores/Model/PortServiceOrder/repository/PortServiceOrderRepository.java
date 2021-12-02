package com.Stevedores.Stevedores.Model.PortServiceOrder.repository;

import com.Stevedores.Stevedores.Model.PortServiceOrder.dto.PortServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortServiceOrderRepository extends JpaRepository<PortServiceOrder, Long> {
}
