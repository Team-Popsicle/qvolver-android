package com.qvolver.qvolver.models;

import java.util.Date;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class Event {

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    private String game;
    private String eventName;
    private String eventDescription;
    private Date startDate;
    private Date endDate;

    public Event(){

    }

    public Event(String game, String eventName, String eventDescription, Date startDate, Date endDate){
        this.game = game;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
