package com.example.biggernumbers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public Button Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Start;
    public TextView baslik,Point,bestScore,stage,txtsure;
    public int num1, num2,num3,num4,num5,num6,num7,num8 ;

    public static int point;
    public static int BestPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1=(Button)findViewById(R.id.button1);
        Button2=(Button)findViewById(R.id.button2);
        Button3=(Button)findViewById(R.id.button3);
        Button4=(Button)findViewById(R.id.button4);
        Button5=(Button)findViewById(R.id.button5);
        Button6=(Button)findViewById(R.id.button6);
        Button7=(Button)findViewById(R.id.button7);
        Button8=(Button)findViewById(R.id.button8);
        Start=(Button)findViewById(R.id.start);

        txtsure=findViewById(R.id.time);
        stage=(TextView)findViewById(R.id.bolum);
        baslik=(TextView)findViewById(R.id.baslik);
        Point=(TextView)findViewById(R.id.point);
        bestScore=(TextView)findViewById(R.id.Best);


        SharedPreferences MaxScore =this.getSharedPreferences("Score",Context.MODE_PRIVATE);
        BestPoint=MaxScore.getInt("score",0);
        bestScore.setText("Best Score:"+BestPoint);
        Point.setText("Point:"+point);

        Point.setVisibility(View.INVISIBLE);
        Button1.setVisibility(View.INVISIBLE);
        Button2.setVisibility(View.INVISIBLE);
        Button3.setVisibility(View.INVISIBLE);
        Button4.setVisibility(View.INVISIBLE);
        Button5.setVisibility(View.INVISIBLE);
        Button6.setVisibility(View.INVISIBLE);
        Button7.setVisibility(View.INVISIBLE);
        Button8.setVisibility(View.INVISIBLE);







    }

    public void TimeSetandStartGame(View v){
        Start.setVisibility(View.INVISIBLE);
        Point.setVisibility(View.VISIBLE);
        baslik.setVisibility(View.INVISIBLE);


        new CountDownTimer(120000, 1000) {
            public void onTick(long millisUntilFinished) {

                txtsure.setText("Time: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                GameOver();
            }
        }.start();
        MyLevel();
    }

    public void StartGame(View v) {

        switch (v.getId()) {


            case R.id.button1:

                if(point<60){
                    if(num1>num2){
                        GetPoint();
                        MyLevel();

                    }
                    else if(!(num1>num2)){
                        GameOver();
                    }

                }

                else if(point>=60&&point<120){
                    if((num1>num2)&&(num1>num3)){
                        GetPoint();
                        MyLevel();


                    }
                    else if (!((num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }

                else if(point>=120&&point<160){
                    if((num1>num2)&&(num1>num3)){
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }
                else if(point>=160&&point<240){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if (!((num1>num4)&&(num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }

                else if(point>=240&&point<300){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num1>num4)&&(num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }
                else if(point>=300&&point<360){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num1>num4)&&(num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }

                else if(point>=360&&point<420){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if (!((num1>num4)&&(num1>num2)&&(num1>num3))){
                        GameOver();
                    }

                }
                else if(point>=420&&point<480){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5))){
                        GameOver();
                    }

                }
                else if(point>=480&&point<540){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5)&&(num1>num6)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5)&&(num1>num6)){
                        GameOver();
                    }

                }
                else if(point>=540&&point<600){
                    if((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5)&&(num1>num6)&&(num1>num7)&&(num1>num8)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num1>num4)&&(num1>num2)&&(num1>num3)&&(num1>num5)&&(num1>num6)&&(num1>num7)&&(num1>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }


                BestPointCheck();
                break;

            case R.id.button2:

                if(point<60){
                    if(num2>num1){
                        GetPoint();
                        MyLevel();


                    }
                    else if(!(num2>num1)){
                        GameOver();
                    }

                }

                if(point>=60&&point<120){

                    if((num2>num1)&&(num2>num3)){
                        GetPoint();
                        MyLevel();


                    }
                    else if(!((num2>num1)&&(num2>num3))){
                        GameOver();
                    }

                }

                else if(point>=120&&point<160){

                    if((num2>num1)&&(num2>num3)){
                        GetPoint();
                        MyLevel();


                    }
                    else if(!((num2>num1)&&(num2>num3))){
                        GameOver();
                    }

                }
                if(point>=160&&point<240){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4))){
                        GameOver();
                    }

                }
                else if(point>=240&&point<300) {
                    if ((num2>num1)&&(num2>num3)&&(num2>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4))){
                        GameOver();
                    }

                }

                else if(point>=300&&point<360){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4))){
                        GameOver();
                    }

                }

                else if(point>=360&&point<420){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4))){
                        GameOver();
                    }

                }

                else if(point>=420&&point<480){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5))){
                        GameOver();
                    }

                }
                else if(point>=480&&point<540){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)&&(num2>num6)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)&&(num2>num6))){
                        GameOver();
                    }

                }


                else if(point>=540&&point<600){
                    if((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)&&(num2>num6)&&(num2>num7)&&(num2>num8)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num2>num1)&&(num2>num3)&&(num2>num4)&&(num2>num5)&&(num2>num6)&&(num2>num7)&&(num2>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();
                break;

            case R.id.button3:

                if(point>=60&&point<120){

                    if((num3>num1)&&(num3>num2)){
                        GetPoint();
                        MyLevel();


                    }
                    else if(!((num3>num1)&&(num3>num2))){
                        GameOver();
                    }

                }

                else if(point>=120&&point<160){
                    if((num3>num1)&&(num3>num2)){
                        GetPoint();
                        MyLevel();


                    }
                    else if(!((num3>num1)&&(num3>num2))){
                        GameOver();
                    }

                }
                else if(point>=160&&point<240){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4))){
                        GameOver();
                    }

                }
                else if(point>=240&&point<300){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4))){
                        GameOver();
                    }

                }
                else if(point>=300&&point<360){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if (!((num3>num1)&&(num3>num2)&&(num3>num4))){
                        GameOver();
                    }

                }

                else if(point>=360&&point<420){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4))){
                        GameOver();
                    }

                }

                else if(point>=420&&point<480){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5))){
                        GameOver();
                    }

                }

                else if(point>=480&&point<540){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)&&(num3>num6)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)&&(num3>num6))){
                        GameOver();
                    }

                }

                else if(point>=540&&point<600){
                    if((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)&&(num3>num6)&&(num3>num7)&&(num3>num8)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num3>num1)&&(num3>num2)&&(num3>num4)&&(num3>num5)&&(num3>num6)&&(num3>num7)&&(num3>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();


                break;
            case R.id.button4:

                if(point>=160&&point<240){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if (!((num4>num1)&&(num4>num2)&&(num4>num3))){
                        GameOver();
                    }

                }
                else if(point>=240&&point<300){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3))){
                        GameOver();
                }

                }
                else if(point>=300&&point<360){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3))){
                        GameOver();
                    }

                }

                else if(point>=360&&point<420){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3))){
                        GameOver();
                    }

                }
                else if(point>=420&&point<480){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3))){
                        GameOver();
                    }

                }
                else if(point>=480&&point<540){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)&&(num4>num6)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)&&(num4>num6))){
                        GameOver();
                    }

                }

                else if(point>=540&&point<600){
                    if((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)&&(num4>num6)&&(num4>num7)&&(num4>num8)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num4>num1)&&(num4>num2)&&(num4>num3)&&(num4>num5)&&(num4>num6)&&(num4>num7)&&(num4>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();

                break;
            case R.id.button5:
                if(point>=420&&point<480){
                    if((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4))){
                        GameOver();
                    }

                }

                else if(point>=480&&point<540){
                    if((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)&&(num5>num6)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)&&(num5>num6))){
                        GameOver();
                    }

                }

                else if(point>=540&&point<600){
                    if((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)&&(num5>num6)&&(num5>num7)&&(num5>num8)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num5>num1)&&(num5>num2)&&(num5>num3)&&(num5>num4)&&(num5>num6)&&(num5>num7)&&(num5>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();
                break;

            case R.id.button6:
                if(point>=480&&point<540){
                    if((num6>num1)&&(num6>num2)&&(num6>num3)&&(num6>num4)&&(num6>num5)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num6>num1)&&(num6>num2)&&(num6>num3)&&(num6>num4)&&(num6>num5))){
                        GameOver();
                    }

                }

                else if(point>=540&&point<600){
                    if((num6>num1)&&(num6>num2)&&(num6>num3)&&(num6>num4)&&(num6>num5)&&(num6>num7)&&(num6>num8)) {
                        GetPoint();
                        MyLevel();

                    }
                    else if(!((num6>num1)&&(num6>num2)&&(num6>num3)&&(num6>num4)&&(num6>num5)&&(num6>num7)&&(num6>num8))){
                        GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();
                break;


            case R.id.button7:
                if(point>=540&&point<600){
                    if((num7>num1)&&(num7>num2)&&(num7>num3)&&(num7>num4)&&(num7>num5)&&(num7>num6)&&(num7>num8)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if(!((num7>num1)&&(num7>num2)&&(num7>num3)&&(num7>num4)&&(num7>num5)&&(num7>num6)&&(num7>num8))){
                       GameOver();
                    }

                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();
                break;

            case R.id.button8:
                if(point>=540&&point<600){
                    if((num8>num1)&&(num8>num2)&&(num8>num3)&&(num8>num4)&&(num8>num5)&&(num8>num6)&&(num8>num7)) {
                        GetPoint();
                        MyLevel();
                        System.out.println("true");
                    }
                    else if (!((num8>num1)&&(num8>num2)&&(num8>num3)&&(num8>num4)&&(num8>num5)&&(num8>num6)&&(num8>num7))) {
                        GameOver();
                    }


                }
                else if(point==600){
                    CompletedGame();
                }
                BestPointCheck();
                break;

        }




    }

    public void CompletedGame(){

            Intent Final=new Intent(MainActivity.this,Final.class);
            startActivity(Final);

    }

    public void MyLevel(){


        if(point<60) {

            stage.setText("Stage 1");

            num1 = (int) (Math.random() * 11);
            num2 = (int) (Math.random() * 11);


            while (num1 == num2) {
                num1 = (int) (Math.random() * 11);
                num2 = (int) (Math.random() * 11);
            }

            Button1.setText("" + num1);
            Button2.setText("" + num2);

            Button1.setVisibility(View.VISIBLE);
            Button2.setVisibility(View.VISIBLE);


        }

        else if(point>=60 && point<120){
            stage.setText("Stage 2");
            num1= (int) (10+Math.random() * 11);
            num2 = (int) (10+Math.random() * 11);
            num3= (int) (10+Math.random() * 11);

            while((num1==num2)||(num1==num3)||(num2==num3)){
                num1= (int) (Math.random() * 11);
                num2 =(int) (Math.random() * 11);
                num3= (int) (Math.random() * 11);
            }

            Button1.setText(""+num1);
            Button2.setText(""+num2);
            Button3.setText(""+num3);

            Button1.setVisibility(View.VISIBLE);
            Button2.setVisibility(View.VISIBLE);
            Button3.setVisibility(View.VISIBLE);




        }

        else if(point>=120&& point<180){
            stage.setText("Stage 3");

            num1= (int) (10+Math.random() * 19);
            num2 = (int) (10+Math.random() * 19);
            num3= (int) (10+Math.random() * 19);

            while((num1==num2)||(num1==num3)||(num2==num3)) {
                System.out.println("level 3");
                num1= (int) (10+Math.random() * 19);
                num2 = (int) (10+Math.random() * 19);
                num3= (int) (10+Math.random() * 19);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);

            Button3.setVisibility(View.VISIBLE);


        }
        else if(point>180&& point<240){
            stage.setText("Stage 4");

            num1= (int) (Math.random() *41);
            num2 = (int) (Math.random() * 41);
            num3= (int) (Math.random() * 41);
            num4=(int) (Math.random() * 41);

            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3)) {

                num1= (int) (Math.random() * 41);
                num2 = (int) (Math.random() *41);
                num3= (int) (Math.random() *41);
                num4=(int) (Math.random() * 41);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);



        }

        else if(point>=240&& point<300){
            stage.setText("Stage 5");

            num1= (int) (-40+Math.random() *81);
            num2 = (int) (-40+Math.random() * 81);
            num3= (int) (-40+Math.random() * 81);
            num4=(int) (-40+Math.random() * 81);

            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3))  {
                System.out.println("level 3");
                num1= (int) (-40+Math.random() * 81);
                num2 = (int) (-40+Math.random() *81);
                num3= (int) (-40+Math.random() *81);
                num4=(int) (-40+Math.random() * 81);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);



        }

        else if(point>=300&& point<360){
            stage.setText("Stage 6");

            num1= (int) (-60+Math.random() * 121);
            num2 = (int) (-60+Math.random() * 121);
            num3= (int) (-60+Math.random() * 121);
            num4=(int) (-60+Math.random() * 121);

            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3))  {

                num1= (int) (-60+Math.random() * 121);
                num2 = (int) (-60+Math.random() * 121);
                num3= (int) (-60+Math.random() * 121);
                num4=(int) (-60+Math.random() * 121);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);


        }

        else if(point>=360&& point<420){
            stage.setText("Stage 7");

            num1= (int) (-100+Math.random() * 201);
            num2= (int) (-100+Math.random() * 201);
            num3= (int) (-100+Math.random() * 201);
            num4= (int) (-100+Math.random() * 201);

            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3))  {

                num1= (int) (-100+Math.random() * 201);
                num2= (int) (-100+Math.random() * 201);
                num3= (int) (-100+Math.random() * 201);
                num4= (int) (-100+Math.random() * 201);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);


        }

        else if(point>=420&& point<480){
            stage.setText("Stage 8");

            num1= (int) (-100+Math.random() * 201);
            num2= (int) (-100+Math.random() * 201);
            num3= (int) (-100+Math.random() * 201);
            num4= (int) (-100+Math.random() * 201);
            num5= (int) (-100+Math.random() * 201);


            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3)||(num5==num1)||(num5==num2)||(num5==num3)
                    ||(num5==num4) ) {

                num1= (int) (-100+Math.random() * 201);
                num2= (int) (-100+Math.random() * 201);
                num3= (int) (-100+Math.random() * 201);
                num4= (int) (-100+Math.random() * 201);
                num5= (int) (-100+Math.random() * 201);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);
            Button5.setText(""+ num5);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);
            Button5.setVisibility(View.VISIBLE);


        }

        else if(point>=480&& point<540){
            stage.setText("Stage 9");

            num1= (int) (-100+Math.random() * 201);
            num2= (int) (-100+Math.random() * 201);
            num3= (int) (-100+Math.random() * 201);
            num4= (int) (-100+Math.random() * 201);
            num5= (int) (-100+Math.random() * 201);
            num6= (int) (-100+Math.random() * 201);


            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3)||(num5==num1)||(num5==num2)||(num5==num3)
                    ||(num5==num4)||(num6==num1)||(num6==num2)||(num6==num3)||(num6==num4)||(num6==num5)||(num6==num1)) {

                num1= (int) (-100+Math.random() * 201);
                num2= (int) (-100+Math.random() * 201);
                num3= (int) (-100+Math.random() * 201);
                num4= (int) (-100+Math.random() * 201);
                num5= (int) (-100+Math.random() * 201);
                num6= (int) (-100+Math.random() * 201);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);
            Button5.setText(""+ num5);
            Button6.setText(""+ num6);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);
            Button5.setVisibility(View.VISIBLE);
            Button6.setVisibility(View.VISIBLE);



        }

        else if(point>=540&& point<600){
            stage.setText("Stage 10");

            num1= (int) (-100+Math.random() * 201);
            num2= (int) (-100+Math.random() * 201);
            num3= (int) (-100+Math.random() * 201);
            num4= (int) (-100+Math.random() * 201);
            num5= (int) (-100+Math.random() * 201);
            num6= (int) (-100+Math.random() * 201);
            num7= (int) (-100+Math.random() * 201);
            num8= (int) (-100+Math.random() * 201);


            while((num1==num2)||(num1==num3)||(num2==num3)||(num4==num1)||(num4==num2)||(num4==num3)||(num5==num1)||(num5==num2)||(num5==num3)
                    ||(num5==num4)||(num6==num1)||(num6==num2)||(num6==num3)||(num6==num4)||(num6==num5)||(num7==num1)||
                    (num7==num2)||(num7==num3)||(num7==num4)||(num7==num5)||(num7==num6)||(num8==num1)||
                    (num8==num2)||(num8==num3)||(num8==num4)||(num8==num5)||(num8==num6)||(num8==num7)) {

                num1= (int) (-100+Math.random() * 201);
                num2= (int) (-100+Math.random() * 201);
                num3= (int) (-100+Math.random() * 201);
                num4= (int) (-100+Math.random() * 201);
                num5= (int) (-100+Math.random() * 201);
                num6= (int) (-100+Math.random() * 201);
                num7= (int) (-100+Math.random() * 201);
                num8= (int) (-100+Math.random() * 201);

            }
            Button1.setText("" + num1);
            Button2.setText("" + num2);
            Button3.setText("" + num3);
            Button4.setText(""+ num4);
            Button5.setText(""+ num5);
            Button6.setText(""+ num6);
            Button7.setText(""+ num7);
            Button8.setText(""+ num8);

            Button3.setVisibility(View.VISIBLE);
            Button4.setVisibility(View.VISIBLE);
            Button5.setVisibility(View.VISIBLE);
            Button6.setVisibility(View.VISIBLE);
            Button7.setVisibility(View.VISIBLE);
            Button8.setVisibility(View.VISIBLE);


        }


    }

    public void GameOver(){
        Intent gameOver=new Intent(MainActivity.this,Exit.class);
        startActivity(gameOver);
    }



    public  void GetPoint(){
        point=point+10;
        Point.setText("Point:"+point);


    }

    public void BestPointCheck(){

        if(point>BestPoint) {
            BestPoint = point;
            SharedPreferences MaxScore = this.getSharedPreferences("Score", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = MaxScore.edit();
            editor.putInt("score", BestPoint);
            editor.commit();
            bestScore.setText("Best Point: " + BestPoint);
        }


    }
    @Override
    public void onResume(){
        super.onResume();
        point=0;
        Point.setText("Point:"+point);
        stage.setText("");
        Button1.setVisibility(View.INVISIBLE);
        Button2.setVisibility(View.INVISIBLE);
        Button3.setVisibility(View.INVISIBLE);
        Button4.setVisibility(View.INVISIBLE);
        Button5.setVisibility(View.INVISIBLE);
        Button6.setVisibility(View.INVISIBLE);
        Button7.setVisibility(View.INVISIBLE);
        Button8.setVisibility(View.INVISIBLE);
        Start.setVisibility(View.VISIBLE);


    }





}