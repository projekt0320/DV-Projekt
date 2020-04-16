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
    boolean test = true;
    
    /**
     * Der Konstruktor der Klasse Datenbank, erzeugt eine ArrayList, in der Werkstoffe gespeichert werden können.
     * Zudem wird die Anzahl (der Werkstoffe in der Liste) auf 0 gestezt.
     */
    public Datenbank ()
    {
        anzahl=0;
        liste = new ArrayList<Werkstoffe>();
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Stahl. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, eLeitf (elektrische Leitfähigkeit), Eisengehalt, Kohlenstoffgehalt
     *@throws Exception
     */

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

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Gusswerkstoff. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, eLeitf (elektrische Leitfähigkeit), Eisengehalt, Siedetemp (Siedetemperatur)
     *@throws Exception
     */
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

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Schwermetalle. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, eLeitf (elektrische Leitfähigkeit), Hauptelement, Verform (Verformbarkeit)
     *@throws Exception
     */
    public void ErstellenSchwermetalle (String Name, int Nummer, String Verwendung, double eLeitf, String Hauptelement, String Verform)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe schwer = new Schwermetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Verform);
            liste.add(schwer);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Leichtmetalle. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, eLeitf (elektrische Leitfähigkeit), Hauptelement, Dichte
     *@throws Exception
     */
    public void ErstellenLeichtmetalle (String Name, int Nummer, String Verwendung, double eLeitf, String Hauptelement, double Dichte)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe leicht = new Leichtmetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Dichte);
            liste.add(leicht);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Halbleiter. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, metallEigenschaft (metallähnliche Eigenschaft), eLeitf (elektrische Leitfähigkeit)
     *@throws Exception
     */
    public void ErstellenHalbleiter (String Name, int Nummer, String Verwendung, String metallEigenschaft, double eLeitf)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe halbleiter = new Halbleiter (Name, Nummer, Verwendung, metallEigenschaft, eLeitf);
            liste.add(halbleiter);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse keramischeWerkstoffe. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, metallEigenschaft (metallähnliche Eigenschaft), Zugfestigkeit
     *@throws Exception
     */
    public void ErstellenKeramik (String Name, int Nummer, String Verwendung, String metallEigenschaft, double Zugfestigkeit)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe keramik = new keramischeWerkstoffe (Name, Nummer, Verwendung, metallEigenschaft, Zugfestigkeit);
            liste.add(keramik);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

   
    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Kunststoffe. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung, metallEigenschaft (metallähnliche Eigenschaft), Verformbarkeit
     *@throws Exception
     */
    public void ErstellenKunststoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Verformbarkeit)throws Exception
    {

        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe kunststoff = new Kunststoffe (Name, Nummer, Verwendung, metallEigenschaft, Verformbarkeit);
            liste.add(kunststoff);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    /**
     *Die Methode erstellt ein Objekt mit der dynamischer Unterklasse Naturstoffe. Die Anzahl, der Werkstoffe in der Liste, wird um eins erhöht und der neu erstellte 
     *Werkstoff wird in die ArrayList eingefügt.
     *Es kann jedoch kein neues Objekt/ kein neuer Werkstoff erstellt werden, wenn mit dem eingegebenem Name und der eingegebenen Nummer, dem eingegebenem Name oder 
     *der eingegebenen Nummer bereits ein Objekt/ Werkstoff in der Liste erstellt worden ist. Ist das der Fall, wird eine Exception geworfen.
     *
     *@param Name, Nummer, Verwendung,metallEigenschat (metallähnliche Eigenschaft), Degradation
     *@throws Exception
     */
    public void ErstellenNaturstoffe (String Name, int Nummer, String Verwendung, String metallEigenschaft, String Degradation)throws Exception
    {
        if ( sucheName(Name)== null && sucheNummer(Nummer)==null)
        {
            anzahl+=1;
            Werkstoffe naturstoff = new Naturstoffe (Name, Nummer, Verwendung, metallEigenschaft, Degradation);
            liste.add(naturstoff);
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)==null)
        {

            if (test == true)
            {
                System.out.println("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheNummer(Nummer)!= null && sucheName(Name)== null)
        {
            if (test == true)
            {
                System.out.println("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
        else if (sucheName(Name)!= null && sucheNummer(Nummer)!= null)
        {
            if (test==true)
            {
                System.out.println("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
            }
            throw new Exception("Bitte geben Sie einen anderen Name und eine andere Nummer ein, dieser Werkstoff existiert bereits.");
        }
    }

    public void BearbeitenName (int Nummer, String Name)
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setName(Name);
    }

    public void BearbeitenNummer (int Nummer, int nr)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setNummer(nr);
    }

    public void BearbeitenVerwendung (int Nummer, String Verwendung)
    {
        Werkstoffe w = sucheNummer(Nummer);
        w.setVerwendung(Verwendung);
    }

    public void BearbeitenElektrischeLeitfaehigkeitMetalle (int Nummer, double elektrLeitf)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Metalle) w).setElektrischeLeitfaehigkeit(elektrLeitf);
    }

    public void BearbeitenElektrischeLeitfaehigkeitHalbleiter (int Nummer, double elektrLeitf)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Halbleiter) w).setElektrischeLeitfaehigkeit(elektrLeitf);

    }

    public void BearbeitenEisengehalt (int Nummer, double eisengehalt)throws Exception
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

    public void BearbeitenDichte (int Nummer, double Dichte)throws Exception
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Leichtmetalle)w).setDichte(Dichte);
    }

    public void BearbeitenmetallischeEigenschaft (int Nummer, String metallEigenschaft)
    {
        Werkstoffe w = sucheNummer(Nummer);
        ((Nichtmetalle)w).setMetallAehnlicheEigenschaften(metallEigenschaft);
    }

    public void BearbeitenZugfestigkeit (int Nummer, double Zugfestigkeit)throws Exception
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
     * @param name
     * @return Eigenschaften des Werkstoffs mit angegebenem Name
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

        return null;
    }

    /**
     * In der  Arraylist "Liste" wird nach dem Werkstoff mit dem angegebenen Nummer gesucht.
     * Wenn der Werkstoff gefunden werden kann, wird er zurückgegeben und es kann mit ihm weitergearbeitet werden(Wird gelöscht oder bearbeitet).
     * Kann er nicht gefunden werden, wird null zurückgegeben.
     * @param nummer
     * @return Werkstoff mit angegebener Nummer
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
     *  @param verwendung
     *  @return Eigenschaften aller Werkstoffe, die angegebene Verwendung haben.
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

    /**
     * In der Methode "Löschen" wird ein ausgewähltes Objekt aus der Liste, das mit der
     * "Nummer-Suchmethode" aufgerufen wird, gelöscht. Zusätzlich wird die Anzahl, der werkstoffe in der Liste, um eins verrringert.
     * Gibt die "Nummer-Suchmethode" jedoch null zurück (, da der Werkstoff nicht in der Liste gefunden wurde), wird eine Exception geworfen.
     * 
     * @param Nummer
     * @throws Exception
     * 
     */
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

    /**
     *Gibt die Anzahl, der Objekte/ Werkstoffe in der ArrayList, auf dem Bildschirm aus.
     */
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