package org.learning.java.abstraction;

public abstract class Animal {
    private String name;
     private String tipo;

    public Animal (String name, String tipo) {
        this.name = name;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setName(String name) {
        this.name = name;
    }

    //METODI

    public void dormi() {
        System.out.println("zzzzz....");
    }

    public abstract void verso();

    public abstract void mangia();
}
