
/**
 * Beschreiben Sie hier die Klasse Kunststoffe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kunststoffe extends Nichtmetalle
{
    private String Verformbarkeit;
    public Kunststoffe(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,String Verformbarkeit)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        this.Verformbarkeit = Verformbarkeit;
    }
    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }
    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"     ,Verformbarkeit: "+Verformbarkeit;
        return s;
    }
}
