package com.example.dm2.listen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejer1(View v){
        Intent i=new Intent(MainActivity.this,Ejer1.class);
        startActivity(i);
    }
    public void ejer2(View v){
        Intent i=new Intent(MainActivity.this,Ejer2.class);
        startActivity(i);
    }
}
