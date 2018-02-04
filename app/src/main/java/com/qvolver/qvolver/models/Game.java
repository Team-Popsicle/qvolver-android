package com.qvolver.qvolver.models;

import android.net.Uri;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class Game {

    private String name;
    private String displayName;
    private String[] platforms;
    private Uri imgURL;
    private String[] events;

    public Game(){

    }

    public Game(String name, String displayName, String[] platforms, String imgURL, String[] events) {
        this(name,displayName,platforms,Uri.parse(imgURL),events);
    }

    public Game(String name, String displayName, String[] platforms, Uri imgURL, String[] events) {
        this.name = name;
        this.displayName = displayName;
        this.platforms = platforms;
        this.imgURL = imgURL;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public Uri getImgURL() {
        return imgURL;
    }

    public void setImgURL(Uri imgURL) {
        this.imgURL = imgURL;
    }

    public String[] getEvents() {
        return events;
    }

    public void setEvents(String[] events) {
        this.events = events;
    }
}
