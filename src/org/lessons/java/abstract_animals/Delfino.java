package org.lessons.java.abstract_animals;

public class Delfino extends Animale{
    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    public void mangia() {
        System.out.println("Piccoli pesci");
    }

    @Override
    public void verso() {
        System.out.println("Click Click");
    }

}
