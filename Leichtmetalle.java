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
    
    public Leichtmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit,double Dichte, String Hauptelement)throws Exception

    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit,Hauptelement);
        setDichte(Dichte);
    }

    public void setDichte(double Dichte)
    {
        if(Dichte>0.5 && Dichte< 5)
        {
        this.Dichte= Dichte;
        }
        else
        {
            System.out.println("Die angegebene Dichte ist ungültig");
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