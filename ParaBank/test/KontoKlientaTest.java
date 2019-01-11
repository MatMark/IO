/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matma
 */
public class KontoKlientaTest {
    
    public KontoKlientaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of LiczZdolnosc method, of class KontoKlienta.
     */
    @Test
    public void testLiczZdolnosc() throws IOException {
        System.out.println("LiczZdolnosc");
        KontoKlienta instance = new KontoKlienta();
        instance.LiczZdolnosc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loan method, of class KontoKlienta.
     */
    @Test
    public void testLoan() throws IOException {
        System.out.println("Loan");
        float amount = 0.0F;
        KontoKlienta instance = new KontoKlienta();
        boolean expResult = false;
        boolean result = instance.Loan(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class KontoKlienta.
     */
    @Test
    public void testGetOwner() throws IOException {
        System.out.println("getOwner");
        KontoKlienta instance = new KontoKlienta();
        Uzytkownik expResult = null;
        Uzytkownik result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class KontoKlienta.
     */
    @Test
    public void testSetOwner() throws IOException {
        System.out.println("setOwner");
        Uzytkownik owner = null;
        KontoKlienta instance = new KontoKlienta();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class KontoKlienta.
     */
    @Test
    public void testGetNumber() throws IOException {
        System.out.println("getNumber");
        KontoKlienta instance = new KontoKlienta();
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class KontoKlienta.
     */
    @Test
    public void testSetNumber() throws IOException {
        System.out.println("setNumber");
        String number = "";
        KontoKlienta instance = new KontoKlienta();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Transfer method, of class KontoKlienta.
     */
    @Test
    public void testTransfer() throws IOException {
        System.out.println("Transfer");
        KontoKlienta src = null;
        KontoKlienta dst = null;
        float amount = 0.0F;
        String title = "";
        KontoKlienta instance = new KontoKlienta();
        boolean expResult = false;
        boolean result = instance.Transfer(src, dst, amount, title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHist method, of class KontoKlienta.
     */
    @Test
    public void testGetHist() throws IOException {
        System.out.println("getHist");
        KontoKlienta instance = new KontoKlienta();
        List<Transakcja> expResult = null;
        List<Transakcja> result = instance.getHist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHist method, of class KontoKlienta.
     */
    @Test
    public void testSetHist() throws IOException {
        System.out.println("setHist");
        List<Transakcja> hist = null;
        KontoKlienta instance = new KontoKlienta();
        instance.setHist(hist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountBalance method, of class KontoKlienta.
     */
    @Test
    public void testGetAccountBalance() throws IOException {
        System.out.println("getAccountBalance");
        KontoKlienta instance = new KontoKlienta();
        float expResult = 0.0F;
        float result = instance.getAccountBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountBalance method, of class KontoKlienta.
     */
    @Test
    public void testSetAccountBalance() throws IOException {
        System.out.println("setAccountBalance");
        float accountBalance = 0.0F;
        KontoKlienta instance = new KontoKlienta();
        instance.setAccountBalance(accountBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class KontoKlienta.
     */
    @Test
    public void testGetDate() throws IOException {
        System.out.println("getDate");
        KontoKlienta instance = new KontoKlienta();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZdolnosc method, of class KontoKlienta.
     */
    @Test
    public void testGetZdolnosc() throws IOException {
        System.out.println("getZdolnosc");
        KontoKlienta instance = new KontoKlienta();
        float expResult = 0.0F;
        float result = instance.getZdolnosc();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZdolnosc method, of class KontoKlienta.
     */
    @Test
    public void testSetZdolnosc() throws IOException {
        System.out.println("setZdolnosc");
        float zdolnosc = 0.0F;
        KontoKlienta instance = new KontoKlienta();
        instance.setZdolnosc(zdolnosc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
