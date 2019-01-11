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
public class UzytkownikTest {
    
    public UzytkownikTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLogin method, of class Uzytkownik.
     */
    @Test
    public void testGetLogin() throws IOException {
        System.out.println("getLogin");
        Uzytkownik instance = new Uzytkownik();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Uzytkownik.
     */
    @Test
    public void testSetLogin() throws IOException {
        System.out.println("setLogin");
        String login = "";
        Uzytkownik instance = new Uzytkownik();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Uzytkownik.
     */
    @Test
    public void testGetPassword() throws IOException {
        System.out.println("getPassword");
        Uzytkownik instance = new Uzytkownik();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Uzytkownik.
     */
    @Test
    public void testSetPassword() throws IOException {
        System.out.println("setPassword");
        String password = "";
        Uzytkownik instance = new Uzytkownik();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_ID method, of class Uzytkownik.
     */
    @Test
    public void testGetUser_ID() throws IOException {
        System.out.println("getUser_ID");
        Uzytkownik instance = new Uzytkownik();
        int expResult = 0;
        int result = instance.getUser_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_ID method, of class Uzytkownik.
     */
    @Test
    public void testSetUser_ID() throws IOException {
        System.out.println("setUser_ID");
        int user_ID = 0;
        Uzytkownik instance = new Uzytkownik();
        instance.setUser_ID(user_ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Uzytkownik.
     */
    @Test
    public void testGetName() throws IOException {
        System.out.println("getName");
        Uzytkownik instance = new Uzytkownik();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Uzytkownik.
     */
    @Test
    public void testSetName() throws IOException {
        System.out.println("setName");
        String name = "";
        Uzytkownik instance = new Uzytkownik();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Uzytkownik.
     */
    @Test
    public void testGetSurname() throws IOException {
        System.out.println("getSurname");
        Uzytkownik instance = new Uzytkownik();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Uzytkownik.
     */
    @Test
    public void testSetSurname() throws IOException {
        System.out.println("setSurname");
        String surname = "";
        Uzytkownik instance = new Uzytkownik();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
