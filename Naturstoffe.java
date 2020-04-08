
/**
 * Beschreiben Sie hier die Klasse Naturstoffe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Naturstoffe extends Nichtmetalle
{
    private String Degradation;
    public Naturstoffe(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,String Degradation)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        this.Degradation = Degradation;
    }
    public void setDegradation(String Degradation)
    {
        this.Degradation=Degradation;
    }
    public String getDegradation()
    {
        return Degradation;
    }
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"\n Degradation:   "+Degradation;
        return s;
    }
}
