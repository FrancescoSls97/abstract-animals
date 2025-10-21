import org.lessons.java.abstract_animals.Animale;
import org.lessons.java.abstract_animals.Aquila;
import org.lessons.java.abstract_animals.Cane;
import org.lessons.java.abstract_animals.Delfino;
import org.lessons.java.abstract_animals.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {

        Animale cane = new Cane();
        System.out.println("----------");
        System.out.println("Mentre il cane dorme:");
        cane.dormi();
        System.err.println("Il cane mangia:");
        cane.mangia();
        System.out.println("Verso del cane:");
        cane.verso();
        System.out.println("----------");

        Animale aquila = new Aquila();
        System.out.println("----------");
        System.out.println("Mentre l'aquila dorme:");
        aquila.dormi();
        System.err.println("Il aquila mangia:");
        aquila.mangia();
        System.out.println("Verso dell' aquila:");
        aquila.verso();
        System.out.println("----------");

        Animale passerotto = new Passerotto();
        System.out.println("----------");
        System.out.println("Mentre il passerotto dorme:");
        passerotto.dormi();
        System.err.println("Il passerotto mangia:");
        passerotto.mangia();
        System.out.println("Verso dell passerotto:");
        passerotto.verso();
        System.out.println("----------");

    Animale delfino = new Delfino();
    System.out.println("----------");
        System.out.println("Mentre il delfino dorme:");
        delfino.dormi();
        System.err.println("Il delfino mangia:");
        delfino.mangia();
        System.out.println("Verso del delfino:");
        delfino.verso();
        System.out.println("----------");
}

}
