package com.example.student.theapp;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.net.URL;

/**
 * Created by student on 2017. 10. 29..
 */

public class Data {
    private String URL;
    private int type;

    public void addData(String URL, int type){
        this.URL = URL;
        this.type=type;
    }


}
