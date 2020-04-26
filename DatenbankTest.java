

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

}









