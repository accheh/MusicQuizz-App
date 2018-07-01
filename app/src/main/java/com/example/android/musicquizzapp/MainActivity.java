package com.example.android.musicquizzapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
/**
 * This is a music quiz app
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the sumbmit button is clicked.
     */
    public void submitClick(View view) {
        EditText text=  findViewById(R.id.enter_name);
        String enterName= text.getText().toString();
        RadioButton Box1Q1 = findViewById(R.id.Tonic);
        boolean Result1Q1 = Box1Q1.isChecked();
        RadioButton Box2Q1 = findViewById(R.id.Dominant);
        boolean Result2Q1 = Box2Q1.isChecked();
        RadioButton Box3Q1 = findViewById(R.id.Subdominant);
        boolean Result3Q1 = Box3Q1.isChecked();

        RadioButton  Box1Q2 = findViewById(R.id.Dorian);
        boolean Result1Q2 = Box1Q2.isChecked();
        RadioButton  Box2Q2 = findViewById(R.id.Pentatonic);
        boolean Result2Q2 = Box2Q2.isChecked();
        RadioButton  Box3Q2 = findViewById(R.id.Ionian);
        boolean Result3Q2 = Box3Q2.isChecked();

        RadioButton Box1Q3 = findViewById(R.id.Three);
        boolean Result1Q3 = Box1Q3.isChecked();
        RadioButton  Box2Q3 = findViewById(R.id.Five);
        boolean Result2Q3 = Box2Q3.isChecked();
        RadioButton  Box3Q3 = findViewById(R.id.Seven);
        boolean Result3Q3 = Box3Q3.isChecked();

        RadioButton  Box1Q4 = findViewById(R.id.Major);
        boolean Result1Q4 = Box1Q4.isChecked();
        RadioButton  Box2Q4 = findViewById(R.id.Pentatonic2);
        boolean Result2Q4 = Box2Q4.isChecked();
        RadioButton  Box3Q4 = findViewById(R.id.Chromatic);
        boolean Result3Q4 = Box3Q4.isChecked();

        int score1= getResultQuestion1(Result1Q1,Result2Q1, Result3Q1);
        int score2= getResultQuestion2(Result1Q2, Result2Q2, Result3Q2);
        int score3= getResultQuestion3(Result1Q3, Result2Q3, Result3Q3);
        int score4= getResultQuestion4(Result1Q4, Result2Q4, Result3Q4);
        int totalSore = finalScore(score1,score2,score3,score4);
        String remark1=remarkQuestion1(Result1Q1,Result2Q1, Result3Q1);
        String remark2=remarkQuestion2(Result1Q2, Result2Q2, Result3Q2);
        String remark3=remarkQuestion3(Result1Q3, Result2Q3, Result3Q3);
        String remark4=remarkQuestion4(Result1Q4, Result2Q4, Result3Q4);
        String Result = finalResult(enterName,totalSore);

        question1(remark1);
        question2(remark2);
        question3(remark3);
        question4(remark4);
        resultQuizz(Result);
    }

    /**
     * This method displays the remark for the first question on the screen.
     *
     */
    private void question1 (String remark) {
        TextView question1TextView = (TextView) findViewById(R.id.remark1);
        question1TextView.setText("" +remark );}
    /**
     * This method displays the remake for the second question value on the screen.
     *
     */
    private void question2 (String remark) {
        TextView question2TextView = (TextView) findViewById(R.id.remark2);
        question2TextView.setText("" +remark );}
    /**
     * This method displays the rermak for the third question  on the screen.
     *
     */
    private void question3 (String remark) {
        TextView question3TextView = (TextView) findViewById(R.id.remark3);
        question3TextView.setText("" +remark );}

    /**
     * This method displays the remark for the fourth question  on the screen.
     *
     */
    private void question4 (String remark) {
        TextView question4TextView = (TextView) findViewById(R.id.remark4);
        question4TextView.setText("" +remark );}
    /**
     * This method displays the the Result of the quizz on the screen.
     *
     */
    private void resultQuizz (String result) {
        TextView resultTextView = (TextView) findViewById(R.id.Result);
        resultTextView.setText("" +result );}

    /**
     * this method gets the answer to question one
     *
     */

    private int getResultQuestion1(boolean Result1Q1,boolean Result2Q1, boolean Result3Q1) {
        int score1 = 0;

        if (Result1Q1) {
            score1 = +0;
        } else if (Result2Q1) {
            score1 = +0;
        } else if (Result3Q1) {
            score1 = +25;
        }
        return score1;
    }
    /**
     * this method gets the answer to question two
     *
     */

    private int getResultQuestion2(boolean Result1Q2,boolean Result2Q2, boolean Result3Q2) {

        int score2 = 0;
        if (Result1Q2) {
            score2 = +0;
        } else if (Result2Q2) {
            score2 = +25;
        } else if (Result3Q2) {
            score2 = +0;
        }
        return score2;
    }
    /**
     * this method gets the score for question three
     *
     */

    private int getResultQuestion3(boolean Result1Q3, boolean Result2Q3,boolean Result3Q3) {

        int score3 = 0;
        if (Result1Q3) {
            score3 = +0;
        } else if (Result2Q3) {
            score3 = +0;
        } else if (Result3Q3) {
            score3 = +25;
        }
        return score3;
    }
    /**
     * this method gets the score for question Four
     *
     */

    private int getResultQuestion4(boolean Result1Q4, boolean Result2Q4, boolean Result3Q4) {

        int score4 = 0;
        if (Result1Q4) {
            score4 = +0;
        } else if (Result2Q4) {
            score4 = +25;
        } else if (Result3Q4) {
            score4= +0;
        }
        return score4;}
    /**
     * this method calculates the final score
     * */
        private int finalScore(int score1, int score2, int score3,int score4){
        int totalScore = score1 + score2 + score3 + score4;
         return totalScore;
        }

    /**
     * this method stores the remarks for  question one
     *
     * */
    private String remarkQuestion1(boolean Result1Q1,boolean Result2Q1, boolean Result3Q1){
        String theRemark = " You did not select an  option";
        if (Result1Q1){
            theRemark ="Wrong. The correct Answer is : C). Subdominant";
        }
        else if (Result2Q1) {
            theRemark = "Wrong. The correct Answer is : C). Subdominant";
        }
        else if (Result3Q1) {
            theRemark = "CORRECT!!. The Answer is : C). Subdominant";
        }
        return theRemark;
    }
    /**
     * this method stores the remarks for  question two
     *
     * */
    private String remarkQuestion2(boolean Result1Q2,boolean Result2Q2, boolean Result3Q2){
        String theRemark = " You did not select an  option";
        if (Result1Q2){
            theRemark ="Wrong. The correct Answer is : B). Pentatonic";
        }
        else if (Result2Q2) {
            theRemark = "CORRECT!!. The  Answer is : B). Pentatonic";
        }
        else if (Result3Q2) {
            theRemark = "Wrong. The correct Answer is : B). Pentatonic";
        }
        return theRemark;
    }
    /**
     * this method stores the remarks for  question three
     *
     * */
    private String remarkQuestion3(boolean Result1Q3,boolean Result2Q3, boolean Result3Q3){
        String theRemark = " You did not select an  option";
        if (Result1Q3){
            theRemark ="Wrong. The correct Answer is : C). Seven";
        }
        else if (Result2Q3) {
            theRemark ="Wrong. The correct Answer is : C). Seven";
        }
        else if (Result3Q3) {
            theRemark = "CORRECT!!. The Answer is : C). Seven";
        }
        return theRemark;
    }
    /**
     * this method stores the remarks for  question four
     *
     * */
    private String remarkQuestion4(boolean Result1Q4,boolean Result2Q4, boolean Result3Q4){
        String theRemark = " You did not select an  option";
        if (Result1Q4){
            theRemark ="Wrong. The correct Answer is : B). Pentatonic";
        }
        else if (Result2Q4) {
            theRemark = "CORRECT!!. The  Answer is : B). Pentatonic";
        }
        else if (Result3Q4) {
            theRemark = "Wrong. The correct Answer is : B). Pentatonic";
        }
        return theRemark;
    }
    /**
     * this method stores the the result  of the Quiz
     *
     * */
    private String finalResult(String enterName, int totalScore){
        String resultFinal= "RESULT ";
        resultFinal = resultFinal+"\n NAME: " + enterName;
        resultFinal =resultFinal+ "\n Score: "+ totalScore + "%";
        return resultFinal;
    }










}

