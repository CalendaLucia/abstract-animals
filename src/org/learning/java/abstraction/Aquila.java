package org.learning.java.abstraction;

public class Aquila extends Animal{

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
}
