package com.qvolver.qvolver.activities;

import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.qvolver.qvolver.R;
import com.qvolver.qvolver.fragments.MyEventsListFragment;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FrameLayout frame;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    switchFragment(1);
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame = findViewById(R.id.main_fragment_container);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getFragmentManager().beginTransaction().replace(R.id.main_fragment_container, new MyEventsListFragment()).commit();
    }

    public void switchFragment(int position){
        FragmentManager manager = this.getFragmentManager();
        switch (position){
            case 1:
                manager.beginTransaction().replace(R.id.main_fragment_container, new MyEventsListFragment()).commit();
                break;
        }
    }

}
