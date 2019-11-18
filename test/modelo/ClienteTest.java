/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getDni method, of class Cliente.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Cliente instance = new Cliente(33000003,"nombre","domicilio");
        int expResult = 33000003;
        int result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == expResult){
            System.out.print(result);
            System.out.print("Test passed");

        }
        else{
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of setDni method, of class Cliente.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 32323232;
        Cliente instance = new Cliente(544545544,"clienteNombre","clienteDomicilio");
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        if( dni == instance.getDni()){
            System.out.print("Test passed set dni");
        }
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente(45545454,"nombreCliente","domicilioCliente");
        String expResult = "nombreCliente";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult == result){
            System.out.print("Test approved, Get Name");
        }
        else
        {
            fail("The test case is a prototype.");
        }
   }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre_test";
        Cliente instance = new Cliente(1121212,"nombre","domicilio");
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        if(nombre == instance.getNombre()){
            System.out.println("modelo.ClienteTest.testSetNombre() passed");
        }
        else{
            fail("The test case is a prototype.");

        }
    }

    /**
     * Test of getDomicilio method, of class Cliente.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Cliente instance = new Cliente(488484,"nombre","viejoDomicilio");
        String expResult = "viejoDomicilio";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println("modelo.ClienteTest.testGetDomicilio() test passed");
        }
        else{
            fail("The test case is a prototype.");

        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDomicilio method, of class Cliente.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Cliente instance = new Cliente();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cuotasImpagas method, of class Cliente.
     */
    @Test
    public void testCuotasImpagas() {
        System.out.println("cuotasImpagas");
        Cliente instance = new Cliente();
        List<Cuota> expResult = null;
        List<Cuota> result = instance.cuotasImpagas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCredito method, of class Cliente.
     */
    @Test
    public void testBuscarCredito() {
        System.out.println("buscarCredito");
        String idCredito = "";
        Cliente instance = new Cliente();
        Credito expResult = null;
        Credito result = instance.buscarCredito(idCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCuota method, of class Cliente.
     */
    @Test
    public void testBuscarCuota() {
        System.out.println("buscarCuota");
        String idCredito = "";
        int idCuota = 0;
        Cliente instance = new Cliente();
        Cuota expResult = null;
        Cuota result = instance.buscarCuota(idCredito, idCuota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
