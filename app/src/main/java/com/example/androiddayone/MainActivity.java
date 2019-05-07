package com.example.androiddayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title;
    private Button submit;
    private EditText username;
    private  EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        title.setText("Android Developer's");
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin@123")) {
                    Intent intent = new Intent(MainActivity.this,SecondScreen.class);
                    intent.putExtra("username",username.getText().toString());
                    startActivity(intent);
                }
            }
        });
        Log.d("onCreateLog","onCreate Run");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStartLog","onStart Run");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPauseLog","onPause Run");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResumeLog","onResume Run");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStopLog","onStop Run");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroyLog","onDestroy Run");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestartLog","onRestart Run");

    }
}
