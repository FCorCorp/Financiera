/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yessica
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLegajo method, of class Empleado.
     */
    @Test
    public void testGetLegajo() {
        System.out.println("getLegajo");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getLegajo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLegajo method, of class Empleado.
     */
    @Test
    public void testSetLegajo() {
        System.out.println("setLegajo");
        int legajo = 0;
        Empleado instance = new Empleado();
        instance.setLegajo(legajo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDomicilio method, of class Empleado.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDomicilio method, of class Empleado.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Empleado instance = new Empleado();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Empleado.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Empleado.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Empleado instance = new Empleado();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Empleado.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Empleado instance = new Empleado();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
