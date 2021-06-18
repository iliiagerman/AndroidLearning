package com.german.androidlearning.package2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.german.androidlearning.R;

//implements View.OnClickListener
public class MyActivity extends AppCompatActivity implements View.OnClickListener {

    Button qqq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        qqq = findViewById(R.id.qqq);
        qqq.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qqq:
                Intent intent2 = new Intent(this, MyActivity2.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        Log.d(TAG, "onDestroy");
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        Log.d(TAG, "onStop");
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.d(TAG, "onStart");
//    }
//    @Override
//    protected void onPause(){
//        super.onPause();
//        Log.d(TAG, "onPause");
//    }
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.d(TAG, "onResume");
//    }
//
//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        Log.d(TAG, "onRestart");
//    }
