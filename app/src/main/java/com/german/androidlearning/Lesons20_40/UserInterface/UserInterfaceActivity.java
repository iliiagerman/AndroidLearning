package com.german.androidlearning.Lesons20_40.UserInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.R;

public class UserInterfaceActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttoN1;       //   LinearLayout
    Button buttoN2;       //   FrameLayout
    Button buttoN3;       //   ConsrtraintsLayout
    Button buttoN4;       //   TextView которая может нажиматся

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        buttoN1 = findViewById(R.id.buttoN1);
        buttoN2 = findViewById(R.id.buttoN2);
        buttoN3 = findViewById(R.id.buttoN3);
        buttoN4 = findViewById(R.id.buttoN4);

        buttoN1.setOnClickListener(this);
        buttoN2.setOnClickListener(this);
        buttoN3.setOnClickListener(this);
        buttoN4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttoN1:
                Intent intent1_1 = new Intent(this, LinearLayoutActivity.class);
                startActivity(intent1_1);
                break;
            case R.id.buttoN2:
                Intent intent1_2 = new Intent(this, FrameLayoutActivity.class);
                startActivity(intent1_2);
                break;
            case R.id.buttoN3:
                Intent intent1_3 = new Intent(this, ConsrtraintsLayoutActivity.class);
                startActivity(intent1_3);
                break;
            case R.id.buttoN4:
                Intent intent1_4 = new Intent(this, TextViewOnClickActivity.class);
                startActivity(intent1_4);
                break;
            default:
                break;
        }

    }
}