
/**
 * Die Klasse Gusswerkstoff ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Siedetemperatur und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Gusswerkstoff extends Eisenmetalle
{
    private double Siedetemperatur;

    /**
     * Konstruktor der Klasse Gusswerkstoff.
     * Die Superklasse Eisenmetalle wird aufgerufen, um Name, Nummer, Verwendung, elektrische Leitfähigkeit und Eisengehalt zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetSiedetemperatur aufgerufen, um den Wert der Siedetemperatur zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit, Eisengehalt, Siedetemperatur
     * @throws Exception
     */
    public Gusswerkstoff(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit,double Eisengehalt,double Siedetemperatur) throws Exception
    {
        super(Name,Nummer,Verwendung,ElektrischeLeitfaehigkeit,Eisengehalt);
        setSiedetemperatur(Siedetemperatur);
    }

    /**
     * Standardkonstruktor der Klasse Gusswerkstoff. Er ruft den Konstruktor der Superklasse Eisenmetalle auf und weist vorgegebene Werte zu.
     * Außerdem wird dem Attribut Siedetemperatur ein Wert zugewiesen.
     */
    public Gusswerkstoff() throws Exception
    {
        super("EN-GJL-200", 06020, "Armaturen", 13, 94);
        setSiedetemperatur(1150);
    }

    /**
     * Setzt die Siedetemperatur auf den eingegebenen Wert, wenn dieser größer als 1000 und kleiner als 1300 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * 
     * @param Siedetemperatur
     * @throws Exception
     */
    public void setSiedetemperatur(double Siedetemperatur)throws Exception
    {
        if(Siedetemperatur>1000 &&Siedetemperatur<1300)
        {
            this.Siedetemperatur = Siedetemperatur;
        }
        else
        {
            throw new Exception("Die angegebene Siedetemperatur ist ungültig");
        }
    }

    /**
     * Gibt den Wert der Siedetemperatur in Grad Celsius als double zurück.
     * 
     * @return Siedetemperatur
     */
    public double getSiedetemperatur()
    {
        return Siedetemperatur;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit, Eisengehalt, Siedetemperatur
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+"\n Siedetemperatur:   "+Siedetemperatur;
        return s; 
    }
}