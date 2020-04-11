
/**
 * Die Klasse Leichtmetalle ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Hauptelement und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Leichtmetalle extends Nichteisenmetalle
{
    private double Dichte;
    
    public Leichtmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double Dichte, String Hauptelement)

    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit,Hauptelement);
        if(Dichte>0)
        {
            
        this.Dichte = Dichte;
        }
    }

    public void setDichte(double Dichte)
    {
        if(Dichte>0)
        {
        this.Dichte= Dichte;
        }
    }

    public double getDichte()
    {
        return Dichte;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Dichte:   "+ Dichte;
        return s;
    }
}
