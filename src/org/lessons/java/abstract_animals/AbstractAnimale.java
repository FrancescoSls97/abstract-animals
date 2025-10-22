package org.lessons.java.abstract_animals;

public abstract class AbstractAnimale {
    //metodo uguale a tutti i discendenti
    public void dormi() {
        System.out.println("Zzz");
    }

    //ogni discendente avrà un modo diverso di usare il metodo
    public abstract void verso();

    public abstract void mangia();
}
