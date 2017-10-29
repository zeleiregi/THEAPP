package com.example.student.theapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import static com.google.vr.sdk.widgets.pano.VrPanoramaView.Options.TYPE_STEREO_OVER_UNDER;


public class PanoActivity extends AppCompatActivity {

    private TextView textURL;
    private VrPanoramaView VrP;
    private String URL = "http://users.itk.ppke.hu/~matad/andes.jpg";
    private Button btnVid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pano);

        textURL = (TextView) findViewById(R.id.textURL);
        VrP = findViewById(R.id.vr_Panorama);
        final VrPanoramaView.Options VrPO = new VrPanoramaView.Options();
        VrPO.inputType = (TYPE_STEREO_OVER_UNDER);

        Glide.with(this).asBitmap().load(URL).into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, Transition<? super Bitmap>
                    transition) {
                VrP.loadImageFromBitmap(resource, VrPO);
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();
        VrP.resumeRendering();
    }

    @Override
    protected void onPause() {
        super.onPause();
        VrP.pauseRendering();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
