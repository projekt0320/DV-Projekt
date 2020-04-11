
/**
 * Die Klasse Eisenmetalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut Eisengehalt und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11. April 2020
 */
public abstract class Eisenmetalle extends Metalle
{
    private double eisengehalt;
    
    public Eisenmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double eisengehalt)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit);
        if(eisengehalt>0)
        {
            this.eisengehalt= eisengehalt;
        }
    }
    
    public void setEisengehalt(double eisengehalt)
    {
        if(eisengehalt>0)
        {
            this.eisengehalt= eisengehalt;
        }
    }
    
    public double getEisengehalt()
    {
       return eisengehalt;
    }
    
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Eisengehalt:   "+ eisengehalt;
        return s;
    }
    
}