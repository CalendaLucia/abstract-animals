package org.learning.java;

import org.learning.java.abstraction.Animal;

public class Passerotto extends Animal {

    public Passerotto(String name, String tipo) {
        super(name,tipo);

    }


    @Override
    public void verso() {
        System.out.println("Cip cip..");
    }

    @Override
    public void mangia() {
        System.out.println("Vermi");
    }
}
