
/**
 * Beschreiben Sie hier die Klasse Nichtmetalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class  Nichtmetalle extends Werkstoffe
{
    private String metallAehnlicheEigenschaften;
    public Nichtmetalle(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften)
    {
        super(name,nummer,verwendung);
        this.metallAehnlicheEigenschaften = metallAehnlicheEigenschaften;
    }
    public void setMetallAehnlicheEigenschaften(String metallAehnlicheEigenschaften)
    {
        this.metallAehnlicheEigenschaften=metallAehnlicheEigenschaften;
    }
    public String gibEigenschaft()
    {
        String s= "name: "+Werkstoffe.getName()+",      nummer: "+Werkstoffe.getNummer()+ ",      verwendung: "+Werkstoffe.getVerwendung()+",     metallAehnlicheEigenschaften"+metallAehnlicheEigenschaften;
        return s;
    }
    
}
