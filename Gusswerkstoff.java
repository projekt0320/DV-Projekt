
/**
 * Die Klasse Gusswerkstoff ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Siedetemperatur und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
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
