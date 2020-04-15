

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
    public void testKonstruktor()
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        assertEquals(4.5, leichtme1.getDichte(), 0.1);
    }
}

