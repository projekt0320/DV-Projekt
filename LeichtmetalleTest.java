

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
    
    //Test zum Konstruktor 
    @Test
    public void testKonstruktorLeichtmetall()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportauto", 2.5, "Titan", 4.5);
        assertEquals("Sportauto", leichtme1.getVerwendung());
        assertEquals("Titan", leichtme1.getName());
        assertEquals(20000, leichtme1.getNummer());
        assertEquals(2.5, leichtme1.getElektrischeLeitfaehigkeit(), 0.1);
        assertEquals("Titan", leichtme1.getHauptelement());
        assertEquals(4.5, leichtme1.getDichte(), 0.1);
    }
     
    //Tests zu GibEigenschaft-Methode
    @Test
    public void TestGibEigenschaftLeichtmetalle1() throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Auto", 2.5, "Titan", 4.5);
        assertEquals( " name:   Titan\n nummer:   20000\n verwendung:   Auto\n elektrischeLeitfaehigkeit:   2.5\n Hauptelement:   Titan\n Dichte:   4.5",leichtme1.gibEigenschaft());
    }

    @Test
    public void TestGibEigenschaftLeichtmetalle2()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle();
        assertEquals(" name:   AlCu4Mg1\n nummer:   31355\n verwendung:   Luftfahrttechnik\n elektrischeLeitfaehigkeit:   8.3\n Hauptelement:   Aluminium\n Dichte:   2.77", leichtme1.gibEigenschaft());
    }
    
    //Tests zu SetDichte-Methode
    @Test
    public void testSetDichtePositiv()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        leichtme1.setDichte(3);
        assertEquals(3, leichtme1.getDichte(), 0.1);
        leichtme1.setDichte(0.5);
        assertEquals(0.5, leichtme1.getDichte(), 0.1);
        leichtme1.setDichte(4.5);
        assertEquals(4.5, leichtme1.getDichte(), 0.1);
    }
    
     @Test
    public void testSetDichteUntergrenze()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        try
        {
           leichtme1.setDichte(0);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
        
       
    }
    
    @Test
    public void testSetDichteObergrenze()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        try
        {
           leichtme1.setDichte(5);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
        
       
    }
    
    //Tests zu SetHauptelement-Methode
    @Test
    public void testSetHauptelement()throws Exception
    {
        Leichtmetalle leichtme1 = new Leichtmetalle("Titan", 20000, "Sportwagen", 2.5, "Titan", 4.5);
        leichtme1.setHauptelement("HauptelementNeu");
        assertEquals( "HauptelementNeu"  , leichtme1.getHauptelement()   );
    }

   
}








