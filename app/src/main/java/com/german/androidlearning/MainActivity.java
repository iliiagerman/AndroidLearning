package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.german.androidlearning.package2.ViewActivity;
//тут то что часто надо
//implements View.OnClickListener


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etFName;
    EditText etLName;

    Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("fname", etFName.getText().toString());
        intent.putExtra("lname", etLName.getText().toString());
        startActivity(intent);
    }
}
