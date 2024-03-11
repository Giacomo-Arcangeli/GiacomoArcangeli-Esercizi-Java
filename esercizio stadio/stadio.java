import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class stadio {

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

    }

}