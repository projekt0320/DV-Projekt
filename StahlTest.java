

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse StahlTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StahlTest
{
    /**
     * Konstruktor fuer die Test-Klasse StahlTest
     */
    public StahlTest()
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
    
    //Tests zu GibEigenschaft-Methode
    @Test
    public void TestGibEigenschaftStahl1() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067, "Bau", 9.4, 67.0, 0.52);
        assertEquals(" name:   St52\n nummer:   10067\n verwendung:   Bau\n elektrischeLeitfaehigkeit:   9.4\n Eisengehalt:   67.0\n Kohlenstoffgehalt:   0.52", stahl1.gibEigenschaft());
    }

    @Test
    public void TestGibEigenschaftStahl2() throws Exception
    {
        Stahl stahl1 = new Stahl();
        assertEquals(" name:   C45\n nummer:   10503\n verwendung:   Maschinenbau\n elektrischeLeitfaehigkeit:   8.3\n Eisengehalt:   97.0\n Kohlenstoffgehalt:   0.45", stahl1.gibEigenschaft());
    }
}


