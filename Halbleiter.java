
/**
 * Die Klasse Halbleiter ist eine Subklasse von "Werkstoffe", initialisiert das Attribut elektrische Leitfähigkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Halbleiter extends Nichtmetalle
{
    private double ElektrischeLeitfaehigkeit;
    
    public Halbleiter(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,double ElektrischeLeitfaehigkeit)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
       setElektrischeLeitfaehigkeit( ElektrischeLeitfaehigkeit);
    }

    public void setElektrischeLeitfaehigkeit(double ElektrischeLeitfaehigkeit)
    {
        if(ElektrischeLeitfaehigkeit>0 && ElektrischeLeitfaehigkeit <= 62)
        {
        this.ElektrischeLeitfaehigkeit= ElektrischeLeitfaehigkeit;
        }
        else
        {
            System.out.println("Die angegebene elektrische Leitfähigkeit ist ungültig");
        }
    }

    public double getElektrischeLeitfaehigkeit()
    {
        return ElektrischeLeitfaehigkeit;
    }

    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n elektrische Leitfaehigkeit:   "+ ElektrischeLeitfaehigkeit;
        return s;
    }
}