package com.qvolver.qvolver.web;

import com.qvolver.qvolver.models.Event;
import com.qvolver.qvolver.models.Game;
import com.qvolver.qvolver.models.User;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class MockResponse {

    private User user;
    private Game[] games;
    private Event[] events;

    public String getUser(){
        return "{name:'1000000',userID:'HappyGilmore',accountCreated:1517718288,lastLogin:1517718288,subscription:['1000000','1000001'],eventSubscription:['1000000','1000001']}";
    }

    public String getUserEvents(){
        return "[{name:'1000000',event_name:'FWOTD',Description:'First Win of the Day',Event_start:1517718288,Event_end:1517718288},{name:'1000001',event_name:'Valentines',Description:'Valentines Event',Event_start:1517718288,Event_end:1517718288}]";
    }
}
