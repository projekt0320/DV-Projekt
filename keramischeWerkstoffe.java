
/**
 * Beschreiben Sie hier die Klasse keramischeWerkstoffe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class keramischeWerkstoffe extends Nichtmetalle
{
    private double Zugfestigkeit;
    public keramischeWerkstoffe(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,double Zugfestigkeit)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        if(Zugfestigkeit>0)
        {
            this.Zugfestigkeit = Zugfestigkeit;
        }
    }
    public void setZugfestigkeit(double Zugfestigkeit)
    {
        if(Zugfestigkeit>0)
        {
            this.Zugfestigkeit= Zugfestigkeit;
        }
    }
    public double getZugfestigkeit()
    {
        return Zugfestigkeit;
    }
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"\n Zugfestigkeit:   "+Zugfestigkeit;
        return s;
    }
}
