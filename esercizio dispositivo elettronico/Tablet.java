import java.util.Random;

class Tablet extends DispositivoElettronico {

    public int puntiUtente;
    public int idUtente = 1;

    // scrivo il metodo tablet
    private void tablet() {
        Random random = new Random();
        puntiUtente = random.nextInt(100) + 1;
        idUtente++;
    }

    // aggiungo il metodo tablet dentro ad avviaApplicazione
    @Override
    public void avviaApplicazione(String nomeApp) {
        super.avviaApplicazione(nomeApp);
        tablet();
        System.out.println("ID Utente: " + idUtente);
        System.out.println("Punti Utente: " + puntiUtente);
    }

    // prova

    // public static void main(String[] args) {
    // Tablet tablet = new Tablet();
    // tablet.avviaApplicazione("facebook");
    // }
}