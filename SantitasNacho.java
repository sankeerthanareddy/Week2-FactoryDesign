package com.Abstract.DesignPattern;

public class SantitasNacho extends Dinner{
    public void prepare(){
        System.out.println("Preparing Santitas");
    }
    public Nacho createNacho(String type){
        return new SantitasStyle();
    }
}
