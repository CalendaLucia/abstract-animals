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

        for (Animal animale : regno) {
            System.out.println(animale.getName());
            System.out.println("è un " + animale.getClass().getSimpleName() + " e mangia ");
            animale.mangia();
            System.out.println("Il suo verso è");
            animale.verso();
            System.out.print("Ora sta ");


            if (animale instanceof IVolante) {
                faiVolare((IVolante) animale);
            } else if (animale instanceof INuotante) {
                faiNuotare((INuotante) animale);
            } else {
                System.out.print("dormendo ");
                animale.dormi();
            }


        }
    }

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }



    }

