package com.example.student.theapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    protected Class<Data>
    protected String URL;
    protected int type;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAdapter = new MyAdapter();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(myAdapter);

        List<Data> data =new ArrayList<>():


        if(data.get(position).gettype()=0){
            Intent intentP = new Intent(getApplicationContext(), VideoActivity.class);
            intentP.putExtra(URL, data.get(position))
            startActivity(intentP);
        }else{
            Intent intentV = new Intent(getApplicationContext(), VideoActivity.class);
            startActivity(intentV);
        }

        public void addData(String URL, int type){
            data.URL = URL;
            data.type=type;
        }

    }

}
