package com.qvolver.qvolver.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.qvolver.qvolver.R;
import com.qvolver.qvolver.adapters.MyEventsListAdapter;
import com.qvolver.qvolver.models.Event;
import com.qvolver.qvolver.web.QvolverApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class MyEventsListFragment extends ListFragment {
    QvolverApi api;

    public MyEventsListFragment(){
        api = QvolverApi.getApi();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Event> events = getEvents();
        MyEventsListAdapter adapter = new MyEventsListAdapter(getContext(), events);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_my_events, container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getContext(),Integer.toString(position), Toast.LENGTH_SHORT).show();
    }

    public List<Event> getEvents(){
        return api.getUserEvents("");
    }

}
