package com.example.TicketSystem.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.Period;
import java.time.ZonedDateTime;

@Component
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    private EventType eventType;
    private String name;
    private ZonedDateTime dateOfEvent;
    @ManyToOne(fetch = FetchType.EAGER)
    private Stadium stadiumOfEvent;
    private Period periodWhenStadiumIsBusy;
    @ManyToOne(fetch = FetchType.EAGER)
    private Manager eventManager;

    public Event() {
    }

    public Event(EventType eventType, String name, ZonedDateTime dateOfEvent, Stadium stadiumOfEvent, Period periodWhenStadiumIsBusy, Manager eventManager) {
        this.eventType = eventType;
        this.name = name;
        this.dateOfEvent = dateOfEvent;
        this.stadiumOfEvent = stadiumOfEvent;
        this.periodWhenStadiumIsBusy = periodWhenStadiumIsBusy;
        this.eventManager = eventManager;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(ZonedDateTime dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public Stadium getStadiumOfEvent() {
        return stadiumOfEvent;
    }

    public void setStadiumOfEvent(Stadium stadiumOfEvent) {
        this.stadiumOfEvent = stadiumOfEvent;
    }

    public Period getPeriodWhenStadiumIsBusy() {
        return periodWhenStadiumIsBusy;
    }

    public void setPeriodWhenStadiumIsBusy(Period periodWhenStadiumIsBusy) {
        this.periodWhenStadiumIsBusy = periodWhenStadiumIsBusy;
    }

    public Manager getEventManager() {
        return eventManager;
    }

    public void setEventManager(Manager eventManager) {
        this.eventManager = eventManager;
    }
}
