package com.example.helloworld2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class replyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        Log.v("replyActivity","onCreate");
        Intent intent = getIntent();
        String message2=intent.getStringExtra("data");
        Log.v("replyActivity","replyActivity get message");
        Log.v("replyActivity",message2);
        intent.putExtra("data","message from replyActivity");
        setResult(RESULT_OK,intent);
        finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("replyActivity","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("replyActivity","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("replyActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("replyActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("replyActivity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("replyActivity","onRestart");
    }
}
