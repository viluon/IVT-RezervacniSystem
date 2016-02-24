
public class Vlak
{
    private static double koeficientCeny;

    private String oznaceni;
    private Trasa trasa;
    private int kapacita;

    private int cenaRezervaci;
    private String[][] evidenceRezervaci;

    public Vlak( String o, Trasa t, int k )
    {
        this.oznaceni = o;
        this.trasa = t;
        this.kapacita = k;

        this.cenaRezervaci = 0;
        this.evidenceRezervaci = null;
        // this.evidenceRezervaci = new String[ this.kapacita ][ this.trasa.];
    }

    // Pocatecni stanice, koncova stanice
    public int nalezeniVolnehoMista( String pS, String kS )
    {
        return 0;
    }
}
