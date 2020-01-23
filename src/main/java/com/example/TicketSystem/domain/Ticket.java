package com.example.TicketSystem.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Event event;
    @ManyToOne(fetch = FetchType.EAGER)
    private Sector sector;
    private String seatNumber;
    private BigDecimal ticketCost;

    public Ticket() {
    }

    public Ticket(Event event, Sector sector, String seatNumber, BigDecimal ticketCost) {
        this.event = event;
        this.sector = sector;
        this.seatNumber = seatNumber;
        this.ticketCost = ticketCost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public BigDecimal getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(BigDecimal ticketCost) {
        this.ticketCost = ticketCost;
    }
}
