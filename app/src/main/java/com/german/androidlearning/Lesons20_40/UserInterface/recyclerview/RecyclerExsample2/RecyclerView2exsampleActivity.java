package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerExsample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.german.androidlearning.R;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView2exsampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view2exsample);

        RecyclerView rv = findViewById(R.id.rv1111);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        List<Person> persons = new ArrayList<>();
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }
}
