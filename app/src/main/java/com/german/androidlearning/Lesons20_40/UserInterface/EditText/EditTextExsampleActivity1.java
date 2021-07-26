package com.german.androidlearning.Lesons20_40.UserInterface.EditText;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;
import com.german.androidlearning.R;

public class EditTextExsampleActivity1 extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_exsample1);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}