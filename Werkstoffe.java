
/**
 * Beschreiben Sie hier die Klasse Werkstoff.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Werkstoffe
{
    private static String name;
    private static int nummer;
    private static String verwendung;
    
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
    public static String getName()
    {
        return name;
    }
    
    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }
    public static int getNummer()
    {
        return nummer;
    }
    
    public void setVerwendung(String verwendung)
    {
        this.verwendung = verwendung;
    }
    public static String getVerwendung()
    {
        return verwendung;
    }
   
   
    public abstract String gibEigenschaft();
   
    
    
    
}
