package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0, wickets = 0, overs = 0;
    TextView sView, tView, uView, vView;
    final static String STORE_VALUE="";
    final static String STORE_VALUE_1="";
    final static String STORE_VALUE_2="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sView = (TextView) findViewById(R.id.score_text_view);
        tView = (TextView) findViewById(R.id.wicket_text_view);
        uView = (TextView) findViewById(R.id.Over_text_view);
        vView = (TextView) findViewById(R.id.Ball_text_view);

        if (savedInstanceState != null) {
            score = savedInstanceState.getInt("STORE_VALUE");
            displayScore(score);
            wickets = savedInstanceState.getInt("STORE_VALUE_1");
            displayWicket(wickets);
            overs = savedInstanceState.getInt("STORE_VALUE_2");
            displayOvers(overs);
            displayBalls(overs);
        }

    }

    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt("STORE_VALUE", score);
        outState.putInt("STORE_VALUE_1", wickets);
        outState.putInt("STORE_VALUE_2", overs);

    }

    public void displayScore(int score) {
        String temp = score + getString(R.string.hyphen);
        sView.setText(temp);
    }

    public void displayWicket(int wickets) {

        tView.setText(String.valueOf(wickets));
    }

    public void displayOvers(int overs) {
        int temp = overs / 6;
        String t = temp + getString(R.string.dot);
        uView.setText(t);
    }

    public void displayBalls(int overs) {
        int temp = (overs) % (6);
        String t = temp + getString(R.string.overs);
        vView.setText(t);
    }

    public void addWicket(View v) {
        if (wickets == 10)
            displayWicket(10);
        else {
            wickets += 1;
            displayWicket(wickets);
            overs += 1;
            displayOvers(overs);
            displayBalls(overs);
        }
    }

    public void addWide(View v) {
        score = score + 1;
        displayScore(score);
    }

    public void addZero(View v) {
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void addOne(View v) {
        score = score + 1;
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void addTwo(View v) {
        score = score + 2;
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void addThree(View v) {
        score = score + 3;
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void addFour(View v) {
        score = score + 4;
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void addSix(View v) {
        score = score + 6;
        displayScore(score);
        overs += 1;
        displayOvers(overs);
        displayBalls(overs);
    }

    public void resetScore(View v) {
        score = 0;
        wickets = 0;
        overs = 0;
        displayScore(score);
        displayWicket(wickets);
        displayOvers(overs);
        displayBalls(overs);

    }


}
