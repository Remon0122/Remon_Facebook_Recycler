package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView contactRecycler;
    ContactRecyclerAdapter adapter;
    List<Content> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecycler = findViewById(R.id.rc_contant);
        contacts = new ArrayList<>();
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        contacts.add(new Content(0,"Mohamed","Busy",R.drawable.baseline_person_24,"25m"));
        contacts.add(new Content(0,"Remon","Busy",R.drawable.baseline_person_24,"20m"));
        contacts.add(new Content(0,"Ahmed","Busy",R.drawable.baseline_person_24,"50m"));
        adapter = new ContactRecyclerAdapter(contacts);
        contactRecycler.setAdapter(adapter);
    }
    private void CreateContext(){
        contacts = new ArrayList<>();

        for (int i = 0;i < 10000 ; i++){
            contacts.add(new Content(0,"contant    " + i,"Busy",R.drawable.baseline_person_24,"20m"));
        }
    }
}