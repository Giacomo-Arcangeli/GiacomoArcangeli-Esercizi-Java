import java.util.Random;

public class stadio {

    public static void main(String[] args) {
        Random random = new Random();

        // preparo ID e Incasso
        int idSpettatore = 0;
        int incassoTotale = 0;

        // simulo incasso sabato
        int spettatoriSabato = random.nextInt(70000) + 1;
        int incassoSabato = spettatoriSabato * 20;
        incassoTotale += incassoSabato;
        idSpettatore += spettatoriSabato;

        // simulo incasso domenica
        int spettatoriDomenica = random.nextInt(70000) + 1;
        int incassoDomenica = spettatoriDomenica * 15;
        incassoTotale += incassoDomenica;
        idSpettatore += spettatoriDomenica;
    }
}