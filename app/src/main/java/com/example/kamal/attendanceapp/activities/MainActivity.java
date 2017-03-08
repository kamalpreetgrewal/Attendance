package com.example.kamal.attendanceapp.activities;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.kamal.attendanceapp.R;
import com.example.kamal.attendanceapp.models.DrawerItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private DrawerLayout drawerLayout;
    private RecyclerView.Adapter adapter;
    private ActionBarDrawerToggle barDrawerToggle;
    private List<DrawerItem> navigationItemsList;

    public String HEADER_NAME = "Kamalpreet Grewal";
    public String HEADER_IMAGE = R.mipmap.ic_launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.layout.toolbar);
        setSupportActionBar(toolbar);
        navigationItemsList = new ArrayList<DrawerItem>();
    }
}
