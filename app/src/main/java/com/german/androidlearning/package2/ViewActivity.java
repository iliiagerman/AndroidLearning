package com.german.androidlearning.package2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.german.androidlearning.R;

//implements View.OnClickListener
public class ViewActivity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        tvView = findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");

        tvView.setText("Your name is: " + fName + " " + lName);
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
//     super.onStart();
//     Log.d(TAG, "onStart");
//     }
//     @Override
//     protected void onPause(){
//     super.onPause();
//     Log.d(TAG, "onPause");
//     }
//     @Override
//     protected void onResume(){
//     super.onResume();
//     Log.d(TAG, "onResume");
//     }
//     @Override
//     protected void onRestart(){
//     super.onRestart();
//     Log.d(TAG, "onRestart");
//     }