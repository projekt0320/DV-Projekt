
/**
 * Die Klasse Metalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut elektrische Leitfähigkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11.04.2020
 */
public abstract class Metalle extends Werkstoffe
{
    private double ElektrischeLeitfaehigkeit;
    
    /**
     * Konstruktor der abstrakten Klasse Metalle.
     * Die Superklasse Werkstoffe wird aufgerufen, um Name, Nummer und Verwendung zu setzen, gegebenenfalls löst diese eine Exception aus.
     * Zudem wird die Methode SetElektrischeLeitfaehigkeit aufgerufen, um den Wert der elektrischen Leitfähigkeit zu setzen, 
     * gegebenenfalls kann auch diese eine Exception auslösen.
     * 
     * @param Name, Nummer, Verwendung, ElektrischeLeitfaehigkeit
     * @throws Exception
     */
    public Metalle(String Name,int Nummer,String Verwendung,double ElektrischeLeitfaehigkeit)throws Exception
    {   
        
        super(Name,Nummer,Verwendung);
        setElektrischeLeitfaehigkeit( ElektrischeLeitfaehigkeit);
   
        
    }
    /**
     * Setzt die elektrische Leitfähigkeit auf den eingegebenen Wert, wenn dieser größer als 0,68 und kleiner/gleich 62 ist. Ist das nicht der Fall, 
     * wird eine Exception geworfen.
     * @param ElektrischeLeitfaehigkeit
     * @throws Exception
     */
    public void setElektrischeLeitfaehigkeit(double ElektrischeLeitfaehigkeit)throws Exception
    {
        if(ElektrischeLeitfaehigkeit>0.68 && ElektrischeLeitfaehigkeit <= 62)
        {
            this.ElektrischeLeitfaehigkeit= ElektrischeLeitfaehigkeit;
    
        }
        else
        {
           throw new Exception("Die angegebene elektrische Leitfähigkeit ist ungültig");
        }
    }
    /**
     * Gibt den Wert der elektrischen Leitfähigkeit als double zurück.
     * @return ElektrischeLeitfaehigkeit
     */
    public double getElektrischeLeitfaehigkeit()
    {
        return ElektrischeLeitfaehigkeit;

    }
    
    /**
     * Sammelt die Eigenschaften eines Werkstoffes und speichert sie als String
     * Das Sammeln geschieht, indem die Methode gibEigenschaft() aus der Klasse Werkstoffe aufgerufen wird unter Verwendung des Schlüsselworts „super“
     * 
     * @return String mit den Eigenschaften des Werkstoffs: Name, Nummer, Verwendung, elektrische Leitfähigkeit
     */
    public  String gibEigenschaft()
    {   

        String s= " name:   "+this.getName()+"\n nummer:   "+this.getNummer()+ "\n verwendung:   "+this.getVerwendung()+"\n   elektrischeLeitfaehigkeit: "+ ElektrischeLeitfaehigkeit;
        return s;


    }
}