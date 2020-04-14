
/**
 * Die Klasse Werkstoffe ist die höchste Superklasse des Vererbungssystems der Werkstoffe. Von ihr sind alle anderen Werkstoffarten
 * abgeleitet. Sie ist abstrakt, da von ihr keine Objekte gebildet werden müssen. Sie initialisiert die Attribute Name, Nummer und
 * Verwendung und enthält deren get- und set-Methoden. Außerdem enthält sie die Methodensignatur der abstrakten Methode gibEigenschaft.
 * 
 * @author Markus Schnee, Jenny Glönkler 
 * @version (07.04.2020/14:55Uhr)
 */
public abstract class Werkstoffe
{
    private String name;
    private int nummer;
    private String verwendung;
    
    public Werkstoffe(String name,int nummer,String verwendung)
    {
       if(nummer>0)
            {
                this.name= name;
                this.nummer= nummer;
                this.verwendung= verwendung;
            }
           
        
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public  String getName()
    {
        return this.name;
    }
    
    public void setNummer(int nummer)
    {
         if(nummer>10000 && nummer <40000)
            {
                this.nummer= nummer;
            }
            else
            {
                System.out.println("Die angegebene Nummer ist ungültig");
            }
    }
    
    public  int getNummer()
    {
        return this.nummer;
    }
    
    public void setVerwendung(String verwendung)
    {
        this.verwendung = verwendung;
    }
    
    public  String getVerwendung()
    {
        return this.verwendung;
    }
   
   
    public abstract String gibEigenschaft();
   
   
    
    
    
}