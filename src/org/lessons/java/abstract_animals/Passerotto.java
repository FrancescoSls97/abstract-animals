package org.lessons.java.abstract_animals;

public class Passerotto extends Animale {

    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    protected void mangia() {
        System.out.println("Semi");
    }

    @Override
    protected void verso() {
        System.out.println("Cip Cip");
    }

}
