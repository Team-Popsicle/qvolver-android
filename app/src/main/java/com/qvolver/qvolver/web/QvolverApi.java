package com.qvolver.qvolver.web;

import com.qvolver.qvolver.models.Event;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class QvolverApi {

    static QvolverApi instance;

    public static QvolverApi getApi(){
        if(instance == null){
            instance = new QvolverApi();
        }
        return instance;
    }

    public List<Event> getUserEvents(String userId){
        List<Event> events = new ArrayList<>();
        Event event1 = new Event("League of Legends","FWOTD","First Win of the Day", new Date(), new Date());
        Event event2 = new Event("Fate Grand Order","Valentines","Valentine's Event", new Date(), new Date());
        Event event3 = new Event("PUBG","Crate Reset","Crate Availability Rollover", new Date(), new Date());
        events.add(event1);
        events.add(event2);
        events.add(event3);
        return events;
    }
}
