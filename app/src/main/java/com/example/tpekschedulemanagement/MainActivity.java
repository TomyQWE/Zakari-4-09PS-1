package com.example.tpekschedulemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editLogin, editPassword;
    private Button btnAutorization;
    private StudentManager studentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editPassword = findViewById(R.id.editPassword);
        btnAutorization = findViewById(R.id.butAutorization);

        StudentList studentList = new StudentList();
        studentManager = studentList.getManager();

        btnAutorization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = editLogin.getText().toString();
                String password = editPassword.getText().toString();

                Student student = studentManager.checkAuth(login, password);
                if (student != null) {
                    Intent intent = new Intent(MainActivity.this, ProfileStudent.class);
                    intent.putExtra("fullName", student.getFullName());
                    intent.putExtra("groupName", student.getGroup());
                    intent.putExtra("course", student.getCourse());
                    startActivity(intent);
                    finish();

                    Toast.makeText(MainActivity.this,
                            "Добро пожаловать, " + student.getFullName() + "!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Неверные данные: логин или пароль",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
