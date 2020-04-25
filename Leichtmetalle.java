/**
 * Die Klasse Leichtmetalle ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Hauptelement und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Leichtmetalle extends Nichteisenmetalle
{
    private double Dichte;
    
    /**
     * Konstruktor der abstrakten Klasse Leichtmetalle.
     * Die Superklasse Nichteisenmetalle wird aufgerufen, um Name, Nummer, Verwendung, elektrische Leitfähigkeit und Hauptelement zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetDichte aufgerufen, um den Wert der Dichte zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Hauptelement, Dichte
     * @throws Exception
     */
    public Leichtmetalle(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit,String Hauptelement,double Dichte)throws Exception

    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit,Hauptelement);
        setDichte(Dichte);
    }
    
    /**
     * Setzt die Dichte auf den eingegebenen Wert, wenn dieser größer als 0,5 und kleiner als 5 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * @param Dichte
     * @throws Exception
     */
    public void setDichte(double Dichte)throws Exception
    {
        if(Dichte>0.5 && Dichte< 5)
        {
        this.Dichte= Dichte;
        }
        else
        {
            throw new Exception("Die angegebene Dichte ist ungültig");
        }
    }
    
    /**
     * Gibt den Wert der Dichte als double zurück.
     * @return Dichte
     */
    public double getDichte()
    {
        return Dichte;
    }
    
    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der Klasse Nichteisenmetalle aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Hauptelement, Dichte
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Dichte:   "+ Dichte;
        return s;
    }
}