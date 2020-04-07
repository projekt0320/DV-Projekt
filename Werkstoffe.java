
/**
 * Beschreiben Sie hier die Klasse Werkstoff.
 * 
 * @author () 
 * @version (07.04.2020/14:55Uhr)
 */
public abstract class Werkstoffe
{
    private String name;
    private int nummer;
    private String verwendung;
    
    public Werkstoffe(String name,int nummer,String verwendung)
    {
        this.name= name;
        this.nummer= nummer;
        this.verwendung= verwendung;
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
        this.nummer = nummer;
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
