package com.example.covidhealthcare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button covid_button;

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

    }

    public void openCovidUpdate(){
        Intent intent = new Intent(this, CovidUpdates.class);
        startActivity(intent);
    }


}