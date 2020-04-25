
/**
 * Die Klasse Schwermetalle ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Verformbarkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Schwermetalle extends Nichteisenmetalle
{
    private String Verformbarkeit;

    /**
     * Konstruktor der Klasse Schwermetalle.
     * Die Superklasse Nichteisenmetalle wird aufgerufen, um Name, Nummer, Verwendung, elektrische Leitfähigkeit und Hauptelement zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetVerformbarkeit aufgerufen, um den Wert der Verformbarkeit zu setzen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Hauptelement, Verformbarkeit
     * @throws Exception
     */
    public Schwermetalle(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit,String Hauptelement, String Verformbarkeit)throws Exception
    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit,Hauptelement);
        setVerformbarkeit(Verformbarkeit);
    }

    /**
     * Standardkonstruktor der Klasse Schwermetalle. Er ruft den Konstruktor der Superklasse Nichteisenmetalle auf und weist vorgegebene Werte zu.
     * Außerdem wird dem Attribut Verformbarkeit ein Wert zugewiesen.
     */
    public Schwermetalle() throws Exception
    {
        super("CuZn5", 20220, "Elektronik", 33, "Kupfer");
        setVerformbarkeit("sehr hohe Kaltumformbarkeit");
    }
    
    /**
     * Gibt die Verformbarkeit als String zurück.
     * 
     * @return Verformbarkeit
     */
    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }

    /**
     * Setzt die Verformbarkeit auf die eingegebene Verformbarkeit.
     * 
     * @param Verformbarkeit
     */
    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Hauptelement, Verformbarkeit
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Verformbarkeit:   "+ Verformbarkeit;
        return s;
    }
}