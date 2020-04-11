
/**
 * Die Klasse Naturstoffe ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Degradation und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Naturstoffe extends Nichtmetalle
{
    private String Degradation;
    
    public Naturstoffe(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,String Degradation)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        this.Degradation = Degradation;
    }
    
    public void setDegradation(String Degradation)
    {
        this.Degradation=Degradation;
    }
    
    public String getDegradation()
    {
        return Degradation;
    }
    
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"\n Degradation:   "+Degradation;
        return s;
    }
}
