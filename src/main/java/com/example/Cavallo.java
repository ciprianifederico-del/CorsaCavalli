package com.example;
import java.util.Random;

public class Cavallo extends Thread{
    
    private String nome;

    public Cavallo(String nome) {
        this.nome = nome;
    }

    public void run(){
        Random casuale = new Random();
        int numero = 0;
        boolean finito = true; 
        for (int i=0;i<=1000;i+=numero){
            numero = casuale.nextInt(101); 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                 System.out.println("Il thread è stato interrotto.");
                e.printStackTrace();
            }
            if (numero == 0) {
                System.out.println(nome +" è inciampiato al metro "+ i);
                finito = false;
                break;
            }
            System.out.println(nome + " è al metro "+ i);

        }
        if (finito) {
            System.out.println(nome + " ha finito la gara");
        }
    }
}
    