package com.rokterkhoje.arman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    //global veriables
    Button signup_two;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        initializeAll();

        //sending to next sign_uppage
        signup_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, SignUpTwoActivity.class);
                startActivity(intent);
            }
        });


    }

    //initializing all veriables
    private void initializeAll() {
        signup_two = findViewById(R.id.button_signup_two);


    }
}