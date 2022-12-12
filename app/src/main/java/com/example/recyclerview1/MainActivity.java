package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<model> modelList = new ArrayList<>();
    int []images = {R.drawable.ic_sun , R.drawable.ic_mecury , R.drawable.ic_venus , R.drawable.ic_earth
            , R.drawable.ic_mars , R.drawable.ic_jupiter ,R.drawable.ic_uranus, R.drawable.ic_saturn ,
            R.drawable.ic_blackhole, R.drawable.ic_supernova , R.drawable.ic_moon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
    }

    private void setup()
    {
        String [] pName  = getResources().getStringArray(R.array.names);
        String [] description = getResources().getStringArray(R.array.description);

        for ( int i = 0 ; i < 11  ; i ++)
        {
            modelList.add(new model(images[i] , pName[i] , description[i]));
            System.out.println("We have created the model for the planets");
        }
    }
}