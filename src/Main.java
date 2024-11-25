import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String razza;
        int eta, scelta;
        float peso;
        ArrayList<Animale> animali = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Menù:");
            System.out.println("1. Inserisci animale.");
            System.out.println("2. Stampa animali.");
            System.out.println("Premi 0 per uscire dal programma...");
            scelta = Integer.parseInt(userInput.nextLine());
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci razza dell'animale:");
                    razza = userInput.nextLine();
                    System.out.println("Inserisci età dell'animale:");
                    eta = Integer.parseInt(userInput.nextLine());
                    System.out.println("Inserisci peso dell'animale:");
                    peso = Float.parseFloat(userInput.nextLine());
                    Animale a = new Animale(razza, eta, peso);
                    animali.add(a);
                    break;
                case 2:
                    for (Animale temp : animali) {
                        temp.stampa();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Inserisci valore valido!");
                    break;
            }
        } while (scelta != 0);
    }
}
