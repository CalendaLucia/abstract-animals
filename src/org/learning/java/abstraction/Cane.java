package org.learning.java.abstraction;

public class Cane extends Animal{


    public Cane(String name, String tipo) {
        super(name,tipo);

    }


    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Crocchette" + " Carne");
    }
}
