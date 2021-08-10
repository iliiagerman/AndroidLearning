 package com.german.androidlearning.courseDydar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.german.androidlearning.R;
import com.german.androidlearning.courseDydar.model.Order;

public class CoursePageActivity extends AppCompatActivity {

//    ImageView addcorsina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityddd_course_page);

        ConstraintLayout courseBg = findViewById(R.id.coursePageBg);
//        addcorsina = findViewById(R.id.addcorsina);
        ImageView courseImage = findViewById(R.id.coursePageImage);
        TextView courseTitle = findViewById(R.id.coursePageTitle);
        TextView courseDate = findViewById(R.id.coursePageDate);
        TextView courseLevel = findViewById(R.id.coursePageLevel);
        TextView courseText = findViewById(R.id.coursePageText);

        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg",0));
        courseImage.setImageResource(getIntent().getIntExtra("courseImage",0));
        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
        courseDate.setText(getIntent().getStringExtra("courseDate"));
        courseLevel.setText(getIntent().getStringExtra("courseLevel"));
        courseText.setText(getIntent().getStringExtra("courseLevel"));

//        addcorsina.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addToCart(v);
//            }
//        });


    }

    public void addToCart(View view){
        int item_id = getIntent().getIntExtra("ourseId",0);
        Order.items_id.add(item_id);

        Toast.makeText(this,"Добавлено! :)",Toast.LENGTH_LONG).show();
    }
}