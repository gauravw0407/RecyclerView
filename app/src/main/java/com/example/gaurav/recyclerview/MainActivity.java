package com.example.gaurav.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layout;
    String[] names = {"Ae Dil Hai Mushkil","Darkhaast","Galiyaan","Hai Koi","Main Rahoon","Phir Kabhi","Tay Hai","Tere Sang Yaara","Teri Khair Mangdi","Tum Hi Ho"};
    String[] artists = {"Pritam","Arijit Singh","Ankit Tiwari","Gajendra Verma","Armaan Malik","Arijit Singh","Ankit Tiwari","Atif Aslam","Bilal Saeed","Arijit Singh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv);
        adapter = new songlist(names,artists);
        layout = new LinearLayoutManager(this);
        rv.setLayoutManager(layout);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }
}
