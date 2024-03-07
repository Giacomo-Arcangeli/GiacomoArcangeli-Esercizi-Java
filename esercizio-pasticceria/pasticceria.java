import java.util.ArrayList;
import java.util.Scanner;

public class pasticceria {

    public static void main(String[] args) {

        // creo le liste degli ingredienti
        ArrayList<String> basi = new ArrayList<String>();
        basi.add("Pan di Spagna");
        basi.add("Biscotto");
        basi.add("Savoiardo");

        ArrayList<String> ripieni = new ArrayList<String>();
        ripieni.add("Crema pasticcera");
        ripieni.add("Marmellata");
        ripieni.add("Cioccolato");

        ArrayList<String> frutta = new ArrayList<String>();
        frutta.add("Fragola");
        frutta.add("Banana");
        frutta.add("Mela");

        ArrayList<String> decorazioni = new ArrayList<String>();
        decorazioni.add("Glassa al cioccolato");
        decorazioni.add("Zucchero a velo");
        decorazioni.add("Caramello");

        /*
         * devo far in modo che il cliente possa selezionare gli ingredienti e comporre
         * il proprio dolce
         */

        // creo l'arrayList che conterrà le scelte del cliente

        ArrayList<String> scelteCliente = new ArrayList<String>();

        // prendo tutte le scelte del cliente e le inserisco nell'arrayList, anche
        // random

        Scanner input = new Scanner(System.in);

        System.out.println("Scegli una base o in alternativa scrivi random per selezionare casualmente");
        String baseCliente = input.nextLine();

        if (baseCliente.equals("random")) {
            scelteCliente.add(basi.get(1 + 1));
        } else {
            scelteCliente.add(baseCliente);
        }

        System.out.println("Scegli un ripieno o in alternativa scrivi random per selezionare casualmente");
        String ripienoCliente = input.nextLine();
        if (ripienoCliente.equals("random")) {
            scelteCliente.add(ripieni.get(1 + 1));
        } else {
            scelteCliente.add(ripienoCliente);
        }

        System.out.println("Scegli un frutto o in alternativa scrivi random per selezionare casualmente");
        String fruttoCliente = input.nextLine();
        if (fruttoCliente.equals("random")) {
            scelteCliente.add(frutta.get(2));
        } else {
            scelteCliente.add(fruttoCliente);
        }

        System.out.println("Scegli una decorazione o in alternativa scrivi random per selezionare casualmente");
        String decoorazioneCliente = input.nextLine();
        if (decoorazioneCliente.equals("random")) {
            scelteCliente.add(decorazioni.get(0));
        } else {
            scelteCliente.add(decoorazioneCliente);
        }

        // compongo il messaggio per il cliente
        System.out.println("Il tuo dolce ha i seguenti ingredienti: " + scelteCliente);

    }

}
