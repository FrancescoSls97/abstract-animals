package org.lessons.java.abstract_animals;



public class Cane extends AbstractAnimale {
  
    //override per dare indicazioni specifiche ai metodi ereditati
    @Override
    public void verso(){
        System.out.println("Bau Bau");
    }

    @Override
    public void mangia(){
        System.out.println("Croccantini");
    }


}
