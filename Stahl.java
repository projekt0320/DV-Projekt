
/**
 * Die Klasse Stahl ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Kohlenstoffgehalt und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Stahl extends Eisenmetalle
{
    private double Kohlenstoffgehalt;

    /**
     * Konstruktor der Klasse Stahl.
     * Die Superklasse Eisenmetalle wird aufgerufen, um Name, Nummer, Verwendung, elektrische Leitfähigkeit und Eisengehalt zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetKohlenstoffgehalt aufgerufen, um den Wert des Kohlenstoffgehalts zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Eisengehalt, Kohlenstoffgehalt
     * @throws Exception
     */
    public Stahl(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit,double Eisengehalt,double Kohlenstoffgehalt) throws Exception
    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit,Eisengehalt) ;
        setKohlenstoffgehalt(Kohlenstoffgehalt);
    }

    /**
     * Standardkonstruktor der Klasse Stahl. Er ruft den Konstruktor der Superklasse Eisenmetalle auf und weist vorgegebene Werte zu.
     * Außerdem wird dem Attribut Kohlenstoffgehalt ein Wert zugewiesen.
     */
    public Stahl() throws Exception
    {
        super("C45", 10503, "Maschinenbau", 8.3, 97);
        setKohlenstoffgehalt(0.45);
        
    }

    /**
     * Setzt den Kohlenstoffgehalt auf den eingegebenen Wert, wenn dieser größer als 0 und kleiner als 2.06 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * 
     * @param Kohlenstoffgehalt
     * @throws Exception
     */
    public void setKohlenstoffgehalt(double Kohlenstoffgehalt)throws Exception
    {
        if(Kohlenstoffgehalt>0 && Kohlenstoffgehalt<= 2.06)
        {
            this.Kohlenstoffgehalt = Kohlenstoffgehalt;
        }
        else
        {
            throw new Exception ("Der angegebene Kohlenstoffgehalt ist ungültig.");
        }
    }

    /**
     * Gibt den Wert des Kohlenstoffgehalts in Prozent als double zurück.
     * 
     * @return Kohlenstoffgehalt
     */
    public double getKohlenstoffgehalt()
    {
        return Kohlenstoffgehalt;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Eisengehalt, Kohlenstoffgehalt
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"\n Kohlenstoffgehalt:   "+Kohlenstoffgehalt;
        return s;
    }
}
