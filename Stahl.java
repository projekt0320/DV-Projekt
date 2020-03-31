
/**
 * Beschreiben Sie hier die Klasse Stahl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stahl extends Eisenmetalle
{
    private double Kohlenstoffgehalt;
    
    public Stahl(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double eisengehalt, double Kohlenstoffgehalt)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit ,eisengehalt);
        this.Kohlenstoffgehalt = Kohlenstoffgehalt;
    }
    public void setKohlenstoffgehalt(double Kohlenstoffgehalt)
    {
        this.Kohlenstoffgehalt= Kohlenstoffgehalt;
    }
    public double getKohlenstoffgehalt()
    {
       return Kohlenstoffgehalt;
    }
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"    Kohlenstoffgehalt: "+Kohlenstoffgehalt;
        return s;
    }
}
