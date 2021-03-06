package com.german.androidlearning.Lesons20_40.UserInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Lesons20_40.UserInterface.EditText.EditTextActivity;
import com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerViewActivity;
import com.german.androidlearning.R;

public class UserInterfaceActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttoN1;       //   LinearLayout
    Button buttoN2;       //   FrameLayout
    Button buttoN3;       //   ConsrtraintsLayout
    Button buttoN4;       //   TextView которая может нажиматся и EditText
    Button buttoN5;       //   RecyclerView
    Button buttoN6;       //   Toolbar
    Button buttoN7;       //   editText
    Button buttoN8;       //   MenuDrawer


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        buttoN1 = findViewById(R.id.buttoN1);
        buttoN2 = findViewById(R.id.buttoN2);
        buttoN3 = findViewById(R.id.buttoN3);
        buttoN4 = findViewById(R.id.buttoN4);
        buttoN5 = findViewById(R.id.buttoN5);
        buttoN6 = findViewById(R.id.buttoN6);
        buttoN7 = findViewById(R.id.buttoN7);
        buttoN8 = findViewById(R.id.buttoN7);

        buttoN1.setOnClickListener(this);
        buttoN2.setOnClickListener(this);
        buttoN3.setOnClickListener(this);
        buttoN4.setOnClickListener(this);
        buttoN5.setOnClickListener(this);
        buttoN6.setOnClickListener(this);
        buttoN7.setOnClickListener(this);
        buttoN8.setOnClickListener(this);
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
            case R.id.buttoN5:
                Intent intent1_5 = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent1_5);
                break;
            case R.id.buttoN6:
                Intent intent1_6 = new Intent(this, ToolbarActivity.class);
                startActivity(intent1_6);
                break;
            case R.id.buttoN7:
                Intent intent1_7 = new Intent(this, EditTextActivity.class);
                startActivity(intent1_7);
                break;
            case R.id.buttoN8:
                Intent intent1_8 = new Intent(this, EditTextActivity.class);
                startActivity(intent1_8);
                break;
            default:
                break;
        }

    }
}