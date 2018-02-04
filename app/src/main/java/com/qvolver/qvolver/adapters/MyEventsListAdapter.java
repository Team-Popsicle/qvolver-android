package com.qvolver.qvolver.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qvolver.qvolver.R;
import com.qvolver.qvolver.models.Event;

import junit.framework.Test;

import java.util.List;

/**
 * Created by banexelphir on 2/3/2018.
 */

public class MyEventsListAdapter extends BaseAdapter {

    private List<Event> eventList;
    private Context context;

    public MyEventsListAdapter(Context context, List<Event> eventList){
        this.context = context;
        this.eventList = eventList;
    }

    @Override
    public int getCount() {
        return eventList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EventViewHolderItem viewHolderItem;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item_event, parent, false);

            viewHolderItem = new EventViewHolderItem();
            viewHolderItem.container = convertView.findViewById(R.id.item_event_container);
            viewHolderItem.eventName = convertView.findViewById(R.id.item_event_name);
            viewHolderItem.eventDescription = convertView.findViewById(R.id.item_event_description);
            viewHolderItem.eventGame = convertView.findViewById(R.id.item_event_game);
            viewHolderItem.position = position;

            convertView.setTag(viewHolderItem);
        }else{
            viewHolderItem = (EventViewHolderItem) convertView.getTag();
        }

        Event event = this.eventList.get(position);
        viewHolderItem.eventName.setText(event.getEventName());
        viewHolderItem.eventDescription.setText(event.getEventDescription());
        viewHolderItem.eventGame.setText(event.getGameId());

        return convertView;
    }

    @Override
    public boolean isEmpty() {
        return eventList.isEmpty();
    }

    static class EventViewHolderItem {
        RelativeLayout container;
        TextView eventName;
        TextView eventDescription;
        TextView eventGame;
        int position;
    }
}
