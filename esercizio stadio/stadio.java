import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Stadio {

    public static void main(String[] args) {
        Random random = new Random();

        // numero di weekend da valutare
        Scanner myObj = new Scanner(System.in);
        System.out.println("Scegli il numero di weekend da valutare");
        int risposta = myObj.nextInt();

        int numeroWeekend = risposta;

        // preparo l'arrayList che conterrà gli incassi di ogni weekend
        ArrayList<Integer> incassiWeekend = new ArrayList<>();

        // preparo l'arrayList che conterrà gli spettatori di ogni weekend
        ArrayList<Integer> spettatoriWeekend = new ArrayList<>();

        int weekendCorrente = 0;

        // calcolo il numero degli spettatori e l'incasso di ogni weekend
        do {
            int spettatoriSabato = random.nextInt(70000) + 1;
            int incassoSabato = spettatoriSabato * 20;

            int spettatoriDomenica = random.nextInt(70000) + 1;
            int incassoDomenica = spettatoriDomenica * 15;

            // INCASSO TOTALE DEL WEEKEND
            int incassoTotaleWeekend = incassoSabato + incassoDomenica;
            incassiWeekend.add(incassoTotaleWeekend);
            weekendCorrente++;

            // SPETTATORI TOTALI WEEKEND
            int spettatoriTotaliWeekend = spettatoriSabato + spettatoriDomenica;
            spettatoriWeekend.add(spettatoriTotaliWeekend);

        } while (weekendCorrente < numeroWeekend);

        // stampo
        System.out.println("Incassi per weekend: " + incassiWeekend);
        System.out.println("Spettatori per weekend: " + spettatoriWeekend);

        // devo fare in modo che l'utente, dopo aver scelto il numero di weekend da
        // valutare, possa scegliere di vedere la stima minima e massima sia degli
        // incassi sia degli spettatori

        System.out.println("Scegli quale operazione vuoi fare:");
        System.out.println("1. Incasso minimo");
        System.out.println("2. Incasso massimo");
        System.out.println("3. Minimo degli spettatori");
        System.out.println("4. Massimo degli spettatori");
        System.out.println("5. Esci");

        int scelta = myObj.nextInt();
        do {
            switch (scelta) {
                case 1:
                    int incassoMinimo = Collections.min(incassiWeekend);
                    System.err.println("Incasso minimo tra i weekend valutati: " + incassoMinimo);
                    System.err.println("Vuoi fare un'altra operazione?");
                    break;
                case 2:
                    int incassoMassimo = Collections.max(incassiWeekend);
                    System.err.println("Incasso massimo tra i weekend valutati: " + incassoMassimo);
                    System.err.println("Vuoi fare un'altra operazione?");
                    break;
                case 3:
                    int spettatoriMinimo = Collections.min(spettatoriWeekend);
                    System.err.println("Minimo degli spettatori tra i weekend valutati: " + spettatoriMinimo);
                    System.err.println("Vuoi fare un'altra operazione?");
                    break;
                case 4:
                    int spettatoriMassimo = Collections.max(spettatoriWeekend);
                    System.err.println("Massimo degli spettatori tra i weekend valutati: " + spettatoriMassimo);
                    System.err.println("Vuoi fare un'altra operazione?");
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");

            }

            // NON FUNZIONA LA RIPETIZIONE DELL'OPERAZIONE PERCHE' DA SEMPRE LO STESSO
            // RISULTATO

            myObj.nextInt();
        } while (scelta != 5);
    }

}