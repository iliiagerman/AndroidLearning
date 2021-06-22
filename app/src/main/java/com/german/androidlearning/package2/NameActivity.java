package com.german.androidlearning.package2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.german.androidlearning.R;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {


    EditText etName;
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);
        etName = findViewById(R.id.etName);
        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", etName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}