package com.example.tpekschedulemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileStudent extends AppCompatActivity {

    private TextView tvName, tvGroup, tvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_student);

        Button btnSchedule = findViewById(R.id.btnSchedule);
        Button btnNews = findViewById(R.id.btnNews);
        tvName = findViewById(R.id.tvName);
        tvGroup = findViewById(R.id.tvGroup);
        tvCourse = findViewById(R.id.tvCourse);

        String fullName = getIntent().getStringExtra("fullName");
        String groupName = getIntent().getStringExtra("groupName");
        int course = getIntent().getIntExtra("course", 1);

        tvName.setText(fullName);
        tvGroup.setText("Группа: " + groupName);
        tvCourse.setText("Курс: " + course);

        btnSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileStudent.this, PlanWeek.class);
                startActivity(intent);
            }
        });

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileStudent.this, NewsActivity.class);
                startActivity(intent);
            }
        });
    }
}
