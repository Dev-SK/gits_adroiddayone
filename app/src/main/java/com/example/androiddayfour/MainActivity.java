package com.example.androiddayfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText sid;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        sid = (EditText) findViewById(R.id.sid);
        result = (TextView) findViewById(R.id.result);
    }

    public void searchStudent(View view) {
        MyDBHandler dbHandler = new MyDBHandler(this,null,null,1);
        Student student =  dbHandler.searchHandler(Integer.parseInt(sid.getText().toString()));
        if(student != null) {
            result.setText(student.getId()+" "+student.getName());
        }
        else {
            result.setText("No Match Found !!!");
        }
    }

    public void addStudent(View view) {
        MyDBHandler dbHandler = new MyDBHandler(this,null,null,1);
        if(sid.getText().toString() != null && name.getText().toString() != null) {
            Student student = new Student(Integer.parseInt(sid.getText().toString()), name.getText().toString());
            dbHandler.addHandler(student);
        }
    }
}
