package com.qvolver.qvolver.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qvolver.qvolver.models.Event;
import com.qvolver.qvolver.models.User;

import java.sql.Array;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class QvolverApi {

    static QvolverApi instance;
    private MockResponse mockResponse;
    private Gson gson;

    public static QvolverApi getApi(){
        if(instance == null){
            instance = new QvolverApi();
        }
        return instance;
    }

    private QvolverApi(){
        this.mockResponse = new MockResponse();
        this.gson = new GsonBuilder().create();
    }

    public User getUser(String userId){
        String response = mockResponse.getUser();
        return gson.fromJson(response,User.class);
    }

    public List<Event> getUserEvents(String userId) {
        String response = mockResponse.getUserEvents();
        System.out.println("Getting User events");
        return Arrays.asList(gson.fromJson(response, Event[].class));
    }
}
