package com.qvolver.qvolver.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class User {

    @SerializedName("name")
    private String id;

    @SerializedName("userID")
    private String userId;

    private long accountCreated;
    private long lastLogin;

    @SerializedName("subscription")
    private List<String> games;

    @SerializedName("eventSubscription")
    private List<String> events;

    public User(){
        games = new ArrayList<>();
        events = new ArrayList<>();
    }

    public User(String id, String userId, long accountCreated, long lastLogin, String[] games, String[] events){
        this(id,userId,accountCreated,lastLogin,Arrays.asList(games),Arrays.asList(events));
    }

    public User(String id, String userId, long accountCreated, long lastLogin, List<String> games, List<String> events) {
        this.id = id;
        this.userId = userId;
        this.accountCreated = accountCreated;
        this.lastLogin = lastLogin;
        this.games = games;
        this.events = events;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(long accountCreated) {
        this.accountCreated = accountCreated;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
