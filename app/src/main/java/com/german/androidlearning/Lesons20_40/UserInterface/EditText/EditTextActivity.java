package com.german.androidlearning.Lesons20_40.UserInterface.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.R;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    Button editTextExample1;
    Button editTextExample2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editTextExample1 = findViewById(R.id.editTextExample1);
        editTextExample2 = findViewById(R.id.editTextExample2);
        editTextExample1.setOnClickListener(this);
        editTextExample2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.editTextExample1:
                Intent intent = new Intent(this, EditTextExampleActivity1.class);
                startActivity(intent);
                break;
            case R.id.editTextExample2:
                Intent intent1 = new Intent(this, EditTextExampleActivity2.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}