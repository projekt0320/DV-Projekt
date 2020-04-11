
/**
 * Die Klasse Kunststoffe ist eine Subklasse von "Werkstoffe", initialisiert das Attribut Verformbarkeit und enthält
 * sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft, mit der alle Eigenschaften und deren Werte
 * als Text zurückgegeben werden.
 * 
 * @author Markus Schnee, Jenny Glönkler
 * @version 11. April 2020
 */
public class Kunststoffe extends Nichtmetalle
{
    private String Verformbarkeit;
    
    public Kunststoffe(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften,String Verformbarkeit)
    {
        super(name,nummer,verwendung, metallAehnlicheEigenschaften);
        this.Verformbarkeit = Verformbarkeit;
    }
    
    public void setVerformbarkeit(String Verformbarkeit)
    {
        this.Verformbarkeit=Verformbarkeit;
    }
    
    public String getVerformbarkeit()
    {
        return Verformbarkeit;
    }
    
    public String gibEigenschaft()
    {
        String s=super.gibEigenschaft()+"\n Verformbarkeit:   "+Verformbarkeit;
        return s;
    }
}