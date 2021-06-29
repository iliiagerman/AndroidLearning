package com.german.androidlearning.Lesons20_40.UserInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.german.androidlearning.R;

public class TextViewOnClickActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView1;     // текс который можна нажать и перейти в другое активити
    TextView textView2;     // повтор

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_on_click);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView1);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                Intent intent1_4_1 = new Intent(this, LinearLayoutActivity.class);
                startActivity(intent1_4_1);
                break;
            case R.id.textView2:
                Intent intent1_4_2 = new Intent(this, FrameLayoutActivity.class);
                startActivity(intent1_4_2);
                break;
        }
    }
}