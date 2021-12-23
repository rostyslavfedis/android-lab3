package com.example.android_vm_multiple_activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{

    String s = "відповідь прийнято";
    Button btn;
    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn = findViewById(R.id.btnActFive);
        btn.setOnClickListener(this);
        Log.d(TAG, "onCreate(): MainActivity5");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): MainActivity5");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): MainActivity5");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): MainActivity5");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): MainActivity5");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): MainActivity5");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): MainActivity5");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActFive:
                Intent intent = new Intent(this, MainActivity6.class);
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