package com.empodera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service);

        view = findViewById(R.id.screen_register_service);
        view.setBackgroundColor(getResources().getColor(R.color.color_background));
    }
}
