package com.example.anshulgoel.tryyyy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] fooods={"burger","pizza","chowmein"};
        ListAdapter anshuladapter = new customadapter(this,fooods);
        ListView listView = (ListView )findViewById(R.id.listview_id);
        listView.setAdapter(anshuladapter);
    }
}
