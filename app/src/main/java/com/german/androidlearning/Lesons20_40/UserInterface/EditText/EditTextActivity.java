package com.german.androidlearning.Lesons20_40.UserInterface.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.R;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    Button editTextExsample1;
    Button editTextExsample2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editTextExsample1 = findViewById(R.id.editTextExsample1);
        editTextExsample2 = findViewById(R.id.editTextExsample2);
        editTextExsample1.setOnClickListener(this);
        editTextExsample2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.editTextExsample1:
                Intent intent = new Intent(this, EditTextExsampleActivity1.class);
                startActivity(intent);
                break;
            case R.id.editTextExsample2:
                Intent intent1 = new Intent(this, EditTextExsampleActivity2.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}