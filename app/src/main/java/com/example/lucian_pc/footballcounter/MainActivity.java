/*
 * Copyright (C) 2013 The Android Open Source Project
 */

package com.example.lucian_pc.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app tallies the score for team A
 */

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int redCardA = 0;
    int redCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedA(redCardA);
        displayRedB(redCardB);
        displayYellowA(yellowCardA);
        displayYellowB(yellowCardB);
    }

    //Displays the given score, red card and yellow card for teams A / B

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    // Modifies scores and updates screen with new score

    public void buttonGoalA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void buttonGoalB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void buttonRedA(View view) {
        redCardA += 1;
        displayRedA(redCardA);
    }

    public void buttonRedB(View view) {
        redCardB += 1;
        displayRedB(redCardB);
    }

    public void buttonYellowA(View view) {
        yellowCardA += 1;
        displayYellowA(yellowCardA);
    }

    public void buttonYellowB(View view) {
        yellowCardB += 1;
        displayYellowB(yellowCardB);
    }

    // Resets variables to 0 and shows new value on screen

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedA(redCardA);
        displayRedB(redCardB);
        displayYellowA(yellowCardA);
        displayYellowB(yellowCardB);
    }
}
