/**
 * Die Klasse Leichtmetalle ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Hauptelement und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Leichtmetalle extends Nichteisenmetalle
{
    private double Dichte;

    /**
     * Konstruktor der Klasse Leichtmetalle.
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
     * Standardkonstruktor der Klasse Leichtmetalle. Er ruft den Konstruktor der Superklasse Nichteisenmetalle auf und weist vorgegebene Werte zu.
     * Außerdem wird dem Attribut Dichte ein Wert zugewiesen.
     */
    public Leichtmetalle() throws Exception
    {
        super("AlCu4Mg1", 31355, "Luftfahrttechnik", 8.3, "Aluminium");
        setDichte(2.77);
    }
    
    /**
     * Setzt die Dichte auf den eingegebenen Wert, wenn dieser größer als 0 und kleiner als 5 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * 
     * @param Dichte
     * @throws Exception
     */
    public void setDichte(double Dichte)throws Exception
    {
        if(Dichte>0 && Dichte< 5)
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
     * 
     * @return Dichte
     */
    public double getDichte()
    {
        return Dichte;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Hauptelement, Dichte
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Dichte:   "+ Dichte;
        return s;
    }
}