import java.util.Random;

class Tablet extends DispositivoElettronico {

    public int puntiUtente;
    public int idUtente;

    public Tablet(int idUtente) {
        this.idUtente = idUtente;
    }

    private void puntiUtente() {
        Random random = new Random();
        puntiUtente = random.nextInt(100) + 1;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public int getPuntiUtente() {
        return puntiUtente;
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        super.avviaApplicazione(nomeApp);
        puntiUtente();
        System.out.println("ID Utente: " + idUtente);
        System.out.println("Punti Utente: " + puntiUtente);
        idUtente++;
    }

}