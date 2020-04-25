
/**
 * Die Klasse Schwermetalle ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Verformbarkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Schwermetalle extends Nichteisenmetalle
{
    private String Verformbarkeit;
    
    /**
     * Konstruktor der abstrakten Klasse Schwermetalle.
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
     * Gibt die Verformbarkeit als String zurück.
     * @return Verformbarkeit
     */
    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }
    
    /**
     * Setzt die Verformbarkeit auf die eingegebene Verformbarkeit.
     * @param Verformbarkeit
     */
    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }
    
    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der Klasse Nichteisenmetalle aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Hauptelement, Verformbarkeit
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Verformbarkeit:   "+ Verformbarkeit;
        return s;
    }
}