//created by dpsorari , all rights reserved
package com.chaos.bbCourtCounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class counterPage extends AppCompatActivity {


    private int scoreA,scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_page);

        scoreA=0;scoreB=0;

        final TextView team_a_score = (TextView) findViewById(R.id.team_a_score);

        Intent intent = getIntent();

        String team_a_name = intent.getStringExtra("team_a");
        String team_b_name = intent.getStringExtra("team_b");


        TextView teamAname = (TextView) findViewById(R.id.team_a_name_text_view );
        TextView teamBname = (TextView) findViewById(R.id.team_b_name_text_view );

        teamAname.setText(team_a_name);
        teamBname.setText(team_b_name);



        Button team_a_3= (Button) findViewById(R.id.team_a_3);
        team_a_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA+=3;
                team_a_score.setText(""+getScoreA());
            }
        });

        Button team_a_2= (Button) findViewById(R.id.team_a_2);
        team_a_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA+=2;
                team_a_score.setText(""+getScoreA());
            }
        });

        Button team_a_free = (Button) findViewById(R.id.team_a_free);
        team_a_free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA+=1;
                team_a_score.setText(""+getScoreA());
            }
        });


        final TextView team_b_score = (TextView) findViewById(R.id.team_b_score);


        Button team_b_3= (Button) findViewById(R.id.team_b_3);
        team_b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB+=3;
                team_b_score.setText(""+getScoreB());
            }
        });

        Button team_b_2= (Button) findViewById(R.id.team_b_2);
        team_b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB+=2;
                team_b_score.setText(""+getScoreB());
            }
        });

        Button team_b_free = (Button) findViewById(R.id.team_b_free);
        team_b_free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB+=1;
                team_b_score.setText(""+getScoreB());
            }
        });

        Button reset= (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=0;
                scoreB=0;
                team_a_score.setText(""+scoreA);
                team_b_score.setText(""+scoreB);
            }
        });

    }



    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }





}
