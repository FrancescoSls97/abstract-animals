package org.lessons.java.abstract_animals;

public class Delfino extends AbstractAnimale implements INuotante{
    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    public void mangia() {
        System.out.println("Piccoli pesci");
    }

    @Override
    public void verso() {
        System.out.println("Click Click");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }

}
