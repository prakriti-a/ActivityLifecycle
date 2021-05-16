package com.prakriti.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.i("RES","onCreate for ACTIVITY B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("RES","onResume for ACTIVITY B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("RES","onRestart for ACTIVITY B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("RES","onStart for ACTIVITY B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("RES","onPause for ACTIVITY B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("RES","onStop for ACTIVITY B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("RES","onDestroy for ACTIVITY B");
    }
}