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
public class AdaptadorTest {
    
    public AdaptadorTest() {
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
     * Test of estadoCliente method, of class Adaptador.
     */
    @Test
    public void testEstadoCliente() {
        System.out.println("estadoCliente");
        int codigoFinanciera = 454545;
        int dni = 555555555;
        Adaptador instance = new Adaptador();
        List<Integer> expResult = null;
        List<Integer> result = instance.estadoCliente(codigoFinanciera, dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of informarCredito method, of class Adaptador.
     */
    @Test
    public void testInformarCredito() {
        System.out.println("informarCredito");
        int codigoFinanciera = 54565454;
        int dni = 54545454;
        String identificadorCredito = "identificador";
        double montoOtorgado = 20000.00;
        Adaptador instance = new Adaptador();
        String expResult = "Credito informado";
        String result = instance.informarCredito(codigoFinanciera, dni, identificadorCredito, montoOtorgado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizarCredito method, of class Adaptador.
     */
    @Test
    public void testFinalizarCredito() {
        System.out.println("finalizarCredito");
        int codigoFinanciera = 455454;
        int dni = 545454;
        String identificadorCredito = "identificado";
        Adaptador instance = new Adaptador();
        String expResult = "Credito finalizado";
        String result = instance.finalizarCredito(codigoFinanciera, dni, identificadorCredito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
