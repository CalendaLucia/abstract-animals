package org.learning.java;

import org.learning.java.abstraction.Animal;
import org.learning.java.abstraction.IVolante;

public class Passerotto extends Animal implements IVolante {

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

    @Override
    public void vola() {
        System.out.println("volando!!");
    }


}
