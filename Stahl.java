
/**
 * Beschreiben Sie hier die Klasse Stahl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stahl extends Eisenmetalle
{
    private double Kohlenstoffgehalt;
    
    public Stahl(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double eisengehalt, double Kohlenstoffgehalt) throws Exception
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit ,eisengehalt) ;
        if(Kohlenstoffgehalt>0 && Kohlenstoffgehalt< 100)
        {
            this.Kohlenstoffgehalt = Kohlenstoffgehalt;
    
        }
        else
        {
            throw new Exception ("Ungültiger Kohlenstoffgehalt.");
        }
    }
    public void setKohlenstoffgehalt(double Kohlenstoffgehalt)
    {
        if(Kohlenstoffgehalt>0 && Kohlenstoffgehalt< 100)
        {
            this.Kohlenstoffgehalt= Kohlenstoffgehalt;
        }
    }
    public double getKohlenstoffgehalt()
    {
       return Kohlenstoffgehalt;
    }
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"\n Kohlenstoffgehalt:   "+Kohlenstoffgehalt;
        return s;
    }
}
