package org.lessons.java.abstract_animals;

public class Delfino extends Animale{
    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    protected void mangia() {
        System.out.println("Piccoli pesci");
    }

    @Override
    protected void verso() {
        System.out.println("Click Click");
    }

}
