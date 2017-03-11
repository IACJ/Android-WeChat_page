package com.example.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Log.v("DialogActivity","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("DialogActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("DialogActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("DialogActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("DialogActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DialogActivity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("DialogActivity","onRestart");
    }
}
