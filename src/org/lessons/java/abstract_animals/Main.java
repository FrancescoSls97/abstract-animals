package org.lessons.java.abstract_animals;

public class Main {

    static void faiVolare(IVolante animale) {
        animale.vola();
    }

    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) throws Exception {

        Cane cane = new Cane();
        System.out.println("----------");
        System.out.println("Mentre il cane dorme:");
        cane.dormi();
        System.out.println("Il cane mangia:");
        cane.mangia();
        System.out.println("Verso del cane:");
        cane.verso();
        System.out.println("----------");

        Aquila aquila = new Aquila();
        System.out.println("----------");
        System.out.println("Mentre l'aquila dorme:");
        aquila.dormi();
        System.out.println("Il aquila mangia:");
        aquila.mangia();
        System.out.println("Verso dell' aquila:");
        aquila.verso();
        faiVolare(aquila);
        System.out.println("----------");

        Passerotto passerotto = new Passerotto();
        System.out.println("----------");
        System.out.println("Mentre il passerotto dorme:");
        passerotto.dormi();
        System.out.println("Il passerotto mangia:");
        passerotto.mangia();
        System.out.println("Verso dell passerotto:");
        passerotto.verso();
        faiVolare(passerotto);
        System.out.println("----------");

        Delfino delfino = new Delfino();
        System.out.println("----------");
        System.out.println("Mentre il delfino dorme:");
        delfino.dormi();
        System.out.println("Il delfino mangia:");
        delfino.mangia();
        System.out.println("Verso del delfino:");
        delfino.verso();
        faiNuotare(delfino);
        System.out.println("----------");

    }

}
