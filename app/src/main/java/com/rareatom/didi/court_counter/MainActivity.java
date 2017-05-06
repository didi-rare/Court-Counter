package com.rareatom.didi.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private final static int THREE_POINTS = 3;
    private final static int TWO_POINTS = 2;
    private final static int ONE_POINT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method updates the current score by three points for team A
     * @param view
     */
    public void addThreeForTeamA(View view){

        scoreTeamA = scoreTeamA + THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     * this method updates the current score by three points for team B
     * @param view
     */
    public void addThreeForTeamB(View view){

        scoreTeamB = scoreTeamB + THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * this method updates the current score by two points for team A
     * @param view
     */
    public void addTwoForTeamA(View view){

        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     * this method updates the current score for Team B
     */
    public void addTwoForTeamB(View view){

        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * this method updates the current score by one points for Team A
     * @param view
     */
    public void addOneForTeamA(View view){

        scoreTeamA = scoreTeamA + ONE_POINT;
        displayForTeamA(scoreTeamA);
    }

    /**
     * this method updates the current score for Team B
     */
    public void addOneForTeamB(View view){

        scoreTeamB = scoreTeamB + ONE_POINT;
        displayForTeamB(scoreTeamB);
    }

    /**
     * this method resets the score to 0
     * @param view
     */
    public void reset (View view){

        scoreTeamA = 0;
        scoreTeamB =0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
