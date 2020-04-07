
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
<<<<<<< HEAD
        String s= "name: "+this.getName()+",      nummer: "+this.getNummer()+ ",      verwendung: "+this.getVerwendung()+",      metallAehnlicheEigenschaften"+metallAehnlicheEigenschaften;
=======
        String s=/* "name: "+this.getName()+",      nummer: "+this.getNummer()+ ",      verwendung: "+this.getVerwendung()+",      */"metallAehnlicheEigenschaften"+metallAehnlicheEigenschaften;
>>>>>>> 735b2dc835e4f0ed1fe1d06eba30b755012ae8c5
        return s;
    }
    
}
