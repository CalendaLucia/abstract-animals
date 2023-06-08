package org.learning.java.abstraction;

public class Aquila extends Animal implements IVolante {

    public Aquila(String name, String tipo) {
        super(name,tipo);
    }


    @Override
    public void verso() {
        System.out.println("Airi");
    }

    @Override
    public void mangia() {
        System.out.println("Vermi e Salmone");
    }


    @Override
    public void vola() {
        System.out.println("volando!!");
    }
}
