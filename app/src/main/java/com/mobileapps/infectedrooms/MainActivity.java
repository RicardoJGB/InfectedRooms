package com.mobileapps.infectedrooms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public class Room{

        public final boolean isInfected;
        public boolean visited=false;
        Room(boolean infected){
            isInfected=infected;
        }
//A HUNDRED ROOMS

        int [][] floor = new int [10][10];

//CANT DO THIS

        public Boolean isOutbreak (Room [][] floor){
            return null;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
