
/**
 * Die Klasse Kunststoffe ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Verformbarkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Kunststoffe extends Nichtmetalle
{
    private String Verformbarkeit;
    
     /**
     * Konstruktor der abstrakten Klasse Kunststoffe.
     * Die Superklasse Nichtmetalle wird aufgerufen, um Name, Nummer, Verwendung und metallähnliche Eigenschaften zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetVerformbarkeit aufgerufen, um den Wert der Verformbarkeit zu setzen.
     * 
     * @param Name, Nummer, Verwendung, metallAehnlicheEigenschaften (metallähnliche Eigenschaften), Verformbarkeit
     * @throws Exception
     */
    public Kunststoffe(String Name,int Nummer,String Verwendung, String metallAehnlicheEigenschaften,String Verformbarkeit)throws Exception
    {
        super(Name,Nummer,Verwendung, metallAehnlicheEigenschaften);
        setVerformbarkeit( Verformbarkeit);
    }
    
    /**
     * Setzt die Verformbarkeit auf den eingegebenen Wert.
     * @param Verformbarkeit
     */
    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }
    
    /**
     * Gibt die Verformbarkeit als String zurück.
     * @return Verformbarkeit
     */
    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }
    
     /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der Klasse Nichtmetalle aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, matallähnliche Eigenschaften, Verformbarkeit
     */
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"\n Verformbarkeit:   "+Verformbarkeit;
        return s;
    }
}