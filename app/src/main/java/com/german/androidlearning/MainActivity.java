package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.german.androidlearning.Lesons20_40.PreferencesActivity;
import com.german.androidlearning.Lesons20_40.ProstoiBrauserActivity;
import com.german.androidlearning.Lesons20_40.ActivityResult.ResultActivity;
import com.german.androidlearning.Lesons20_40.SQLifeActivity;
import com.german.androidlearning.Lesons20_40.UserInterface.UserInterfaceActivity;
import com.german.androidlearning.courseDydar.CoursesDydarActivity;
import com.german.androidlearning.lesons100_200.ViewPagerLesson125;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;    // курс по урокам Дударя
    Button button1;   // простой браузер
    Button button2;   // Preferens
    Button button3;   //
    Button button4;   // OnActivityResult
    Button button5;   // UI(User Interface)
    Button button6;   //ViewPager
    Button button7;   //
    Button button8;   //
    Button button9;   //









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent0 = new Intent(this, CoursesDydarActivity.class);
                startActivity(intent0);
                break;
            case R.id.button1:
                Intent intent = new Intent(this, ProstoiBrauserActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(this, PreferencesActivity.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, SQLifeActivity.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(this, ResultActivity.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(this, UserInterfaceActivity.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(this, ViewPagerLesson125.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }
}