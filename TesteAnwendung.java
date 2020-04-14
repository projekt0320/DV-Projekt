

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
       try{
       d1.ErstellenStahl("Name",3456,"Verwendung",333,444,55);
       d1.ErstellenStahl("Name",3456,"Verwendung",333,444,-1);
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    
    }
    System.out.println("Ohne Fehler durchgelaufen");
   }
   //Anwendung
}