package com.rokterkhoje.arman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class SignUpThreeActivity extends AppCompatActivity {

    //Declaring gloobal variables
    EditText lastDonate;
    DatePickerDialog datePickerDialog;
    DatePickerDialog.OnDateSetListener onDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_three);

        getSupportActionBar().hide();




        //initialization of variables
        lastDonate = findViewById(R.id.lastdonatecalender);


        lastDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //creating Calender instance and geting date ,month, year
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                //datepicker dialoage
                datePickerDialog = new DatePickerDialog(getApplicationContext(), onDateSetListener, year, month, day);
                datePickerDialog.show();


            }
        });

        onDateSetListener =new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                month=month+1;
                lastDonate.setText(dayOfMonth+"/"+month+"/"+year);
            }
        };


    }

}