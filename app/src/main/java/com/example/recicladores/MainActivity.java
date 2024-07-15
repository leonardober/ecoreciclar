package com.example.recicladores;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
/*
        val btn:Button= findViewById(R.id.button)
         btn.setOnClickListener{
            val intent: Intent(this, menu2:: class.java)
        startActivity(intent);
        }
        */

    }
}