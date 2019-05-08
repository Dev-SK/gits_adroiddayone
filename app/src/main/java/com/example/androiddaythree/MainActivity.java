package com.example.androiddaythree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_word;
    private RecyclerView.Adapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_word = (RecyclerView) findViewById(R.id.rv_word);
        String[] dataSet = {"one","two","three","four","five","six","seven","eight","one","two","three","four","five","six","seven","eight","one","two","three","four","five","six","seven","eight","one","two","three","four","five","six","seven","eight","one","two","three","four","five","six","seven","eight"};
        myAdapter =new MyAdapter(dataSet);
        rv_word.setAdapter(myAdapter);
    }
}
