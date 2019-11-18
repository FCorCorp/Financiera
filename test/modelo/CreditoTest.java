/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
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
public class CreditoTest {
    
    public CreditoTest() {
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
     * Test of getIdentificadorCredito method, of class Credito.
     */
    @Test
    public void testGetIdentificadorCredito() {
        System.out.println("getIdentificadorCredito");
        Credito instance = new Credito();
        String expResult = "";
        String result = instance.getIdentificadorCredito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificadorCredito method, of class Credito.
     */
    @Test
    public void testSetIdentificadorCredito() {
        System.out.println("setIdentificadorCredito");
        String identificadorCredito = "";
        Credito instance = new Credito();
        instance.setIdentificadorCredito(identificadorCredito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCreacion method, of class Credito.
     */
    @Test
    public void testGetFechaCreacion() {
        System.out.println("getFechaCreacion");
        Credito instance = new Credito();
        DateFormat expResult = null;
        DateFormat result = instance.getFechaCreacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCreacion method, of class Credito.
     */
    @Test
    public void testSetFechaCreacion() {
        System.out.println("setFechaCreacion");
        DateFormat fechaCreacion = null;
        Credito instance = new Credito();
        instance.setFechaCreacion(fechaCreacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFinalizacion method, of class Credito.
     */
    @Test
    public void testGetFechaFinalizacion() {
        System.out.println("getFechaFinalizacion");
        Credito instance = new Credito();
        DateFormat expResult = null;
        DateFormat result = instance.getFechaFinalizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFinalizacion method, of class Credito.
     */
    @Test
    public void testSetFechaFinalizacion() {
        System.out.println("setFechaFinalizacion");
        DateFormat fechaFinalizacion = null;
        Credito instance = new Credito();
        instance.setFechaFinalizacion(fechaFinalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoSolicitado method, of class Credito.
     */
    @Test
    public void testGetMontoSolicitado() {
        System.out.println("getMontoSolicitado");
        Credito instance = new Credito();
        double expResult = 0.0;
        double result = instance.getMontoSolicitado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontoSolicitado method, of class Credito.
     */
    @Test
    public void testSetMontoSolicitado() {
        System.out.println("setMontoSolicitado");
        double montoSolicitado = 0.0;
        Credito instance = new Credito();
        instance.setMontoSolicitado(montoSolicitado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInteres method, of class Credito.
     */
    @Test
    public void testGetInteres() {
        System.out.println("getInteres");
        Credito instance = new Credito();
        double expResult = 0.0;
        double result = instance.getInteres();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInteres method, of class Credito.
     */
    @Test
    public void testSetInteres() {
        System.out.println("setInteres");
        double interes = 0.0;
        Credito instance = new Credito();
        instance.setInteres(interes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoEntregado method, of class Credito.
     */
    @Test
    public void testGetMontoEntregado() {
        System.out.println("getMontoEntregado");
        Credito instance = new Credito();
        double expResult = 0.0;
        double result = instance.getMontoEntregado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontoEntregado method, of class Credito.
     */
    @Test
    public void testSetMontoEntregado() {
        System.out.println("setMontoEntregado");
        double montoEntregado = 0.0;
        Credito instance = new Credito();
        instance.setMontoEntregado(montoEntregado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCuotas method, of class Credito.
     */
    @Test
    public void testCrearCuotas() {
        System.out.println("crearCuotas");
        int numCuota = 0;
        double monto = 0.0;
        Credito instance = new Credito();
        instance.crearCuotas(numCuota, monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMontoCuota method, of class Credito.
     */
    @Test
    public void testCalcularMontoCuota() {
        System.out.println("calcularMontoCuota");
        double monto = 20000.0;
        int cantidadCuota = 5;
        double interes = 0.05;
        Credito instance = new Credito();
        double expResult = 21000.0;
        double result = instance.calcularMontoCuota(monto, cantidadCuota, interes);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMontoEntregadoCA method, of class Credito.
     */
    @Test
    public void testCalcularMontoEntregadoCA() {
        System.out.println("calcularMontoEntregadoCA");
        double valorCuota = 0.0;
        Credito instance = new Credito();
        instance.calcularMontoEntregadoCA(valorCuota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMontoEntregadoCV method, of class Credito.
     */
    @Test
    public void testCalcularMontoEntregadoCV() {
        System.out.println("calcularMontoEntregadoCV");
        double porAdm = 0.0;
        Credito instance = new Credito();
        instance.calcularMontoEntregadoCV(porAdm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerImpagas method, of class Credito.
     */
    @Test
    public void testObtenerImpagas() {
        System.out.println("obtenerImpagas");
        Credito instance = new Credito();
        List<Cuota> expResult = null;
        List<Cuota> result = instance.obtenerImpagas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCuota method, of class Credito.
     */
    @Test
    public void testBuscarCuota() {
        System.out.println("buscarCuota");
        int idCuota = 0;
        Credito instance = new Credito();
        Cuota expResult = null;
        Cuota result = instance.buscarCuota(idCuota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarEstado method, of class Credito.
     */
    @Test
    public void testComprobarEstado() {
        System.out.println("comprobarEstado");
        Credito instance = new Credito();
        instance.comprobarEstado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
