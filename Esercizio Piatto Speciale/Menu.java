import java.util.Scanner;

public class Menu {

    public static String[] pane = { "Integrale", "Bianco", "Cereali" };
    public static int[] prezzoPane = { 2, 1, 3 };
    public static String[] condimento = { "Prosciutto", "Salame", "Nutella" };
    public static int[] prezzoCondimento = { 4, 3, 2 };

    public static void main(String[] args) {

        // devo chiedere all'utente di comporre il suo panino
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto, crea il tuo panino");
        System.out.println("Scegli il tipo di pane: 1. Integrale (2€) 2. Bianco (1€) 3. Cereali (3€)");

        int sceltaPane = scanner.nextInt();
        String tipoPane;
        int prezzoPaneScelto;

        if (sceltaPane == 1) {
            tipoPane = pane[0];
            prezzoPaneScelto = prezzoPane[0];
        } else if (sceltaPane == 2) {
            tipoPane = pane[1];
            prezzoPaneScelto = prezzoPane[1];
        } else {
            tipoPane = pane[2];
            prezzoPaneScelto = prezzoPane[2];
        }

        System.out.println(tipoPane);
        System.out.println(prezzoPaneScelto);

        // MANCANO I CONDIMENTI

        // // ora creo l'oggetto con il costruttore
        // PiattoSpeciale panino = new PiattoSpeciale(tipoPane, prezzoPaneScelto);
        // System.out.println(panino);
    }
}
