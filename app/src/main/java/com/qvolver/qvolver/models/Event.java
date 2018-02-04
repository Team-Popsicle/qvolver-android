package com.qvolver.qvolver.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class Event {

    @SerializedName("name")
    private String gameId;

    @SerializedName("event_name")
    private String eventName;

    @SerializedName("Description")
    private String eventDescription;

    @SerializedName("Event_start")
    private long startDate;

    @SerializedName("Event_end")
    private long endDate;

    public Event(){

    }

    public Event(String gameId, String eventName, String eventDescription, long startDate, long endDate){
        this.gameId = gameId;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

}
