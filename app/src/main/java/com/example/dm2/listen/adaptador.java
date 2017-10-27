package com.example.dm2.listen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador extends ArrayAdapter<web>{
    private web[] datos;

    public adaptador(@NonNull Context context, @NonNull web[] datos) {
        super(context, R.layout.verweb, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.verweb, null);

        TextView nombre = (TextView)item.findViewById(R.id.nombreWeb);
        nombre.setText(datos[position].getNombre());

        TextView url = (TextView)item.findViewById(R.id.urlWeb);
        url.setText(datos[position].getUrl());

        ImageView img = (ImageView)item.findViewById(R.id.imgWeb);
        img.setImageResource(datos[position].getImg());

        TextView id = (TextView)item.findViewById(R.id.idWeb);
        id.setText(datos[position].getId());

        return item;
    }
}
