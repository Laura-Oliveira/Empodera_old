package com.empodera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerService(View view)
    {
        Intent registerServiceActivityObject = new Intent(this, RegisterServiceActivity.class);
        startActivity(registerServiceActivityObject);
    }

    public void searchWorker(View view)
    {
        Intent searchWorkerActivity = new Intent(this, SearchWorkerActivity.class);
        startActivity(searchWorkerActivity);
    }

    public void learnSubject(View view)
    {
        Intent learnSubjectActivityObject = new Intent(this, LearnSubjectActivity.class);
        startActivity(learnSubjectActivityObject);
    }
}
