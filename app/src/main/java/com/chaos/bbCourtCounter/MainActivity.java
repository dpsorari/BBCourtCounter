package com.chaos.bbCourtCounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText team_a_name = (EditText) findViewById(R.id.team_a_name);
        final EditText team_b_name = (EditText) findViewById(R.id.team_b_name);

        Button start_match  = (Button) findViewById(R.id.start_match);
        start_match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent getCounter = new Intent(MainActivity.this, counterPage.class);
                getCounter.putExtra("team_a",team_a_name.getText().toString());
                getCounter.putExtra("team_b",team_b_name.getText().toString());
                startActivity(getCounter);
            }
        });

    }


}
