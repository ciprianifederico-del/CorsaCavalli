package com.example;

public class Main {
    public static void main(String[] args) {
        Cavallo Fulmine = new Cavallo("Fulmine");
        Cavallo Barletta = new Cavallo("Barletta");
        Cavallo Caltanissetta = new Cavallo("Caltanissetta");
        Cavallo Roggero = new Cavallo("Roggero");
        Cavallo Ladro= new Cavallo("Ladro");
        
        Fulmine.start();
        Barletta.start();
        Caltanissetta.start();
        Roggero.start();
        Ladro.start();
    }
}