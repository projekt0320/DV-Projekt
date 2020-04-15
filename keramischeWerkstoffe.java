
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
    
     /**
     * Konstruktor der abstrakten Klasse keramischeWerkstoffe.
     * Die Superklasse Nichtmetalle wird aufgerufen, um Name, Nummer, Verwendung und metallähnliche Eigenschaften zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetZugfestigkeit aufgerufen, um den Wert der Zugfestigkeit zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, metallAehnlicheEigenschaften (metallähnliche Eigenschaften), Zugfestigkeit
     * @throws Exception
     */
    public keramischeWerkstoffe(String Name,int Nummer,String Verwendung, String metallAehnlicheEigenschaften,double Zugfestigkeit)throws Exception
    {
        super(Name,Nummer,Verwendung, metallAehnlicheEigenschaften);
        setZugfestigkeit( Zugfestigkeit);
    }
    
    /**
     * Setzt die Zugfestigkeit auf den eingegebenen Wert, wenn dieser größer als 0 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * @param Zugfestigkeit
     * @throws Exception
     */
    public void setZugfestigkeit(double Zugfestigkeit)throws Exception
    {
        if(Zugfestigkeit>0)
        {
            this.Zugfestigkeit= Zugfestigkeit;
        }
        else
        {
            throw new Exception("Die angegebene Zugfestigkeit ist ungültig");
        }
    }
    
     /**
     * Gibt den Wert der Zugfestigkeit als double zurück.
     * @return Zugfestigkeit
     */
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