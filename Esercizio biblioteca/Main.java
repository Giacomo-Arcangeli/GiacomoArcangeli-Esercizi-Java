public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Harry Potter", 10, 10, 0);
        Libro libro2 = new Libro("The Lord of The Rings", 8, 8, 0);
        Libro libro3 = new Libro("Game of Thrones", 15, 15, 0);

        biblioteca.elencoLibri.add(libro1);
        biblioteca.elencoLibri.add(libro2);
        biblioteca.elencoLibri.add(libro3);

        biblioteca.stampaLibriDisponibili();

        libro1.prestaLibro();
        libro1.restituisciLibro();
        biblioteca.aggiungiLibro();
        biblioteca.rimuoviLibro();
    }
}
