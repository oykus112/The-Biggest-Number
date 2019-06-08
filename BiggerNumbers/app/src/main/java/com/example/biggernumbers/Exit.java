package com.example.biggernumbers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Exit extends AppCompatActivity {
    TextView Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playexit);
        Score=findViewById(R.id.YouPoint);
        Score.setText("Your Score: "+MainActivity.point);

    }
    public void onBackPressed(){
        super.onBackPressed();
        MainActivity.point=0;
        Intent main = new Intent(this, MainActivity.class); startActivity(main);
    }
    public void Restart(View v){
        Intent intent = new Intent(Exit.this, MainActivity.class);
        startActivity(intent);
        MainActivity.point=0;
        finish();
    }







}
