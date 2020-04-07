
/**
 * Beschreiben Sie hier die Klasse Eisenmetalle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Eisenmetalle extends Metalle
{
    private double eisengehalt;
    public Eisenmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double eisengehalt)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit);
        this.eisengehalt= eisengehalt;
    }
    public void setEisengehalt(double eisengehalt)
    {
        this.eisengehalt= eisengehalt;
    }
    public double getEisengehalt()
    {
       return eisengehalt;
    }
    
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ ",      Eisengehalt: "+ eisengehalt;
        return s;
    }
    
}
