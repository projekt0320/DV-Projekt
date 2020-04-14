import java.util.ArrayList;

/**
 * Die Klasse Datenbank erstellt eine ArrayList, in der Objekte der Klasse Werkstoffe mit dynamischer Unterklasse gespeichert werden
 * können. Zusätzlich wird in einem Attribut die Anzahl der Werkstoffe in der ArrayList mitgezählt.
 * Die Datenbank ermöglicht es, Werkstoffe in acht verschiedenen Kategorien zu erstellen (Stahl, Guss, Schwermetalle,
 * Leichtmetalle, Halbleiter, Keramik, Kunststoffe und Naturstoffe), außerdem können die 15 verschiedenen Eigenschaften auch einzeln
 * bearbeitet werden. Werkstoffe können auch gelöscht und nach Name, Nummer oder Verwendung gesucht werden.
 * 
 * @author Jenny Glönkler, Markus Schnee, Felicia Wieland 
 * @version 11. April 2020
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

    public void ErstellenStahl (String Name, int Nummer, String Verwendung, double eLeitf, double Eisengehalt, double Kohlenstoffgehalt) throws Exception
    {

        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe stahl = new Stahl (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Kohlenstoffgehalt);
            liste.add(stahl);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)==null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenGuss (String Name, int Nummer, String Verwendung, double eLeitf, double Eisengehalt, double Siedetemp)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe guss = new Gusswerkstoff (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Siedetemp);
            liste.add(guss);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenSchwermetalle (String Name, int Nummer, String Verwendung, double eLeitf, String Hauptelement, String Verform)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe schwer = new Schwermetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Verform);
            liste.add(schwer);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenLeichtmetalle (String Name, int Nummer, String Verwendung, double eLeitf, double Hauptelement, String Dichte)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe leicht = new Leichtmetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Dichte);
            liste.add(leicht);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenHalbleiter (String Name, int Nummer, String Verwendung, String metallEigenschaft, double eLeitf)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe halbleiter = new Halbleiter (Name, Nummer, Verwendung, metallEigenschaft, eLeitf);
            liste.add(halbleiter);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenKeramik (String Name, int Nummer, String Verwendung, String metallEigenschaft, double Zugfestigkeit)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe keramik = new keramischeWerkstoffe (Name, Nummer, Verwendung, metallEigenschaft, Zugfestigkeit);
            liste.add(keramik);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenKunststoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Verformbarkeit)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe kunststoff = new Kunststoffe (Name, Nummer, Verwendung, metallEigenschaft, Verformbarkeit);
            liste.add(kunststoff);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void ErstellenNaturstoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Degradation)
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe naturstoff = new Naturstoffe (Name, Nummer, Verwendung, metallEigenschaft, Degradation);
            liste.add(naturstoff);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {
            System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void BearbeitenName (int Nummer, String Name)
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setName(Name);
    }

    public void BearbeitenNummer (int Nummer, int nr)
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setNummer(nr);
    }

    public void BearbeitenVerwendung (int Nummer, String Verwendung)
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setVerwendung(Verwendung);
    }

    public void BearbeitenElektrischeLeitfaehigkeitMetalle (int Nummer, double elektrLeitf)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Metalle) w).setElektrischeLeitfaehigkeit(elektrLeitf);
    }

    public void BearbeitenElektrischeLeitfaehigkeitHalbleiter (int Nummer, double elektrLeitf)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Halbleiter) w).setElektrischeLeitfaehigkeit(elektrLeitf);

    }

    public void BearbeitenEisengehalt (int Nummer, double eisengehalt)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Eisenmetalle) w).setEisengehalt(eisengehalt);
    }

    public void BearbeitenKohlenstoffgehalt (int Nummer, double Kohlenstoffgehalt)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Stahl)w).setKohlenstoffgehalt(Kohlenstoffgehalt);
    }

    public void BearbeitenHauptelement (int Nummer, String Hauptelement)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Nichteisenmetalle)w).setHauptelement(Hauptelement);
    }

    public void BearbeitenSiedetemperatur (int Nummer, double Siedetemp)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Gusswerkstoff)w).setSiedetemperatur(Siedetemp);
    }

    public void BearbeitenVerformbarkeitSchwermetalle (int Nummer, String Verformbarkeit)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Schwermetalle)w).setVerformbarkeit(Verformbarkeit);
    }

    public void BearbeitenVerformbarkeitKunststoffe (int Nummer, String Verformbarkeit)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Kunststoffe)w).setVerformbarkeit(Verformbarkeit);
    }

    public void BearbeitenDichte (int Nummer, double Dichte)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Leichtmetalle)w).setDichte(Dichte);
    }

    public void BearbeitenmetallischeEigenschaft (int Nummer, String metallEigenschaft)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Nichtmetalle)w).setMetallAehnlicheEigenschaften(metallEigenschaft);
    }

    public void BearbeitenZugfestigkeit (int Nummer, double Zugfestigkeit)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((keramischeWerkstoffe)w).setZugfestigkeit(Zugfestigkeit);
    }

    public void BearbeitenDegradation (int Nummer, String Degradation)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Naturstoffe)w).setDegradation(Degradation);
    }
    /**
     * In der  Arraylist "Liste" wird nach dem Werkstoff mit dem angegebenen Namen gesucht. 
     * Wenn der Werkstoff gefunden werden kann, wird mit ihm die Methode gibEigenschaft() aufgerufen, die alle seine Eigenschaften in einem String speichert. 
     * Dieser String wird dann zurückgegeben.
     * Wenn kein Werkstoff gefunden werden kann wird eine Fehlermeldung zurückgegeben.
     */
    public String sucheName(String name)
    {
        for (Werkstoffe w : liste)
        {
            if(w.getName()== name)
            {

                return w.gibEigenschaft();

            }

        }
        
        return "Werksoff mit angegebenem Name konnte nicht gefunden werden";
    }
    /**
       * In der  Arraylist "Liste" wird nach dem Werkstoff mit dem angegebenen Nummer gesucht.
       * Wenn der Werkstoff gefunden werden kann, wird er zurückgegeben und es kann mit ihm weitergearbeitet werden(Wird gelöscht oder bearbeitet).
       * Kann er nicht gefunden werden, wird null zurückgegeben.
    */
    public Werkstoffe sucheNummer(int nummer)
    {
        for (Werkstoffe w : liste)
        {
            if(w.getNummer()== nummer)
            {
                
                return w;
            }

        }
        return null;
    }
    /**
     * In der  Arraylist "Liste" wird nach dem/den Werkstoff/en mit der angegebenen Verwendung gesucht.
     *  Wenn ein Werkstoff gefunden werden kann, wird mit ihm die Methode gibEigenschaft() aufgerufen, die alle seine Eigenschaften in einem String speichert.
     *  Wenn es mehrere Werkstoffe mit der gleichen Verwendung gibt, so werden auch die Eigenschafften mehrerer Werkstoofe in dem String gespeichert getrennt voneinander mit 
     *  zwei Leerzeilen.
     *  Dieser String wird dann zurückgegeben.
     *  Wenn kein Werkstoff gefunden werden kann wird eine Fehlermeldung zurückgegeben.
     */
    public String sucheVerwendung(String verwendung)
    {
        String s= "";
        for (Werkstoffe w : liste)
        
        {
            if(w.getVerwendung()== verwendung)
            {
                
                s= s+w.gibEigenschaft();
                
            }   
        }
        if(s== "")
        {
            return "Es konnte kein Werkstoff mit der angegebenen Verwendung gefunden werden";
        }
        else
        {
            return s;
        }
        
    }



    public void loeschen(int Nummer) throws Exception
    {
        Werkstoffe werk2delete= sucheNummer(Nummer);
        if(werk2delete == null)
        {
            throw new Exception("Der Werkstoff konnte nicht gefunden und deshalb nicht gelöscht werden");
        }
        else
        {
            liste.remove(werk2delete);
            anzahl-=1;
        }
    }

    public void AnzahlWerkstoffe()
    {
        if (liste.size() == 1)
        {
            System.out.println("Die Datenbank enthält " + liste.size() + " Werkstoff."); 
        }
        else 
            System.out.println("Die Datenbank enthält " + liste.size() + " Werkstoffe.");
    }
}