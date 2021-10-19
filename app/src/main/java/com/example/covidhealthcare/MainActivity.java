package com.example.covidhealthcare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button covid_button;
    private Button state_covid_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        covid_button = (Button) findViewById(R.id.covid_update_button);

        covid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCovidUpdate();
            }
        });

        state_covid_button = (Button) findViewById(R.id.statewise_covid);

        state_covid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStatewiseCovidUpdate();
            }
        });
    }

    public void openCovidUpdate(){
        Intent intent = new Intent(this, CovidUpdates.class);
        startActivity(intent);
    }

    public void openStatewiseCovidUpdate(){
        Intent intent = new Intent(this, covid_states_data.class);
        startActivity(intent);
    }


}