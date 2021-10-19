package com.example.covidhealthcare;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.os.Bundle;

public class questionairre extends AppCompatActivity {
    public ArrayList<CheckBox> checkboxes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionairre);

        checkboxes=new ArrayList<>();
        checkboxes.add((CheckBox)findViewById(R.id.symp_cough_id));
        checkboxes.add((CheckBox)findViewById(R.id.symp_fever_id));
        checkboxes.add((CheckBox)findViewById(R.id.symp_sore_id));
        checkboxes.add((CheckBox)findViewById(R.id.none1_id));

        checkboxes.add((CheckBox)findViewById(R.id.diabetes_id));
        checkboxes.add((CheckBox)findViewById(R.id.lung_id));
        checkboxes.add((CheckBox)findViewById(R.id.asthma_id));
        checkboxes.add((CheckBox)findViewById(R.id.none2_id));

        checkboxes.add((CheckBox)findViewById(R.id.ten_id));
        checkboxes.add((CheckBox)findViewById(R.id.five_id));
        checkboxes.add((CheckBox)findViewById(R.id.zero_id));
        checkboxes.add((CheckBox)findViewById(R.id.none3_id));


    }

    public void Check(View v)
    {
        String msg="";

        // Concatenation of the checked options in if

        // isChecked() is used to check whether
        // the CheckBox is in true state or not.

        if((checkboxes.get(0).isChecked()||checkboxes.get(2).isChecked()) && checkboxes.get(10).isChecked()){

        }


    }
}