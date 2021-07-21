package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.german.androidlearning.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView numbersList;
    //создаем новый адаптер
    private NumbersAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclew_view);

        numbersList = findViewById(R.id.rv_numbers);

        // ниже укажем что наш RecyclerView принимает LL (упорядовачиние) то есть он
        // может cпокойно принимать разные списки как по вертикали так и по горизонтали
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(layoutManager);

        //дальше мы указываем что мы за ренее знает разимер нащего списка (true)
        // это x нужно для лучей эффективности
        numbersList.setHasFixedSize(true);

        //связываем наш адаптер с recyclerview
        //в аргументе сколь элементов будут в нашем списке
        numbersAdapter = new NumbersAdapter(100, this);
        numbersList.setAdapter(numbersAdapter);


    }
}