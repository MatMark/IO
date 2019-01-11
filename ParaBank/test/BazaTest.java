/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matma
 */
public class BazaTest {
    
    public BazaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of HaveAccount method, of class Baza.
     */
    @Test
    public void testHaveAccount() throws IOException {
        System.out.println("HaveAccount");
        Uzytkownik user = null;
        Baza instance = new Baza();
        boolean expResult = false;
        boolean result = instance.HaveAccount(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckLogin method, of class Baza.
     */
    @Test
    public void testCheckLogin() throws IOException {
        System.out.println("CheckLogin");
        String login = "";
        String pass = "";
        Baza instance = new Baza();
        KontoKlienta expResult = null;
        KontoKlienta result = instance.CheckLogin(login, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckUserByNumber method, of class Baza.
     */
    @Test
    public void testCheckUserByNumber() throws IOException {
        System.out.println("CheckUserByNumber");
        String num = "";
        Baza instance = new Baza();
        KontoKlienta expResult = null;
        KontoKlienta result = instance.CheckUserByNumber(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteAccount method, of class Baza.
     */
    @Test
    public void testDeleteAccount() throws IOException {
        System.out.println("DeleteAccount");
        KontoKlienta konto = null;
        Baza instance = new Baza();
        instance.DeleteAccount(konto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NewAccount method, of class Baza.
     */
    @Test
    public void testNewAccount() throws Exception {
        System.out.println("NewAccount");
        Uzytkownik user = null;
        Baza instance = new Baza();
        instance.NewAccount(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
