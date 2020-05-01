
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

    //Testen der ErstellenLEichtmetalle- Methode

    @Test
    public void testeErstellenLeichtmetalle() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Sportauto", 2.5, "Titan", 4.5);
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(20000));
        assertEquals(datenban1.liste.get(0), datenban1.sucheNummer(20000));
    }

    @Test
    public void testeErstellenLeichtmetalleAlternativ() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        assertNotNull(datenban1.sucheNummer(20000));
    }
    //
    @Test
    public void testeErstellenLeichtmetalleMitGleicherNummer()
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
            //assertSame( e,   datenban1.ErstellenLeichtmetalle("met2", 20000, "Sportauto", 2.5, "Titan", 4.5)     );
        }

    }

    @Test
    public void testeErstellenLeichtmetalleMitGleichemName()
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
    public void EstellenLeichtmetalleGleicheNummerUndName()
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

    //Positives Testen Bearbeitemethoden

    @Test
    public void testeBearbeitenDichte() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "auto", 2.5, "Titan", 4.5);
        datenban1.BearbeitenName(20000, "TitanNeu");
        assertEquals(datenban1.liste.get(0).getName(),"TitanNeu");
    }

    @Test
    public void testeBearbeitenNummer() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "auto", 2.5, "Titan", 4.5);
        datenban1.BearbeitenNummer(20000, 30000);
        assertEquals(datenban1.liste.get(0).getNummer(),30000);
    }

    //Positives Testen Lösche- MEthoden
    @Test
    public void testeLoeschen() throws Exception
    {
        Datenbank datenban1 = new Datenbank();
        datenban1.ErstellenLeichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        datenban1.loeschen(20000);
        assertNull(datenban1.liste.get(0)); 
    }
    @Test
    public void testeLoeschenFalscheNummer() throws Exception
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
        assertEquals(datenban1.sucheName("Titan")," name:   Titan\n nummer:   20000\n verwendung:   Auto\n elektrischeLeitfaehigkeit:   2.5\n Hauptelement:   Titan\n Dichte:   4.5");
    }
    
     @Test
    public void TestSucheName3() throws Exception
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
        assertEquals(datenban1.sucheName("Germanium"),"name:   Germanium\n nummer:   400776\n verwendung:   Arzneimittel\n metallAehnlicheEigenschaften:   plastische Verformbarkeit\n elektrische Leitfaehigkeit:   6.0E-4");
    }
    
    @Test
    public void TestSucheName4() throws Exception
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
            datenban1.sucheName("Styropor");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
    }

    @Test
    public void TestSucheName5()
    {
        Datenbank datenban1 = new Datenbank();
        try
        {
            datenban1.sucheName("Styropor");
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage()   );
        }
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
    }
    
    @Test
    public void TestSucheNummer2() throws Exception
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
        Leichtmetalle Leichtmetall1 = (Leichtmetalle)datenban1.sucheNummer(20000);
        assertEquals(datenban1.liste.get(5), datenban1.sucheNummer(20000));
        assertEquals( Leichtmetall1.getNummer(),20000 );
    }
    
    @Test
    public void TestSucheNummer3() throws Exception
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
        Halbleiter Halbleiter1 = (Halbleiter)datenban1.sucheNummer(400776);
        assertEquals(datenban1.liste.get(8), datenban1.sucheNummer(400776));
        assertEquals( Halbleiter1.getNummer(),400776 );
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
        assertEquals(null, datenban1.sucheNummer(14478));
    }
    
     @Test
    public void TestSucheNummer5()
    {
        Datenbank datenban1 = new Datenbank();
        assertEquals(null, datenban1.sucheNummer(10503));
    }
    
    @Test
    public void TestSucheNummer6()throws Exception
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
        assertEquals(datenban1.sucheVerwendung("Bau")," name:   C45\n nummer:   10503\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45");
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
        assertEquals(datenban1.sucheVerwendung("Bau")," name:   C45\n nummer:   10503\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45 name:   St52\n nummer:   10067\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   9.4\n Eisengehalt:   67.0\n Kohlenstoffgehalt:   0.52 name:   AlCu4Mg1\n nummer:   31355\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   8.3\n Hauptelement:   Aluminium\n Dichte:   2.77name:   SiC\n nummer:   409212\n verwendung:   Bau\n metallAehnlicheEigenschaften:   hohe Wärmeleitfähigkeit\n elektrische Leitfaehigkeit:   0.0098");
    }
 
    
    @Test
    public void TestSucheVerwendung3()
    {
        Datenbank datenban1 = new Datenbank();
        assertEquals(datenban1.sucheVerwendung("Bau"),"Es konnte kein Werkstoff mit der angegebenen Verwendung gefunden werden");
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
        assertEquals(datenban1.sucheVerwendung("Elektronik"),"Es konnte kein Werkstoff mit der angegebenen Verwendung gefunden werden");
    }

    

    

   
}



