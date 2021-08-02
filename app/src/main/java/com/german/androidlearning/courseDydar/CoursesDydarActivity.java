package com.german.androidlearning.courseDydar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.german.androidlearning.R;
import com.german.androidlearning.courseDydar.adapter.CategoryAdapter;
import com.german.androidlearning.courseDydar.adapter.CourseAdapter;
import com.german.androidlearning.courseDydar.model.Category;
import com.german.androidlearning.courseDydar.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CoursesDydarActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCoursesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityddd_courses_dydar);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));

        setCategoryRecycler(categoryList);

        courseList.add(new Course(1, "recycler_view2", "Профессия Java\nразработчик", "1 Января", "начальный", "#424345", "test", 1));
        courseList.add(new Course(2, "python", "Профессия Python\nразработчик", "10 Января", "начальный", "#9FA52D", "test", 2));
        courseList.add(new Course(2, "c#", "Профессия C#\nразработчик", "15 Января", "начальный", "#9FA52D", "test", 1));

        fullCoursesList.addAll(courseList);

        setCourseRecycler(courseList);

    }

    public void openShoppingCart(View view) {
        Intent intent = new Intent(this, OrderPageActivity.class);
        startActivity(intent);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);

    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public static void showCoursesByCategory(int category) {

        courseList.clear();
        courseList.addAll(fullCoursesList);

        List<Course> filterCourse = new ArrayList<>();

        for (Course c : courseList) {
            if (c.getCategory() == category)
                filterCourse.add(c);
        }

        courseList.clear();
        courseList.addAll(filterCourse);
        courseAdapter.notifyDataSetChanged();
    }
}