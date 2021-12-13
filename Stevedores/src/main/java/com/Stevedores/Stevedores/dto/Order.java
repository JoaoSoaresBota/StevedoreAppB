package com.Stevedores.Stevedores.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @GeneratedValue(generator = "UUID")
    private UUID uuid;

    private String reason;

    @Column(name="orderDate", columnDefinition="TIMESTAMP")
    private LocalDateTime orderDate;

    @Column(name="dayOfArrival", columnDefinition="TIMESTAMP")
    private LocalDateTime dayOfArrival;

    @Column(name="allocatedStart", columnDefinition="TIMESTAMP")
    private LocalDateTime allocatedStart;

    @Column(name="allocatedEnd", columnDefinition="TIMESTAMP")
    private LocalDateTime allocatedEnd;

    @ElementCollection
    private List<UUID> changeRequests;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
