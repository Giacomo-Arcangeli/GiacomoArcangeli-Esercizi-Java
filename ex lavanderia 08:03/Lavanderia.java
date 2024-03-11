import java.util.Scanner;

public class Lavanderia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String password;
        double importo;
        String nomeLogin;
        String passwordLogin;
        int lavatriciOccupate = 0;
        int panni = 0;
        double soldiSpesi = 0;

        // controlli per verificare se l'utente si è registrato correttamente

        // nome

        do {
            System.out.println("Inserisci il tuo nome");
            nome = sc.nextLine();
            if (nome.length() < 2) {
                System.out.println("Inserisci un nome valido");

            }
        } while (nome.length() < 2);

        // password
        do {
            System.out.println("Inserisci la password");
            password = sc.nextLine();
            if (password.length() < 5) {
                System.out.println("Inserisci una password con almeno 5 caratteri");
            }
        } while (password.length() < 2);

        // importo
        do {
            System.out.println("Inserisci l'importo");
            importo = sc.nextDouble();
            if (importo < 1.00) {
                System.out.println("devi inserire almeno 1 euro");
            }
        } while (importo < 1.00);

        // login
        do {
            System.out.println("inserisci nome");
            nomeLogin = sc.next();
            if (!(nomeLogin.equals(nome))) {
                System.out.println("nome errato");
            }
        } while (!(nomeLogin.equals(nome)));

        do {
            System.out.println("inserisci password");
            passwordLogin = sc.next();
            if (!(passwordLogin.equals(nome))) {
                System.out.println("password errato");
            }
        } while (!(passwordLogin.equals(password)));

        System.out.println("quanti panni vuoi caricare?");
        panni = sc.nextInt();

        // lavatrici
        for (int i = 0; i < panni; i++) {
            if (panni == 10) {
                lavatriciOccupate++;
            }
            if (importo > 20) {
                importo -= 0.50;
                soldiSpesi += 0.50;

            } else if (importo == 0) {
                System.out.println("Credito esaurito . Vuoi ricaricare 10 euro pagandone 8?");
                String scelta = sc.nextLine();
                if (scelta.equals("si")) {
                    importo += 10;
                    continue;
                } else if (scelta.equals("no")) {
                    break;
                } else if (importo < 20) {
                    importo -= 1.00;
                    soldiSpesi += 1.00;

                }
            }
        }

        System.out.println(importo + " " + lavatriciOccupate + " " + soldiSpesi);

    }
}