package org.lessons.java.abstract_animals;

public class Cane extends Animale{
  
    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    protected void verso(){
        System.out.println("Bau Bau");
    }

    @Override
    protected void mangia(){
        System.out.println("Croccantini");
    }

}
