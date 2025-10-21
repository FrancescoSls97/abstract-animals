package org.lessons.java.abstract_animals;

public class Aquila extends Animale{

    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    public void mangia() {
        System.out.println("Topi e piccoli animali");
    }

    @Override
    public void verso() {
        System.out.println("Eeeeeeeekkkkk");
    }

}
