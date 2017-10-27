package com.example.dm2.listen;


public class web {
    private String nombre,url,id;
    private int img;

    public web(String nombre, String url, int img, String id){
        this.nombre = nombre;
        this.url = url;
        this.img = img;
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getUrl(){
        return url;
    }

    public int getImg(){
        return img;
    }

    public String getId(){
        return id;
    }
}
