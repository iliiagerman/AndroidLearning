package com.german.androidlearning.package2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.R;

public class MyActivity4 extends AppCompatActivity implements View.OnClickListener {
Button qwer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my4);
        qwer= findViewById(R.id.qwer);
        qwer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qwer:
                Intent intent = new Intent(this, MyActivity5.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}