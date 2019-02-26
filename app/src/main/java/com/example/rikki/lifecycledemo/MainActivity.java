package com.example.rikki.lifecycledemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MyObserver myObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myObserver = new MyObserver(this);
        getLifecycle().addObserver(myObserver);
    }

    @Override
    protected void onStop() {
        getLifecycle().removeObserver(myObserver);
        super.onStop();
    }

}
