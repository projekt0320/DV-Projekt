
/**
 * Die Klasse Naturstoffe ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Degradation und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Naturstoffe extends Nichtmetalle
{
    private String Degradation;

    /**
     * Konstruktor der Klasse Naturstoffe.
     * Die Superklasse Nichtmetalle wird aufgerufen, um Name, Nummer, Verwendung und metallähnliche Eigenschaften zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetDegradation aufgerufen, um den Wert der Degradation zu setzen.
     * 
     * @param Name, Nummer, Verwendung, metallAehnlicheEigenschaften (metallähnliche Eigenschaften), Degradation
     * @throws Exception
     */
    public Naturstoffe(String Name,int Nummer,String Verwendung, String metallAehnlicheEigenschaften,String Degradation)throws Exception
    {
        super(Name,Nummer,Verwendung, metallAehnlicheEigenschaften);
        setDegradation( Degradation);
    }

    /**
     * Setzt die Degradation auf den eingegebenen Wert.
     * 
     * @param Degradation
     */
    public void setDegradation(String Degradation)
    {
        this.Degradation=Degradation;
    }

    /**
     * Gibt die Degradation als String zurück.
     * 
     * @return Degradation
     */
    public String getDegradation()
    {
        return Degradation;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, metallähnliche Eigenschaften, Degradation
     */
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"\n Degradation:   "+Degradation;
        return s;
    }
}