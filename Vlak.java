
public class Vlak
{
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
}
