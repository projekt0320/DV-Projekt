
/**
 * Beschreiben Sie hier die Klasse Gusswerkstoff.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gusswerkstoff extends Eisenmetalle
{
    private double Siedetemperatur;
    
    public Gusswerkstoff(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double eisengehalt,double Siedetemperatur)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit,eisengehalt);
        if(Siedetemperatur>0)
        {
            this.Siedetemperatur = Siedetemperatur;
    
        }
    }
    public void setSiedetemperatur(double Siedetemperatur)
    {
        if(Siedetemperatur>0)
        {
            this.Siedetemperatur= Siedetemperatur;
        }
    }
    public double getSiedetemperatur()
    {
       return Siedetemperatur;
    }
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"\n Siedetemperatur:   "+Siedetemperatur;
        return s; 
    }
}
