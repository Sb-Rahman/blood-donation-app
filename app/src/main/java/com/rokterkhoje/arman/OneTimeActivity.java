package com.rokterkhoje.arman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OneTimeActivity extends AppCompatActivity {
//public variables

    ImageView img1, img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_time);
        getSupportActionBar().hide();


img1=findViewById(R.id.imgOne);
img2=findViewById(R.id.imageView3);
img1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(OneTimeActivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }
});

img2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(OneTimeActivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }
});
    }
}