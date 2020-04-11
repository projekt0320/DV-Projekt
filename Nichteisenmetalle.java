
/**
 * Die Klasse Nichteisenetalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut Hauptelement
 * und enthält sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public abstract class Nichteisenmetalle extends Metalle
{
    private String Hauptelement;
    
    public Nichteisenmetalle(String name,int nummer,String verwendung,double elektrischeLeitfaehigkeit, String Hauptelement)
    {
        super(name,nummer,verwendung,elektrischeLeitfaehigkeit);
        this.Hauptelement = Hauptelement;
    }

    public void setHauptelement(String Hauptelement)
    {
        this.Hauptelement= Hauptelement;
    }

    public String getHauptelement()
    {
        return Hauptelement;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Hauptelement:   "+ Hauptelement;
        return s;

    }
}