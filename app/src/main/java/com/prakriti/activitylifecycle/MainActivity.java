package com.prakriti.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button Activity_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("RES","onCreate for MAIN ACTIVITY");
        Activity_B=findViewById(R.id.MainBtn);
    }

    public void doSomething(View v) {
        Intent i=new Intent(this, ActivityB.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("RES","onResume for MAIN ACTIVITY");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("RES","onRestart for MAIN ACTIVITY");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("RES","onStart for MAIN ACTIVITY");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("RES","onPause for MAIN ACTIVITY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("RES","onStop for MAIN ACTIVITY");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("RES","onDestroy for MAIN ACTIVITY");
    }
}