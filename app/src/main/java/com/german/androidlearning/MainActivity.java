package com.german.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
//тут то что часто надо
//implements View.OnClickListener


public class MainActivity extends AppCompatActivity {
    String[] name = new String[]{ "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
            "Костя", "Игорь" ,"Dima", "Наташа", "Света","Фрося","Виталик"};
    String[] position = { "Программер", "Бухгалтер", "Программер",
            "Программер", "Бухгалтер", "Директор", "Программер", "Охранник" ,"трейни", "Уборщица","медик","Секретарь", "Босс"};
    int salary[] = { 13000, 10000, 13000, 13000, 10000, 15000, 13000, 8000 , 0, 5000, 10000, 20000, 80000};

    int[] colors = new int[2];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");

        LinearLayout linLayout = findViewById(R.id.linLayout);
        LayoutInflater ltInflater = getLayoutInflater();

        for (int i = 0; i < name.length; i++) {
            View item = ltInflater.inflate(R.layout.item, linLayout, false);
            TextView tvName = item.findViewById(R.id.tvName);
            tvName.setText(name[i]);
            TextView tvPosition = item.findViewById(R.id.tvPosition);
            tvPosition.setText("Должность: " + position[i]);
            TextView tvSalary = item.findViewById(R.id.tvSalary);
            tvSalary.setText("Оклад: " + String.valueOf(salary[i]));
            item.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);
            linLayout.addView(item);

        }
    }
}