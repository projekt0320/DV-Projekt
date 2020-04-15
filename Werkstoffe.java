
/**
 * Die Klasse Werkstoffe ist die höchste Superklasse des Vererbungssystems der Werkstoffe. Von ihr sind alle anderen Werkstoffarten
 * abgeleitet. Sie ist abstrakt, da von ihr keine Objekte gebildet werden müssen. Sie initialisiert die Attribute Name, Nummer und
 * Verwendung und enthält deren get- und set-Methoden. Außerdem enthält sie die Methodensignatur der abstrakten Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11. April 2020
 */
public abstract class Werkstoffe
{
    private String Name;
    private int Nummer;
    private String Verwendung;

    /**
     * Konstruktor der abstrakten Klasse Werkstoffe, der Name, Nummer und Verwendung auf die eingegebenen Werte setzt. 
     * Dabei wird die Methode SetNummer aufgerufen, die eine Exception wirft, wenn die Nummer nicht größer als 10000 und nicht kleiner als 40000 ist.
     * @param Name, Nummer, Verwendung
     * @throws Exception
     */

    public Werkstoffe(String Name,int Nummer,String Verwendung)throws Exception
    {

        this.Name= Name;
        setNummer(Nummer);
        this.Verwendung= Verwendung;

        
    }

    /**
     * Setzt den Name des Werkstoffes auf den eingegebenen Namen.
     * @param Name
     */
    public void setName(String Name)
    {
        this.Name = Name;
    }

    /**
     * Gibt den Name des Wekstoffes als String zurück.
     * @return Name
     */
    public  String getName()
    {
        return this.Name;
    }

    /**
     * Setzt die Nummer des Werkstoffes auf die eingegebene Nummer, wenn diese größer als 10000 und kleiner als 40000 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * @param Nummer
     * @throws Exception
     */
    public void setNummer(int Nummer)throws Exception
    {
        if(Nummer>10000 && Nummer <40000)
        {
            this.Nummer= Nummer;
        }
        else
        {
            throw new Exception("Die angegebene Nummer ist ungültig");
        }
    }

    /**
     * Gibt die Nummer des Werkstoffes als int zurück.
     * @return Nummer
     */
    public  int getNummer()
    {
        return this.Nummer;
    }

    /**
     * Setzt die Verwendung des Werkstoffes auf die eingegebene Verwendung.
     * @param Verwendung
     */
    public void setVerwendung(String Verwendung)
    {
        this.Verwendung = Verwendung;
    }

    /**
     * Gibt die Verwendung des Werkstoffes als String zurück.
     * @return Verwendung
     */
    public  String getVerwendung()
    {
        return this.Verwendung;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der nächshöheren Klasse aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * @return String mit den Eigenschaften des Werkstoffs
     */
    public abstract String gibEigenschaft();

    
    
}