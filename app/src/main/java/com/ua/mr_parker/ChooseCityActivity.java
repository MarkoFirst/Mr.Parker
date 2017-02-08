package com.ua.mr_parker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);
    }

    public void chooseOnClick(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
