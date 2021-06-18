package com.german.androidlearning.package2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.R;

public class MyActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button qqqq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        qqqq = findViewById(R.id.qqqq);
        qqqq.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qqqq:
                Intent intent3 = new Intent(this, MyActivity3.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}