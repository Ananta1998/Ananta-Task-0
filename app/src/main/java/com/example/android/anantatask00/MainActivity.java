package com.example.android.anantatask00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Generating a random number
     */

    public void clickHere(View view) {
        Random rand = new Random();
        int number = rand.nextInt(200) + 1;
        TextView myText = (TextView) findViewById(R.id.random);
        String myString = String.valueOf(number);
        myText.setText(myString);
    }

    public void addOne(View view) {
        current = current + 1;
        displayForCurrent(current);
    }

    public void addTwo(View view) {
        current = current + 2;
        displayForCurrent(current);
    }

    public void addFive(View view) {
        current = current + 5;
        displayForCurrent(current);
    }

    public void addTen(View view) {
        current = current + 10;
        displayForCurrent(current);
    }

    /**
     * Displays the current value.
     */
    public void displayForCurrent(int current) {
        TextView scoreView = (TextView) findViewById(R.id.current);
        scoreView.setText(String.valueOf(current));
    }

    public void reset(View view) {
        current = 0;
        displayForCurrent(current);
    }

}
