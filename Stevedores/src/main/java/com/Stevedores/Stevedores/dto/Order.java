package com.Stevedores.Stevedores.dto;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pk;
    @GeneratedValue(generator = "UUID")
    private UUID uuid;

    private OrderStatus status;

    private String reason;

    private double fare;

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

    @OneToOne(cascade = {CascadeType.ALL})
    private Ship ship;

    @OneToOne(cascade = {CascadeType.ALL})
    private Pilot pilot;

    @OneToOne(cascade = {CascadeType.ALL})
    private Berth berth;

    @Transient
    private final double[] fares = { 311.85, 589.23, 189.32 };


    public Order() {

    }



    public void setPk(Long id) {
        this.pk = id;
    }

    @Id
    public Long getPk() {
        return pk;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDayOfArrival() {
        return dayOfArrival;
    }

    public void setDayOfArrival(LocalDateTime dayOfArrival) {
        this.dayOfArrival = dayOfArrival;
    }

    public LocalDateTime getAllocatedStart() {
        return allocatedStart;
    }

    public void setAllocatedStart(LocalDateTime allocatedStart) {
        this.allocatedStart = allocatedStart;
    }

    public LocalDateTime getAllocatedEnd() {
        return allocatedEnd;
    }

    public void setAllocatedEnd(LocalDateTime allocatedEnd) {
        this.allocatedEnd = allocatedEnd;
    }

    public List<UUID> getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(List<UUID> changeRequests) {
        this.changeRequests = changeRequests;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Berth getBerth() {
        return berth;
    }

    public void setBerth(Berth berth) {
        this.berth = berth;
    }

    public double[] getFares() {
        return fares;
    }

    @Override
    public String toString() {
        String orderDateString = orderDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        String dayOfArrivalString = dayOfArrival.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String allocatedStartString = "";
        String allocatedEndString = "";

        if (allocatedStart != null && allocatedEndString != null) {
            allocatedStartString = allocatedStart.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            allocatedEndString = allocatedEnd.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        }

        return "Order [allocatedStart=" + allocatedStartString + ", allocatedEnd=" + allocatedEndString + ", berth=" + berth + ", pk=" + pk
                + ", uuid=" + uuid + ", orderDate=" + orderDateString + ", pilot=" + pilot + ", dayOfArrival=" + dayOfArrivalString
                + ", ship=" + ship + ", status=" + status.name() + ", reason=" + reason + ", fare=" + fare + "]";
    }
}
