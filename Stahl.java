
/**
 * Die Klasse Stahl ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Kohlenstoffgehalt und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11. April 2020
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
