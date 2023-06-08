package org.learning.java.abstraction;

import org.learning.java.Passerotto;

public class RegnoAnimale {
    public static void main(String[] args) {

        System.out.println("Benvenuti nel Regno Animale!!");

        Animal[] regno = new Animal[4];
        regno[0] = new Cane("Ray", "cane");
        regno[1] = new Passerotto("Gino", "passerotto");
        regno[2] = new Aquila("Raven", "aquila");
        regno[3] = new Delfino("Giorgio", "delfino");

        for (Animal action : regno) {
            System.out.println(action.getName());
            System.out.println("è un " + action.getTipo() +  " e mangia ");
            action.mangia();
            System.out.println("Il suo verso è: ");
            action.verso();
            System.out.println("Ora dorme! ");
            action.dormi();

        }
    }
}
