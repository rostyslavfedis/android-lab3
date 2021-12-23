package com.example.android_vm_multiple_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.util.Log;
import android.view.View;

import android.widget.Button;

import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    String s = "відповідь прийнято";
    Button btn;
    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.btnActTwo);
        btn.setOnClickListener(this);
        Log.d(TAG, "onCreate(): MainActivity2");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): MainActivity2");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): MainActivity2");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): MainActivity2");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): MainActivity2");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): MainActivity2");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): MainActivity2");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void addPointA(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointB(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointC(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        scoreView.setText(String.valueOf(s));
    }
}