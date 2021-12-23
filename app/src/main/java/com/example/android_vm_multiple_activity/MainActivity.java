package com.example.android_vm_multiple_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnAct);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}