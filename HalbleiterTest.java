

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
        assertEquals(" name:   Germanium\n nummer:   400776\n verwendung:   Arzneimittel\n metallAehnlicheEigenschaften:   plastische Verformbarkeit\n elektrische Leitfaehigkeit:   6.0E-4", halbleit1.gibEigenschaft());
    }
    
    @Test
    public void TestGibEigenschaftHalbleiter2() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter();
        assertEquals(" name:   SiC\n nummer:   409212\n verwendung:   Lichttechnik\n metallAehnlicheEigenschaften:   hohe Wärmeleitfähigkeit\n elektrische Leitfaehigkeit:   0.0098", halbleit1.gibEigenschaft());
    }
    
    //Tests zu setElektrischeLeitfähigkeit-Methode
    @Test
    public void testSetElektrischeLeitfaehigkeitPositiv() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",  0.0006);
        halbleit1.setElektrischeLeitfaehigkeit(50);
        assertEquals(50, halbleit1.getElektrischeLeitfaehigkeit(), 0.1);
        halbleit1.setElektrischeLeitfaehigkeit(0.5);
        assertEquals(0.5, halbleit1.getElektrischeLeitfaehigkeit(), 0.1);
        halbleit1.setElektrischeLeitfaehigkeit(Math.pow(10,6)-1);
        assertEquals(Math.pow(10,6)-1, halbleit1.getElektrischeLeitfaehigkeit(), 0.1);
    }
    
    @Test
    public void testSetElektrischeLeitfaehigkeitUntergrenze() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",  0.0006);
        try
        {
            halbleit1.setElektrischeLeitfaehigkeit(0);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }
    
    @Test
    public void testSetElektrischeLeitfaehigkeitObergrenze() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",  0.0006);
        try
        {
            halbleit1.setElektrischeLeitfaehigkeit(Math.pow(10,6)+0.001);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }
    
    //Test zu SetMetallähnlicheEigenschaft-Methode
    @Test
    public void testSetMetallaehnlicheEigenschaft()throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776, "Arzneimittel", "plastische Verformbarkeit",  0.0006);
        halbleit1.setMetallAehnlicheEigenschaften("hohe Wärmeleitfähigkeit");
        assertEquals("hohe Wärmeleitfähigkeit", halbleit1.getmetallAehnlicheEigenschaften());
    }

    //Test zum Konstruktor
    @Test
    public void testKonstruktorHalbleiter() throws Exception
    {
        Halbleiter halbleit1 = new Halbleiter("Germanium", 400776,  "Arzneimittel", "plastische Verformbarkeit", 5);
        assertEquals("Germanium", halbleit1.getName());
        assertEquals(400776, halbleit1.getNummer());
        assertEquals("Arzneimittel", halbleit1.getVerwendung());
        assertEquals("plastische Verformbarkeit", halbleit1.getmetallAehnlicheEigenschaften());
        assertEquals(5, halbleit1.getElektrischeLeitfaehigkeit(), 0.1);
    }
}






