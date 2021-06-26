package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Lesons20_40.Preferences;
import com.german.androidlearning.Lesons20_40.ProstoiBrauser;
import com.german.androidlearning.Lesons20_40.SQLife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent = new Intent(this, ProstoiBrauser.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(this, Preferences.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, SQLife.class);
                startActivity(intent3);
                break;
            default:
            break;
        }
    }
}