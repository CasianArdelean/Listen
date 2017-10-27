package com.example.dm2.listen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class Ejer2 extends AppCompatActivity {
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);


        web[] webs = {
                new web("Bing","http://www.bing.com",R.drawable.bing,"Bing"),
                new web("Google","http://www.google.es", R.drawable.google,"Google"),
                new web("Youtbe","http://www.yotube.com",R.drawable.youtube,"Youtbe")
        };

        ListView lst = (ListView)findViewById(R.id.listV);
        lst.setAdapter(new adaptador(this,webs));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> a, View v, int position, long id){
                String url = ((web)a.getItemAtPosition(position)).getUrl();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
