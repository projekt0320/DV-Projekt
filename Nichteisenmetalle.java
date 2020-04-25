
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
    
    /**
     * Konstruktor der abstrakten Klasse Nichteisenmetalle.
     * Die Superklasse Metalle wird aufgerufen, um Name, Nummer, Verwendung und elektrische Leitfähigkeit zu setzen, gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetHauptelement aufgerufen, um den Wert des Hauptelements zu setzen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Hauptelement
     * @throws Exception
     */
    public Nichteisenmetalle(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit, String Hauptelement)throws Exception
    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit);
        setHauptelement( Hauptelement);
    }
    
     /**
     * Setzt das Hauptelement auf das eingegebene Hauptelement.
     * @param Hauptelement
     */
    public void setHauptelement(String Hauptelement)
    {
        this.Hauptelement= Hauptelement;
    }
    
    /**
     * Gibt das Hauptelement als String zurück.
     * @return Hauptelement
     */
    public String getHauptelement()
    {
        return Hauptelement;
    }
    
    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der Klasse Metalle aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Hauptelement
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Hauptelement:   "+ Hauptelement;
        return s;

    }
}