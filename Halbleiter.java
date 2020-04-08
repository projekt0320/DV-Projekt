
/**
 * Beschreiben Sie hier die Klasse Halbleiter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Halbleiter extends Nichtmetalle
{
    private double ElektrischeLeitfaehigkeit;
    public Halbleiter(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,double ElektrischeLeitfaehigkeit)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        if(ElektrischeLeitfaehigkeit>0)
        {
            this.ElektrischeLeitfaehigkeit = ElektrischeLeitfaehigkeit;
         }
    }

    public void setElektrischeLeitfaehigkeit(double ElektrischeLeitfaehigkeit)
    {
        if(ElektrischeLeitfaehigkeit>0)
        {
        this.ElektrischeLeitfaehigkeit= ElektrischeLeitfaehigkeit;
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
