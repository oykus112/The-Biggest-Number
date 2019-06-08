package com.example.biggernumbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Final extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_final);


    }
    public void onBackPressed(){
        super.onBackPressed();
        MainActivity.point=0;
        Intent main = new Intent(this, MainActivity.class); startActivity(main);
    }
    public void Restart(View v){
        Intent intent = new Intent(Final.this, MainActivity.class);
        startActivity(intent);
        MainActivity.point=0;
        finish();
    }
}
