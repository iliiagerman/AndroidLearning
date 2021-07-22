package com.german.androidlearning.Lesons20_40.ActivityResult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.german.androidlearning.Lesons20_40.ActivityResult.ActivityResultAlign;
import com.german.androidlearning.Lesons20_40.ActivityResult.ActivityResultColor;
import com.german.androidlearning.R;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvText;
    Button btnColor;
    Button btnAlign;

    final int REQUEST_CODE_COLOR = 1;
    final int REQUEST_CODE_ALIGN = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvText = (TextView) findViewById(R.id.tvText);

        btnColor = (Button) findViewById(R.id.btnColor);
        btnAlign = (Button) findViewById(R.id.btnAlign);

        btnColor.setOnClickListener((View.OnClickListener) this);
        btnAlign.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnColor:
                intent = new Intent(this, ActivityResultColor.class);
                startActivityForResult(intent, REQUEST_CODE_COLOR);
                break;
            case R.id.btnAlign:
                intent = new Intent(this, ActivityResultAlign.class);
                startActivityForResult(intent, REQUEST_CODE_ALIGN);
                //
                //
                //
                //
                //
                //
                //
                //
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // запишем в лог значения requestCode и resultCode
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("myLogs", "requestCode = " + requestCode + ", resultCode = " + resultCode);
        // если пришло ОК
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_CODE_COLOR:
                    int color = data.getIntExtra("color", Color.WHITE);
                    tvText.setTextColor(color);
                    break;
                case REQUEST_CODE_ALIGN:
                    int align = data.getIntExtra("alignment", Gravity.LEFT);
                    tvText.setGravity(align);
                    break;
            }
            // если вернулось не ОК
        } else {
            Toast.makeText(this, "Wrong result", Toast.LENGTH_SHORT).show();
        }

    }
}