import java.util.Scanner;

public class ex {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Vuoi calcolare?");
        int contatore = 0;

        for (int i = 1; i > 0;) {

            String input = myObj.nextLine();

            if (input.equals("si")) {
                System.out.println("Scegli un'operazione: 1 per la somma, 2 per la sottrazione");
                int risposta = myObj.nextInt();
                int numeroUtente = myObj.nextInt();
                int numeroUtente2 = myObj.nextInt();
                int risultatoSbagliato = (int) (Math.random() * 101);
                contatore++;
                switch (risposta) {

                    case 1:

                        System.out.println("Inserisci 2 numeri");
                        int somma = numeroUtente + numeroUtente2;
                        System.out.println("Il risultato è:" + " " + somma + " e" + " " + risultatoSbagliato);
                        System.out.println("Hai effettuato " + contatore + " operazioni");
                        break;

                    case 2:

                        System.out.println("Inserisci 2 numeri");
                        int sottrazione = numeroUtente - numeroUtente2;
                        System.out.println("Il risultato è:" + " " + sottrazione + " e" + " " + risultatoSbagliato);
                        System.out.println("Hai effettuato " + contatore + " operazioni");
                        break;

                    default:

                        break;
                }

            } else {
                System.out.println("Hai effettuato " + contatore + " operazioni");
            }
        }
    }
}
