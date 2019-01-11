/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matma
 */
public class TransakcjaTest {
    
    public TransakcjaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDate method, of class Transakcja.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Transakcja instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Transakcja.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Transakcja instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Transakcja.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transakcja instance = null;
        float expResult = 0.0F;
        float result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Transakcja.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        float amount = 0.0F;
        Transakcja instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Transakcja.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Transakcja instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Transakcja.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Transakcja instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSource method, of class Transakcja.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        Transakcja instance = null;
        KontoKlienta expResult = null;
        KontoKlienta result = instance.getSource();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSource method, of class Transakcja.
     */
    @Test
    public void testSetSource() {
        System.out.println("setSource");
        KontoKlienta source = null;
        Transakcja instance = null;
        instance.setSource(source);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Transakcja.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Transakcja instance = null;
        KontoKlienta expResult = null;
        KontoKlienta result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Transakcja.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        KontoKlienta destination = null;
        Transakcja instance = null;
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
