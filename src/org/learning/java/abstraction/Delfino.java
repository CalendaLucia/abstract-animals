package org.learning.java.abstraction;

public class Delfino extends Animal implements INuotante {

    public Delfino(String name, String tipo) {
        super(name,tipo);
    }



    @Override
    public void verso() {
        System.out.println("HIHI");
    }

    @Override
    public void mangia() {
        System.out.println("Acciughe e Sardine");
    }

    @Override
    public void nuota() {
        System.out.println("nuotando");
    }
}
