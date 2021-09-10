package com.Abstract.DesignPattern;

public abstract class Dinner{
    public Nacho serveNacho (String type){
        Nacho nacho;
        
        nacho = createNacho (type);
        nacho.prepare();
        nacho.sauce();
        nacho.decorate();

        return nacho;
    }
    protected abstract Nacho createNacho(String type);
}