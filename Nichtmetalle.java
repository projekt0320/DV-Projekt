
/**
 * Die Klasse Nichtmetalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut metallähnliche Eigenschaften
 * und enthält sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 25. April 2020
 */
public abstract class  Nichtmetalle extends Werkstoffe
{
    private String metallAehnlicheEigenschaften;

    /**
     * Konstruktor der abstrakten Klasse Nichtmetalle.
     * Die Superklasse Werkstoffe wird aufgerufen, um Name, Nummer und Verwendung zu setzen, gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetMetallAehnlicheEigenschaften aufgerufen, um den Wert der metallähnlichen Eigenschaften zu setzen.
     * 
     * @param Name, Nummer, Verwendung, metallAehnlicheEigenschaften (metallähnliche Eigenschaften)
     * @throws Exception
     */
    public Nichtmetalle(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften) throws Exception
    {
        super(name,nummer,verwendung);
        setMetallAehnlicheEigenschaften( metallAehnlicheEigenschaften);
    }

    /**
     *Setzt metallähnliche Eigenschaften auf die eingegebenen metallähnlichen Eigenschaften.
     *
     *@param metallAehnlicheEigenschaften (metallähnliche Eigenschaften)
     */
    public void setMetallAehnlicheEigenschaften(String metallAehnlicheEigenschaften)
    {
        this.metallAehnlicheEigenschaften=metallAehnlicheEigenschaften;
    }

    /**
     * Gibt die metallähnlichen Eigenschaften als String zurück.
     * 
     * @return metallAehnlicheEigenschaften (metallähnliche Eigenschaften)
     */
    public String getmetallAehnlicheEigenschaften()
    {
        return metallAehnlicheEigenschaften;
    }

    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String.
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() unter Verwendung des Schlüsselworts „super“ aus der nächsthöheren
     * Klasse aufgerufen wird.
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, metallähnliche Eigenschaften
     */
    public String gibEigenschaft()
    {
        String s= " name:   "+this.getName()+"\n nummer:   "+this.getNummer()+ "\n verwendung:   "+this.getVerwendung()+ "\n metallAehnlicheEigenschaften:   "+metallAehnlicheEigenschaften;
        return s;
    }
}