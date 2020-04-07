
/**
 * Beschreiben Sie hier die Klasse Schwermetalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schwermetalle extends Nichteisenmetalle
{
    private String Verformbarkeit;
    public Schwermetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,String Hauptelement, String Verformbarkeit)

    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit,Hauptelement);
        this.Verformbarkeit = Verformbarkeit;
    }

    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }

    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ ",      Verformbarkeit: "+ Verformbarkeit;
        return s;
    }
}
