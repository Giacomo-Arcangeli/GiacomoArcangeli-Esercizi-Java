
public class PiattoSpeciale {

    // ATTRIBUTI
    private String pane;
    private String condimento;
    private int prezzoPane;
    private int prezzoCondimento;
    private int prezzoTotalePiatto;

    // COSTRUTTORE
    public PiattoSpeciale(String pane, int prezzoPane, String condimento, int prezzoCondimento) {
        this.pane = pane;
        this.prezzoPane = prezzoPane;
        this.condimento = condimento;
        this.prezzoCondimento = prezzoCondimento;
        this.prezzoTotalePiatto = prezzoPane + prezzoCondimento + 1;
    }

    // METODI GET
    public String getPane() {
        return pane;
    }

    public String getCondimento() {
        return condimento;
    }

    public int getPrezzoPane() {
        return prezzoPane;
    }

    public int getPrezzoCondimento() {
        return prezzoCondimento;
    }

    public int getPrezzoTotalePiatto() {
        return prezzoTotalePiatto;
    }

}
