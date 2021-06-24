package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Package2.ProstoiBrauser;

import static com.german.androidlearning.R.id.button1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent = new Intent(this, ProstoiBrauser.class);
                startActivity(intent);
                break;
            default:
            break;
        }
    }
}