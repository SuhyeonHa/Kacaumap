package com.kacau.kacaumap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ManagerEdit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_manager_edit);
        Spinner perposeSpinner = (Spinner)findViewById(R.id.spinner_perpose);
        ArrayAdapter perposeAdapter = ArrayAdapter.createFromResource(this,
                R.array.perpose, android.R.layout.simple_spinner_item);
        perposeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        perposeSpinner.setAdapter(perposeAdapter);

        Spinner deptSpinner = (Spinner)findViewById(R.id.spinner_dept);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.dept, android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        deptSpinner.setAdapter(monthAdapter);


    }
}