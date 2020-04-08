
/**
 * Beschreiben Sie hier die Klasse Nichteisenmetalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Nichteisenmetalle extends Metalle
{
    private String Hauptelement;
    public Nichteisenmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit, String Hauptelement)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit);
        this.Hauptelement = Hauptelement;
    }

    public void setHauptelement(String Hauptelement)
    {
        this.Hauptelement= Hauptelement;
    }

    public String getHauptelement()
    {
        return Hauptelement;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Hauptelement:   "+ Hauptelement;
        return s;

    }
}
