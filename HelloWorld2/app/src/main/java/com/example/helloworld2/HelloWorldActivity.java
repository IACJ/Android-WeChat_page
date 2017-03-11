package com.example.helloworld2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HelloWorldActivity extends AppCompatActivity {

    Button goToNormalActivity;
    Button goToDialogActivity;
    Button replyMe;
    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Log.v("MainActivity","onCreate");
        goToDialogActivity=(Button)findViewById(R.id.goToDialogActivity);
        goToDialogActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HelloWorldActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });

        goToNormalActivity=(Button)findViewById(R.id.goToNormalActivity);
        goToNormalActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(HelloWorldActivity.this,NormalActivity .class);
                String message1="this is a message from HelloWorldActivity to Normal";
                intent1.putExtra("data",message1);
                startActivity(intent1);
            }
        });

        replyMe=(Button)findViewById(R.id.replyMe);
        replyMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HelloWorldActivity.this,replyActivity .class);
                String message1="this is a message from HelloWorldActivity to replyMe";
                intent.putExtra("data",message1);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivity","onRestart");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:{
                if (resultCode==RESULT_OK){
                    String message = data.getStringExtra("data");
                    Log.v("onActivityResult",message);
                }
            }
        }
    }
}
