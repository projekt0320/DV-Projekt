
/**
 * Beschreiben Sie hier die Klasse Leichtmetalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Leichtmetalle extends Nichteisenmetalle
{
    private double Dichte;
    public Leichtmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double Dichte, String Hauptelement)

    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit,Hauptelement);
        this.Dichte = Dichte;
    }

    public void setDichte(double Dichte)
    {
        this.Dichte= Dichte;
    }

    public double getDichte()
    {
        return Dichte;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Dichte:   "+ Dichte;
        return s;
    }
}
