package com.german.androidlearning.Lesons20_40.UserInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Lesons20_40.Preferences;
import com.german.androidlearning.R;

public class UserInterface extends AppCompatActivity implements View.OnClickListener {

    Button buttoN1;
    Button buttoN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        buttoN1 = findViewById(R.id.buttoN1);
        buttoN2 = findViewById(R.id.buttoN2);
        buttoN1.setOnClickListener(this);
        buttoN2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttoN1:
                Intent intent1_1 = new Intent(this, LinearLayout.class);
                startActivity(intent1_1);
                break;
            case R.id.buttoN2:
                Intent intent1_2 = new Intent(this, FrameLayout.class);
                startActivity(intent1_2);
                break;
            default:
                break;
        }

    }
}