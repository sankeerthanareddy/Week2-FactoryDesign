package com.Abstract.DesignPattern;
public class TostitosNacho extends Dinner{
    public void prepare(){
        System.out.println("Preparing Tostitos");
    }
    public Nacho createNacho(String type){
        return new TostitosStyle();
    }
}
