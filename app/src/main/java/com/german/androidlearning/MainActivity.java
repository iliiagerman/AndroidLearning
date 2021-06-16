package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.german.androidlearning.package2.MyActivity;
//тут то что часто надо
//implements View.OnClickListener


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button eww;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eww = findViewById(R.id.eww);
        eww.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eww:
                Intent intent = new Intent(this, MyActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}