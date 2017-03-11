package com.example.helloworld2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Intent intent = getIntent();
        String message2=intent.getStringExtra("data");
        Log.v("NormalActivity","NormalActivity get message");
        Log.v("NormalActivity",message2);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("NormalActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("NormalActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("NormalActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("NormalActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("NormalActivity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("NormalActivity","onRestart");
    }
}
