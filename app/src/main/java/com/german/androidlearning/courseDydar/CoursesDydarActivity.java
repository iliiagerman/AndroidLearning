package com.german.androidlearning.courseDydar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.german.androidlearning.R;
import com.german.androidlearning.courseDydar.adapter.CategoryAdapter;
import com.german.androidlearning.courseDydar.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CoursesDydarActivity extends AppCompatActivity {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityddd_courses_dydar);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(1, "Сайты"));
        categoryList.add(new Category(1, "Языки"));
        categoryList.add(new Category(1, "Прочее"));

        setCategoryRecycler(categoryList);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}