package com.Abstract.DesignPattern;

public class NachoFactory {
    public Nacho serveNacho (String type) {
        Nacho nacho = null;

        if (type.equals("Tostitos Baked Scoops")){
        	TostitosNacho nacho1 = new TostitosNacho();
        }
        else if (type.equals("Santitas Tortilla")){
        	SantitasNacho    nacho2 = new SantitasNacho();
        }
        return nacho;
    }
}
