
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse DatenbankTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DatenbankTest
{
    /**
     * Konstruktor fuer die Test-Klasse DatenbankTest
     */
    public DatenbankTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testErstelleHalbleiter() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.5);
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(400776));
        assertEquals(datenban1.AnzahlWerkstoffe(),1);
    }
    //Testen der ErstellenLeichtmetalle- Methode
    @Test
    public void testErstellenHalbleiterMitGleicherNummer()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
            datenban1.ErstellenHalbleiter("WeitererHalbleiter", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    } 

    @Test
    public void testErstellenHalbleiterMitGleichemName()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
            datenban1.ErstellenHalbleiter("Germanium", 400000, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    } 

    @Test
    public void testErstellenHalbleiterGleicheNummerUndName()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
            datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    } 

    @Test
    public void testErstelleStahl() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(10067));
        assertEquals(datenban1.AnzahlWerkstoffe(),1);
    }

    @Test
    public void testErstellenStahlMitGleicherNummer() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenStahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
            datenban1.ErstellenStahl("St", 10067, "Bau ", 9.4, 67.0, 0.52);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testErstellenStahlMitGleichemName() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenStahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
            datenban1.ErstellenStahl("St52", 20000, "Bau ", 9.4, 67.0, 0.52);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testErstellenStahlGleicheNummerundName() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenStahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
            datenban1.ErstellenStahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testErstellenLeichtmetalle() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Sportauto", 2.5, "Titan", 4.5);
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(20000));
        assertEquals(datenban1.AnzahlWerkstoffe(),1);
    }

    @Test
    public void testErstellenLeichtmetalleMitGleicherNummer()
    {
        Datenbank datenban1 = new Datenbank();
        try
        {

            datenban1.ErstellenLeichtmetalle("Titan", 20000, "Sportauto", 2.5, "Titan", 4.5);
            datenban1.ErstellenLeichtmetalle("met2", 20000, "Sportauto", 2.5, "Titan", 4.5);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testErstellenLeichtmetalleMitGleichemName()
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
            datenban1.ErstellenLeichtmetalle("Titan", 20002, "Auto", 2.5, "Titan", 4.5);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEstellenLeichtmetalleGleicheNummerUndName()
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
            datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    //Positives Testen Lösche- Methoden
    @Test
    public void testeLoeschen() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        assertEquals(datenban1.liste.size(), 1); 
        assertEquals(datenban1.AnzahlWerkstoffe(),1);
        datenban1.loeschen(20000);
        assertEquals(datenban1.liste.size(), 0); 
        assertEquals(datenban1.AnzahlWerkstoffe(),0);
    }

    @Test
    public void testeLoeschenLeereListe() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.loeschen(20000);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void testeLoeschenFalscheNummer() throws Exception
    {

        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        try
        {
            datenban1.loeschen(20000);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }
    
    //Tests zu SucheName-Methde
    @Test
    public void TestSucheName1() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(datenban1.sucheName("C45")," name:   C45\n nummer:   10503\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45");
        assertEquals(datenban1.sucheName("Titan")," name:   Titan\n nummer:   20000\n verwendung:   Auto\n elektrischeLeitfaehigkeit:   2.5\n Hauptelement:   Titan\n Dichte:   4.5");
        assertEquals(datenban1.sucheName("Germanium")," name:   Germanium\n nummer:   400776\n verwendung:   Arzneimittel\n metallAehnlicheEigenschaften:   plastische Verformbarkeit\n elektrische Leitfaehigkeit:   6.0E-4");
    }

    @Test
    public void TestSucheName2() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(null, datenban1.sucheName("Styropor"));
    }

    @Test
    public void TestSucheName3()
    {
        Datenbank datenban1 = new Datenbank();
        assertEquals(null, datenban1.sucheName("Styropor"));
    }

    //Tests zu SucheNummer-Methode
    @Test
    public void TestSucheNummer1() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);

        Stahl stahl1 = (Stahl)datenban1.sucheNummer(10503);
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(10503));
        assertEquals( stahl1.getNummer(),10503 );

        Leichtmetalle Leichtmetall1 = (Leichtmetalle)datenban1.sucheNummer(20000);
        assertEquals(datenban1.liste.get(5), datenban1.sucheNummer(20000));
        assertEquals( Leichtmetall1.getNummer(),20000 );

        Halbleiter Halbleiter1 = (Halbleiter)datenban1.sucheNummer(400776);
        assertEquals(datenban1.liste.get(8), datenban1.sucheNummer(400776));
        assertEquals( Halbleiter1.getNummer(),400776 );
    }

    @Test
    public void TestSucheNummer2()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(null, datenban1.sucheNummer(14478));
    }

    @Test
    public void TestSucheNummer3()
    {
        Datenbank datenban1 = new Datenbank();
        assertEquals(null, datenban1.sucheNummer(10503));
    }

    @Test
    public void TestSucheNummer4()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(null, datenban1.sucheNummer(-458));
        assertEquals(null, datenban1.sucheNummer(0));
        assertEquals(null, datenban1.sucheNummer(10000000));
    }

    //Tests zu SucheVerwendung-Methode 
    @Test
    public void TestSucheVerwendung1() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Maschinenau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Luftfahrttechnik", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Lichttechnik", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(datenban1.sucheVerwendung("Bau"),"\n name:   C45\n nummer:   10503\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45");
    }

    @Test
    public void TestSucheVerwendung2()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        assertEquals(datenban1.sucheVerwendung("Bau"),"\n name:   C45\n nummer:   10503\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45\n name:   St52\n nummer:   10067\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   9.4\n Eisengehalt:   67.0\n Kohlenstoffgehalt:   0.52\n name:   AlCu4Mg1\n nummer:   31355\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Hauptelement:   Aluminium\n Dichte:   2.77\n name:   SiC\n nummer:   409212\n verwendung:   Bau\n metallAehnlicheEigenschaften:   hohe Wärmeleitfähigkeit\n elektrische Leitfaehigkeit:   0.0098");
    }

    @Test
    public void TestSucheVerwendung3()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.sucheVerwendung("Bau");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestSucheVerwendung4() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.sucheVerwendung("Elektronik");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    //Tests zu Methode Bearbeiten Name
    @Test
    public void TestBearbeitenName1() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);

        datenban1.BearbeitenName(10503, "C45Neu");
        assertEquals(datenban1.liste.get(0).getName(),"C45Neu");

        datenban1.BearbeitenName(20000, "TitanNeu");
        assertEquals(datenban1.liste.get(5).getName(),"TitanNeu");

        datenban1.BearbeitenName(400776, "GermaniumNeu");
        assertEquals(datenban1.liste.get(8).getName(),"GermaniumNeu");
    }

    @Test
    public void TestBearbeitenName2() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenName(14478, "Werkstoff");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenName3() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.BearbeitenName(14478, "Werkstoff");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenName4() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013); 
        try
        {
            datenban1.BearbeitenName(10503, "Titan");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    //Tests zu Methode BearbeitenKohlenstoffgehalt
    @Test
    public void TestBearbeitenKohlenstoffgehalt2()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(10503, -5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(10503, 0);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(10503, 2.07);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestBearbeitenKohlenstoffgehalt3()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);

        datenban1.BearbeitenKohlenstoffgehalt(20000, 2.1);   // Programmfehler: „ClassCastException: class Leichtmetalle cannot be cast to class Stahl“
        datenban1.BearbeitenKohlenstoffgehalt(400776, 2.1);  //wird nicht mehr ausgeführt,würde jedoch Programmfehler aufrufen: „ClassCastException: class Halbleiter cannot be cast to class Stahl“

    }

    @Test
    public void TestBearbeitenKohlenstoffgehalt4()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(14478, 2.1);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenKohlenstoffgehalt5()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(14478, 2.1);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenKohlenstoffgehalt6()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(-488,2.1);   
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(0,2.1);    
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
        try
        {
            datenban1.BearbeitenKohlenstoffgehalt(10000000,2.1); 
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    //Test zu Methode BearbeitenDichte
    @Test
    public void TestBearbeitenDichte2()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenDichte(20000, -3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenDichte(20000, 0);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenDichte(20000, 5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestBearbeitenDichte3()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);

        datenban1.BearbeitenDichte(10503, 3.5);  // Programmfehler: „ClassCastException: class Stahl cannot be cast to class Leichtmetalle“
        datenban1.BearbeitenDichte(400776, 3.5); //wird nicht mehr ausgeführt,würde jedoch Programmfehler aufrufen: „ClassCastException: class Halbleiter cannot be cast to class Leichtmetalle“

    }

    @Test
    public void TestBearbeitenDichte4()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenDichte(14478, 3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenDichte5()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.BearbeitenDichte(14478, 3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    @Test
    public void TestBearbeitenDichte6()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenDichte(-488,3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
        try
        {
            datenban1.BearbeitenDichte(0,3.5);  
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
        try
        {
            datenban1.BearbeitenDichte(10000000,3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()  );
        }
    }

    //Test zu Methode BearbeitenElektrischeLeitfaehigkeitHalbleiter
    @Test
    public void TestBearbeitenElektrischeLeitfaehigkeitHalbleiter2()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(400776, -0.0008);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(400776, 0);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(400776, Math.pow(10,6)+0.0001);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestBearbeitenElektrischeLeitfaehigkeitHalbleiter3()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);

        datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(10503, 0.0008);  // Programmfehler: „ClassCastException: class Stahl cannot be cast to class Halbleiter“
        datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(20000, 0.0008); //wird nicht mehr ausgeführt,würde jedoch Programmfehler aufrufen: „ClassCastException: class Leichtmetalle cannot be cast to class Halbleiter“

    }

    @Test
    public void TestBearbeitenElektrischeLeitfaehigkeitHalbleiter4()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(14478, 0.0008);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestBearbeitenElektrischeLeitfaehigkeitHalbleiter5()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(14478, 0.0008);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestBearbeitenElektrischeLeitfaehigkeitHalbleiter6()throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenStahl("C45", 10503, "Bau", 8.3, 97, 0.45);
        datenban1.ErstellenStahl("St52", 10067, "Bau", 9.4, 67, 0.52);
        datenban1.ErstellenStahl("St33", 10025, "Fahrzeugbau", 10.6, 83, 0.33);
        datenban1.ErstellenStahl("Invar-Stahl", 10111, "Präzisionsmessinstrumente", 3.2, 65, 0.2);
        datenban1.ErstellenLeichtmetalle("AlCu4Mg1", 31355, "Bau", 8.3, "Aluminium", 2.77);
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.ErstellenLeichtmetalle("Magnesium", 31400, "Raumfahrt", 6.0, "Magnesium", 3.5);
        datenban1.ErstellenHalbleiter("SiC", 409212, "Bau", "hohe Wärmeleitfähigkeit",0.0098);
        datenban1.ErstellenHalbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",0.0006);
        datenban1.ErstellenHalbleiter("Cadmiumsulfid", 408228, "Halbleitertechnik", "metallischer Glanz",0.0013);
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(-488,3.5);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(0,3.5);  
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
        try
        {
            datenban1.BearbeitenElektrischeLeitfaehigkeitHalbleiter(10000000,3.5); 
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

}



