

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
    @Test
        public void testKonstruktor() throws Exception
        {
            Stahl stahl1 = new Stahl("St52", 10067, "Bau ", 9.4, 67.0, 0.52);
            assertEquals("St52", stahl1.getName());
            assertEquals(10067, stahl1.getNummer());
            assertEquals("Bau ", stahl1.getVerwendung());
            assertEquals(9.4, stahl1.getElektrischeLeitfaehigkeit(), 0.1);
            assertEquals(67.0, stahl1.getEisengehalt(), 0.1);
            assertEquals(0.52, stahl1.getKohlenstoffgehalt(), 0.1);
        }
    
    @Test
    public void testSetKohlenstoffgehaltPositiv() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau ", 9.4,  67.0, 0.52);
        stahl1.setKohlenstoffgehalt(1);
        assertEquals(1, stahl1.getKohlenstoffgehalt(), 0.1);
    }
      @Test
    public void testSetKohlenstoffgehaltUntergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau ", 9.4,  67.0, 0.52);
        try
        {
        stahl1.setKohlenstoffgehalt(0);
       
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
    }
     public void testSetKohlenstoffgehaltObergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau ", 9.4,  67.0, 0.52);
        try
        {
        stahl1.setKohlenstoffgehalt(2.07);
       
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
    }
     @Test
    public void testSetEisengehaltPositiv() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau", 9.4,  67.0, 0.52);
        stahl1.setEisengehalt(75);
        assertEquals(75, stahl1.getEisengehalt(), 0.1);
    }
      @Test
    public void testSetEisengehaltUntergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau", 9.4,  67.0, 0.52);
        try
        {
        stahl1.setEisengehalt(50);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }
       @Test
    public void testSetEisengehaltObergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau", 9.4,  67.0, 0.52);
        try
        {
        stahl1.setEisengehalt(100);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }

    @Test
    public void testSetElektrischeLeitfaehigkeitPositiv()throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067, "Bau", 9.4, 67.0, 0.52);
        stahl1.setElektrischeLeitfaehigkeit(5);
        assertEquals(5, stahl1.getElektrischeLeitfaehigkeit(), 0.1);
    }
    @Test
    public void testSetElektrischeLeitfaehigkeitUntergrenze()throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067, "Bau", 9.4, 67.0, 0.52);
        try
        {
         stahl1.setElektrischeLeitfaehigkeit(0.68);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
        
    }
      @Test
    public void testSetElektrischeLeitfaehigkeitObergrenze()throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067, "Bau", 9.4, 67.0, 0.52);
        try
        {
         stahl1.setElektrischeLeitfaehigkeit(62.001);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
        
    }
    

    @Test
    public void testSetNummerPositiv() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau",  9.4, 67.0, 0.52);
        stahl1.setNummer(1000000);
        assertEquals(1000000, stahl1.getNummer());
    }
     @Test
    public void testSetNummerUntergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau",  9.4, 67.0, 0.52);
          try
        {
             stahl1.setNummer(0);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }
        @Test
    public void testSetNummerObergrenze() throws Exception
    {
        Stahl stahl1 = new Stahl("St52", 10067,  "Bau",  9.4, 67.0, 0.52);
          try
        {
             stahl1.setNummer(10000000);
        }
        catch(Exception e)
        {
            System.out.println(     e.getMessage()   );
        }
       
    }

   
}






