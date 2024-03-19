import java.util.ArrayList;

public class Libro {

    String titolo;
    int numeroCopieTotali;
    int numeroCopieDisponibili;
    int numeroCopiePrestito;

    // COSTRUTTORE
    public Libro(String titolo, int numeroCopieTotali, int numeroCopieDisponibili, int numeroCopiePrestito) {
        this.titolo = titolo;
        this.numeroCopieTotali = numeroCopieTotali;
        this.numeroCopieDisponibili = numeroCopieDisponibili;
        this.numeroCopiePrestito = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getNumeroCopieDisponibili() {
        return numeroCopieDisponibili;
    }

    public int getNumeroCopiePrestito() {
        return numeroCopiePrestito;
    }

    // PRESTA LIBRO
    public void prestaLibro() {
        if (numeroCopieDisponibili > 0) {
            numeroCopieDisponibili--;
            numeroCopiePrestito++;
            System.out.println("Hai prenotato una copia di: " + titolo);
        } else {
            System.out.println("Non ci sono più copie disponibili");
        }
    }

    // RESTITUISCI LIBRO
    public void restituisciLibro() {
        if (numeroCopiePrestito > 0) {
            numeroCopieDisponibili++;
            numeroCopiePrestito--;
            System.out.println("Hai restituito: " + titolo);
        } else {
            System.out.println("Non ci sono copie di " + titolo + " in prestito");
        }
    }
}
