
/**
 * Die Klasse Halbleiter ist eine Subklasse von "Werkstoffe", initialisiert das Attribut elektrische Leitfähigkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler, Felicia Wieland
 * @version 25. April 2020
 */
public class Halbleiter extends Nichtmetalle
{
    private double ElektrischeLeitfaehigkeit;

    /**
     * Konstruktor der Klasse Halbleiter.
     * Die Superklasse Nichtmetalle wird aufgerufen, um Name, Nummer, Verwendung und metallähnliche Eigenschaften zu setzen, 
     * gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetElektrischeLeitfaehigkeit aufgerufen, um den Wert der elektrischen Leitfähigkeit zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, metallAehnlicheEigenschaften (metallähnliche Eigenschaften), ElektrischeLeitfaehigkeit (elektrische Leitfähigkeit)
     * @throws Exception
     */
    public Halbleiter(String Name,int Nummer,String Verwendung, String metallAehnlicheEigenschaften,double ElektrischeLeitfaehigkeit) throws Exception
    {
        super(Name,Nummer,Verwendung, metallAehnlicheEigenschaften);
        setElektrischeLeitfaehigkeit(ElektrischeLeitfaehigkeit);
    }

    /**
     * Standardkonstruktor der Klasse Halbleiter. Er ruft den Konstruktor der Superklasse Nichtmetalle auf und weist vorgegebene Werte zu.
     * Außerdem wird dem Attribut elektrische Leitfähigkeit ein Wert zugewiesen.
     */
    public Halbleiter() throws Exception
    {
        super("SiC", 409212, "Lichttechnik", "hohe Wärmeleitfähigkeit");
        setElektrischeLeitfaehigkeit(0.0098);
    }
    
    /**
     * Setzt die elektrische Leitfähigkeit auf den eingegebenen Wert, wenn dieser größer als 0 und kleiner/gleich 10 hoch 6 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * 
     * @param ElektrischeLeitfaehigkeit (elektrische Leitfähigkeit)
     * @throws Exception
     */
    public void setElektrischeLeitfaehigkeit(double ElektrischeLeitfaehigkeit)throws Exception
    {
        if(ElektrischeLeitfaehigkeit>0 && ElektrischeLeitfaehigkeit <= Math.pow(10,6)) 
        {
            this.ElektrischeLeitfaehigkeit= ElektrischeLeitfaehigkeit;
        }
        else
        {
            throw new Exception("Die angegebene elektrische Leitfähigkeit ist ungültig");
        }
    }

    /**
     * Gibt den Wert der elektrischen Leitfähigkeit in S/m (Siemens pro Meter) als double zurück.
     * 
     * @return ElektrischeLeitfaehigkeit (elektrische Leitfähigkeit)
     */
    public double getElektrischeLeitfaehigkeit()
    {
        return ElektrischeLeitfaehigkeit;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, metallähnliche Eigenschaften, elektrische Leitfähigkeit
     */
    public String gibEigenschaft()
    {
        String s= super.gibEigenschaft()+ "\n elektrische Leitfaehigkeit:   "+ ElektrischeLeitfaehigkeit;
        return s;
    }
}