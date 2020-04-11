
/**
 * Die Klasse keramischeWerkstoffe ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Zugfestigkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
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