package com.company;

/**
 * Created by bsanche on 2/21/2017.
 */


public class Etakemon {
    private String nombre;
    private static int numeroPokemon =0;
    private int lvl;
    private int id;

    public Etakemon(){

//        numeroPokemon++;
        Etakemon.setNumeroPokemon(numeroPokemon+1); // no puedo poner ++; en el argumento sino BOOM
        this.id=Etakemon.numeroPokemon;

    }

    public Etakemon (String nombre, int lvl)
    {

        this.lvl = lvl;
        this.nombre=nombre;
        numeroPokemon++;
        id=numeroPokemon;

    }

    public Etakemon(String nombre){

        this.nombre=nombre;
        numeroPokemon++;
        id=numeroPokemon;  // aqui no pongo ++ xq no necesito qwe suba, sera el mismo SEMPRE
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNumeroPokemon() {
        return numeroPokemon;
    }

    public static void setNumeroPokemon(int numeroPokemon) {
        Etakemon.numeroPokemon = numeroPokemon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }




}

