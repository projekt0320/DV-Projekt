
/**
 * Die Klasse Eisenmetalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut Eisengehalt und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 25. April 2020
 */
public abstract class Eisenmetalle extends Metalle
{
    private double Eisengehalt;

    /**
     * Konstruktor der abstrakten Klasse Eisenmetalle.
     * Die Superklasse Metalle wird aufgerufen, um Name, Nummer, Verwendung und elektrische Leitfähigkeit zu setzen, gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetEisengehalt aufgerufen, um den Wert des Eisengehalts zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Eisengehalt
     * @throws Exception
     */
    public Eisenmetalle(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit,double Eisengehalt)throws Exception
    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit);
        setEisengehalt(Eisengehalt);
    }

    /**
     * Setzt den Eisengehalt auf den eingegebenen Wert, wenn dieser größer als 50 und kleiner als 100 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * 
     * @param Eisengehalt
     * @throws Exception
     */
    public void setEisengehalt(double Eisengehalt)throws Exception
    {
        if(Eisengehalt>50 && Eisengehalt<100 )
        {
            this.Eisengehalt= Eisengehalt;
        }
        else
        {
            throw new Exception("Der angegebene Eisengehalt ist ungültig");
        }
    }

    /**
     * Gibt den Wert des Eisengehalts in Prozent als double zurück.
     * 
     * @return Eisengehalt
     */
    public double getEisengehalt()
    {
        return Eisengehalt;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Eisengehalt
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n Eisengehalt:   "+ Eisengehalt;
        return s;
    }
}