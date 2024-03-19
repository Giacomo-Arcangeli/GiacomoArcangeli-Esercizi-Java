import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<Libro> elencoLibri = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // AGGIUNGI LIBRO
    public void aggiungiLibro() {
        System.out.println("Scrivi il titolo del libro che vuoi aggiungere");
        String titoloLibroAggiunto = scanner.nextLine();
        System.out.println("Quante copie vuoi aggiungere?");
        int numeroCopieLibroAggiunto = scanner.nextInt();

        Libro nuovoLibro = new Libro(titoloLibroAggiunto, numeroCopieLibroAggiunto, numeroCopieLibroAggiunto, 0);

        elencoLibri.add(nuovoLibro);
    }

    // RIMUOVI LIBRO
    public void rimuoviLibro() {
        System.out.println("Quale libro vuoi rimuovere?");
        String titoloLibroDaRimuovere = scanner.nextLine();

        Libro libroDaRimuovere = null;
        for (Libro libro : elencoLibri) {
            if (libro.titolo.equalsIgnoreCase(titoloLibroDaRimuovere)) {
                libroDaRimuovere = libro;
                break;
            }
        }

        if (libroDaRimuovere != null) {
            elencoLibri.remove(libroDaRimuovere);
            System.out.println("Hai rimosso il libro: " + libroDaRimuovere.titolo);
        } else {
            System.out.println("Il libro " + titoloLibroDaRimuovere + " non è presente nell'elenco.");
        }

    }

    // QUESTO METODO RIMUOVE L'OGGETTO LIBRO MA NON PERMETTE ALL'UTENTE DI
    // SELEZIONARE IL NOME DEL LIBRO
    // public void rimuoviLibro(Libro libro) {
    // if (elencoLibri.contains(libro)) {
    // elencoLibri.remove(libro);
    // System.out.println("Hai rimosso il libro: " + libro.titolo);
    // } else {
    // System.out.println(libro.titolo + " non è presente nell'elenco");
    // }
    // }

    // STAMPA LIBRI DISPONIBILI
    public void stampaLibriDisponibili() {

        if (!elencoLibri.isEmpty()) {
            System.out.println("Libri disponibili:");
            for (int i = 0; i < elencoLibri.size(); i++) {
                Libro libro = elencoLibri.get(i);
                System.out.println(
                        "Titolo: " + libro.titolo + " / " + "Copie disponibili: " + libro.numeroCopieDisponibili);
            }
        } else {
            System.out.println("Non ci sono libri disponibili nella biblioteca.");
        }

    }
}