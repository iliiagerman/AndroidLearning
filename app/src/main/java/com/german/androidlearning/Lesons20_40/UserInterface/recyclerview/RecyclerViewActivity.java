package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerExample1.RecyclerViewExampleActivity;
import com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerExample2.RecyclerView2exampleActivity;
import com.german.androidlearning.R;

public class RecyclerViewActivity extends AppCompatActivity implements View.OnClickListener{

    Button rv1;
    Button rv2;
    Button rv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclew_view);

        rv1 = findViewById(R.id.rv1);
        rv2 = findViewById(R.id.rv2);
        rv3 = findViewById(R.id.rv3);
        rv1.setOnClickListener(this);
        rv2.setOnClickListener(this);
        rv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rv1:
                Intent intent = new Intent(this, RecyclerViewExampleActivity.class);
                startActivity(intent);
                break;
            case R.id.rv2:
                Intent intent1 = new Intent(this, RecyclerView2exampleActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}