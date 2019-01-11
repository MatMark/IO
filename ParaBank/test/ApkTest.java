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
public class ApkTest {
    
    public ApkTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Log_in method, of class Apk.
     */
    @Test
    public void testLog_in() throws IOException {
        System.out.println("Log_in");
        String login = "";
        String password = "";
        Apk instance = new Apk();
        instance.Log_in(login, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Log_out method, of class Apk.
     */
    @Test
    public void testLog_out() throws IOException {
        System.out.println("Log_out");
        Apk instance = new Apk();
        instance.Log_out();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiveUser method, of class Apk.
     */
    @Test
    public void testGetActiveUser() throws IOException {
        System.out.println("getActiveUser");
        Apk instance = new Apk();
        KontoKlienta expResult = null;
        KontoKlienta result = instance.getActiveUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiveUser method, of class Apk.
     */
    @Test
    public void testSetActiveUser() throws IOException {
        System.out.println("setActiveUser");
        KontoKlienta user = null;
        Apk instance = new Apk();
        instance.setActiveUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
