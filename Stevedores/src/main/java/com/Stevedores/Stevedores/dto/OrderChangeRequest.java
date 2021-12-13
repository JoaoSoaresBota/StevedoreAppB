package com.Stevedores.Stevedores.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class OrderChangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uuid;

    @Column(name="changeRequestDate", columnDefinition="TIMESTAMP")
    private LocalDateTime changeRequestDate;

    @Column(name="dayOfArrival", columnDefinition="TIMESTAMP")
    private LocalDate dayOfArrival;
    private String reason;
    private OrderChangeRequestStatus status;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
