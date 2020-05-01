

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse HalbleiterTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HalbleiterTest
{
    /**
     * Konstruktor fuer die Test-Klasse HalbleiterTest
     */
    public HalbleiterTest()
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
    public void TestGibEigenschaftHalbleiter1() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit", 0.0006);
        assertEquals("name:   Germanium\n nummer:   400776\n verwendung:   Arzneimittel\n metallAehnlicheEigenschaften:   plastische Verformbarkeit\n elektrische Leitfaehigkeit:   6.0E-4", halbleit1.gibEigenschaft());
    }
    
    @Test
    public void TestGibEigenschaftHalbleiter2() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter();
        assertEquals("name:   SiC\n nummer:   409212\n verwendung:   Lichttechnik\n metallAehnlicheEigenschaften:   hohe Wärmeleitfähigkeit\n elektrische Leitfaehigkeit:   0.0098", halbleit1.gibEigenschaft());
    }
}


