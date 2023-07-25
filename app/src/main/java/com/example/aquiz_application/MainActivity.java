package com.example.aquiz_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView,mQuestionView;
    private Button mButtonChoice1,mButtonChoice2,mButtonChoice3,mQuit;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView=(TextView) findViewById(R.id.tvScore);
        mQuestionView=(TextView)findViewById(R.id.tvQuestion);
        mButtonChoice1=(Button) findViewById(R.id.btnChoice1);
        mButtonChoice2=(Button) findViewById(R.id.btnChoice2);
        mButtonChoice3=(Button) findViewById(R.id.btnChoice3);
        mQuit=(Button) findViewById(R.id.btnQuit);

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(mButtonChoice1.getText()==mAnswer)
                    {
                        mScore++;
                        updateScore(mScore);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();

                    }
                    else
                    {

                        Toast.makeText(MainActivity.this, "Wrong X X", Toast.LENGTH_SHORT).show();
                        updateQues();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }


            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(mButtonChoice2.getText()==mAnswer)
                    {
                        mScore++;
                        updateScore(mScore);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();

                    }
                    else
                    {

                        Toast.makeText(MainActivity.this, "Wrong X X", Toast.LENGTH_SHORT).show();
                        updateQues();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }


            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(mButtonChoice3.getText()==mAnswer)
                    {
                        mScore++;
                        updateScore(mScore);
                        updateQues();
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();

                    }
                    else
                    {

                        Toast.makeText(MainActivity.this, "Wrong X X", Toast.LENGTH_SHORT).show();
                        updateQues();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
    private void updateQues(){


        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer= mQuestionLibrary.getCorrectAnswer(mQuestionNumber);

        mQuestionNumber++;

    }
    private void updateScore(int point){


        mScoreView.setText("Score: "+ point);
    }
}