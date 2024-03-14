import java.util.Scanner;

class Smartphone extends DispositivoElettronico {

    public String usernameUtente;
    public String passwordUtente;

    // scrivo il metodo login
    private void login(String username, String password) {
        this.usernameUtente = username;
        this.passwordUtente = password;
        System.out.println("Username: " + username + ", Password: " + password);
    }

    // aggiungo il metodo login dentro ad avviaApplicazione
    @Override
    public void avviaApplicazione(String nomeApp) {
        super.avviaApplicazione(nomeApp);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci l'username: ");
        String username = scanner.nextLine();

        System.out.print("Inserisci la password: ");
        String password = scanner.nextLine();
        // login
        login(username, password);

    }

    // prova

    // public static void main(String[] args) {
    // Smartphone smartphone = new Smartphone();
    // smartphone.avviaApplicazione("Facebook");
    // }
}
