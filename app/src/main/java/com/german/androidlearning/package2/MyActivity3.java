package com.german.androidlearning.package2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.german.androidlearning.R;

public class MyActivity3 extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my3);

        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkBox:
                Intent intent4 = new Intent(this, MyActivity4.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}