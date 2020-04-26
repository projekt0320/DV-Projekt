

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse LeichtmetalleTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LeichtmetalleTest
{
    /**
     * Konstruktor fuer die Test-Klasse LeichtmetalleTest
     */
    public LeichtmetalleTest()
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
    public void testKonstruktor() throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        assertEquals(4.5, leichtme1.getDichte(), 0.1);
    }

    @Test
    public void testKonstruktor2()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportauto", 2.5, "Titan", 4.5);
        assertEquals("Sportauto", leichtme1.getVerwendung());
        assertEquals("Titan", leichtme1.getName());
        assertEquals(20000, leichtme1.getNummer());
        assertEquals(2.5, leichtme1.getElektrischeLeitfaehigkeit(), 0.1);
        assertEquals("Titan", leichtme1.getHauptelement());
        assertEquals(4.5, leichtme1.getDichte(), 0.1);
    }
    


    @Test
    public void negativTesten() throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 2, "Sportauto", 2.5, "Titan", 4.5);
        assertEquals(2,leichtme1.getNummer());
    }

    @Test
    public void testeGibEigenschaft() throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        assertEquals( " name:   Titan\n nummer:   20000\n verwendung:   Auto\n elektrischeLeitfaehigkeit:   2.5\n Hauptelement:   Titan\n Dichte:   4.5",leichtme1.gibEigenschaft());
    }
}





