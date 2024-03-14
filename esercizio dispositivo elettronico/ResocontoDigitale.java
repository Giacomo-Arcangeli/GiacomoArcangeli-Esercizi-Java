public class ResocontoDigitale {

    // creo un metodo che stampa tutti i dati
    public static void stampaResoconto() {
        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();
        smartphone.avviaApplicazione("Facebook");
        tablet.avviaApplicazione("Facebook");
        System.out.println("Resoconto Digitale:");
        System.out.println("Username: " + smartphone.getUsername());
        System.out.println("Password: " + smartphone.getPassword());
        System.out.println("ID utente: " + tablet.getIdUtente());
        System.out.println("Punti utente: " + tablet.getPuntiUtente());

    }

    public static void main(String[] args) {
        stampaResoconto();
    }
}
