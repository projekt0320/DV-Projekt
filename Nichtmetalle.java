
/**
 * Die Klasse Nichtmetalle ist eine abstrakte Subklasse von "Werkstoffe", initialisiert das Attribut metallähnliche Eigenschaften
 * und enthält sowohl eine get- und set-Methode für dieses Attribut als auch die Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version 11. April 2020
 */
public abstract class  Nichtmetalle extends Werkstoffe
{
    private String metallAehnlicheEigenschaften;
    
    public Nichtmetalle(String name,int nummer,String verwendung, String metallAehnlicheEigenschaften)
    {
        super(name,nummer,verwendung);
        this.metallAehnlicheEigenschaften = metallAehnlicheEigenschaften;
    }
    
    public void setMetallAehnlicheEigenschaften(String metallAehnlicheEigenschaften)
    {
        this.metallAehnlicheEigenschaften=metallAehnlicheEigenschaften;
    }
    
    public String getmetallAehnlicheEigenschaften()
    {
        return metallAehnlicheEigenschaften;
    }
    
    public String gibEigenschaft()
    {

        String s= "name:   "+this.getName()+"\n nummer:   "+this.getNummer()+ "\n verwendung:   "+this.getVerwendung()+ "\n metallAehnlicheEigenschaften:   "+metallAehnlicheEigenschaften;

        return s;
    }
    
}