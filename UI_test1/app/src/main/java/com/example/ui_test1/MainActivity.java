package com.example.ui_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.btn_textview)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn_edittext)).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch  (v.getId()){
            case R.id.btn_textview:{
                Intent intent = new Intent(MainActivity.this,TextviewActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_edittext:{
                Intent intent = new Intent(MainActivity.this,EdittextActivity.class);
                startActivity(intent);
                break;
            }

            default:
        }
    }
}
