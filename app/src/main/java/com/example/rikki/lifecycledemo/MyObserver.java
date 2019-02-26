package com.example.rikki.lifecycledemo;


import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyObserver implements LifecycleObserver {

    private final String TAG = "MyObserver";
    private Context context;

    public MyObserver(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(LifecycleOwner source, Lifecycle.Event event){
        showText("Event = " + event.name() + "; state = " + source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner source){
        showText(source.getLifecycle().getCurrentState().name());
    }

    public void showText(String msg){
        Log.e(TAG, msg);
    }
}
