

/**
 * Beschreiben Sie hier die Klasse TesteAnwendung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TesteAnwendung
{
   public static void main(String[] args)
   {
       Datenbank d1= new Datenbank();
       try
    {
       d1.ErstellenStahl("Name",3456,"Verwendung",333,444,55);
       d1.ErstellenStahl("Name2",34567,"Verwendung",3333,4444,-2);
       System.out.println("Ohne Fehler durchgelaufen");
    }
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    
    }
    
    try
    {
        d1.ErstellenGuss("name",111,"Verwendung",99,99,99);
        System.out.println("Ohne Fehler durchgelaufen");
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
   }
   //Anwendung
}