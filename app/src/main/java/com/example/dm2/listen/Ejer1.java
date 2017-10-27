package com.example.dm2.listen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class Ejer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1);

        /*COGEMOS EL SPINNER*/
        Spinner spinner = (Spinner) findViewById(R.id.spin);
        /*COGEMOS LOS DATOS XML*/
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.paises, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        /*AÑADIMOS LOS DATOS AL SPINNER*/
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Spinner spinner=(Spinner) findViewById(R.id.spin);
                int numero = spinner.getSelectedItemPosition();

                HashMap<Integer,String> hash=new HashMap<Integer, String>();
                hash.put(1,"505,990 km² - 46.56 millones");
                hash.put(2,"301,338 km² - 60.6 millones");
                hash.put(3,"1.566 millones km² - 3.027 millones");

                String text=hash.get((numero+1));

                TextView t=(TextView) findViewById(R.id.textoVer);
                t.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });
    }

}
