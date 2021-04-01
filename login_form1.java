package com.aman.majdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class login_form1 extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form1);
        getSupportActionBar().setTitle("Login_for_Worker");

        button = (Button) findViewById(R.id.btn7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_form1.this,Signup2_Form.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.btn6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_form1.this,worker_1.class);
                startActivity(intent);
            }
        });
    }
}