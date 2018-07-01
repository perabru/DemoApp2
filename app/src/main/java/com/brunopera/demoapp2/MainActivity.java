package com.brunopera.demoapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int numberR;

    public void guessNumber(View view) {
        int numberGuess = 0;
        TextView txtTest = (TextView) findViewById(R.id.txtTeste);

        EditText txtGuess = (EditText) findViewById(R.id.txtGuess);
        numberGuess = Integer.valueOf(txtGuess.getText().toString());

        txtTest.setText(String.valueOf(numberR));


        if (numberGuess > numberR) {
            Toast.makeText(getApplicationContext(), "Lower", Toast.LENGTH_LONG).show();
        } else if (numberGuess < numberR) {
            Toast.makeText(getApplicationContext(), "Higher", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Congratulations", Toast.LENGTH_LONG).show();
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Random rand = new Random();
        numberR = rand.nextInt(20) + 1;


    }
}
