import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Datenbank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Datenbank
{
    private int anzahl;
    ArrayList <Werkstoffe> liste;

    public Datenbank ()
    {
        anzahl=0;
        liste = new ArrayList<Werkstoffe>();
    }
    
    public void ErstellenStahl (String Name, int Nummer, String Verwendung, double eLeitf, double Eisengehalt, double Kohlenstoffgehalt)
    {
        anzahl+=1;
        Werkstoffe stahl = new Stahl (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Kohlenstoffgehalt);
        liste.add(stahl);
    }
    
    public void ErstellenGuss (String Name, int Nummer, String Verwendung, double eLeitf, double Eisengehalt, double Siedetemp)
    {
        anzahl+=1;
        Werkstoffe guss = new Gusswerkstoff (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Siedetemp);
        liste.add(guss);
    }
    
    public void ErstellenSchwermetalle (String Name, int Nummer, String Verwendung, double eLeitf, String Hauptelement, String Verform)
    {
        anzahl+=1;
        Werkstoffe schwer = new Schwermetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Verform);
        liste.add(schwer);
    }
    
    public void ErstellenLeichtmetalle (String Name, int Nummer, String Verwendung, double eLeitf, double Hauptelement, String Dichte)
    {
        anzahl+=1;
        Werkstoffe leicht = new Leichtmetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Dichte);
        liste.add(leicht);
    }
    
    public void ErstellenHalbleiter (String Name, int Nummer, String Verwendung, String metallEigenschaft, double eLeitf)
    {
        anzahl+=1;
        Werkstoffe halbleiter = new Halbleiter (Name, Nummer, Verwendung, metallEigenschaft, eLeitf);
        liste.add(halbleiter);
    }
    
    public void ErstellenKeramik (String Name, int Nummer, String Verwendung, String metallEigenschaft, double Zugfestigkeit)
    {
        anzahl+=1;
        Werkstoffe keramik = new keramischeWerkstoffe (Name, Nummer, Verwendung, metallEigenschaft, Zugfestigkeit);
        liste.add(keramik);
    }
    
    public void ErstellenKunststoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Verformbarkeit)
    {
        anzahl+=1;
        Werkstoffe kunststoff = new Kunststoffe (Name, Nummer, Verwendung, metallEigenschaft, Verformbarkeit);
        liste.add(kunststoff);
    }
    
    public void ErstellenNaturstoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Degradation)
    {
        anzahl+=1;
        Werkstoffe naturstoff = new Naturstoffe (Name, Nummer, Verwendung, metallEigenschaft, Degradation);
        liste.add(naturstoff);
    }
    
    //Test
    
    public void BearbeitenName (int Nummer, String Name)
    {
        
    }
}
