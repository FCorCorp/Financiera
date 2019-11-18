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
public class FinancieraTest {
    
    public FinancieraTest() {
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
     * Test of getCuit method, of class Financiera.
     */
    @Test
    public void testGetCuit() {
        System.out.println("getCuit");
        Financiera instance = new Financiera();
        int expResult = 0;
        int result = instance.getCuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuit method, of class Financiera.
     */
    @Test
    public void testSetCuit() {
        System.out.println("setCuit");
        int cuit = 0;
        Financiera instance = new Financiera();
        instance.setCuit(cuit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRazonSocial method, of class Financiera.
     */
    @Test
    public void testGetRazonSocial() {
        System.out.println("getRazonSocial");
        Financiera instance = new Financiera();
        String expResult = "";
        String result = instance.getRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRazonSocial method, of class Financiera.
     */
    @Test
    public void testSetRazonSocial() {
        System.out.println("setRazonSocial");
        String razonSocial = "";
        Financiera instance = new Financiera();
        instance.setRazonSocial(razonSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDeFantasia method, of class Financiera.
     */
    @Test
    public void testGetNombreDeFantasia() {
        System.out.println("getNombreDeFantasia");
        Financiera instance = new Financiera();
        String expResult = "";
        String result = instance.getNombreDeFantasia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreDeFantasia method, of class Financiera.
     */
    @Test
    public void testSetNombreDeFantasia() {
        System.out.println("setNombreDeFantasia");
        String nombreDeFantasia = "";
        Financiera instance = new Financiera();
        instance.setNombreDeFantasia(nombreDeFantasia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDomicilio method, of class Financiera.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Financiera instance = new Financiera();
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDomicilio method, of class Financiera.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Financiera instance = new Financiera();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoMax method, of class Financiera.
     */
    @Test
    public void testGetMontoMax() {
        System.out.println("getMontoMax");
        Financiera instance = new Financiera();
        double expResult = 0.0;
        double result = instance.getMontoMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontoMax method, of class Financiera.
     */
    @Test
    public void testSetMontoMax() {
        System.out.println("setMontoMax");
        double montoMax = 0.0;
        Financiera instance = new Financiera();
        instance.setMontoMax(montoMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcAdministrativo method, of class Financiera.
     */
    @Test
    public void testGetPorcAdministrativo() {
        System.out.println("getPorcAdministrativo");
        Financiera instance = new Financiera();
        double expResult = 0.0;
        double result = instance.getPorcAdministrativo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPorcAdministrativo method, of class Financiera.
     */
    @Test
    public void testSetPorcAdministrativo() {
        System.out.println("setPorcAdministrativo");
        double porcAdministrativo = 0.0;
        Financiera instance = new Financiera();
        instance.setPorcAdministrativo(porcAdministrativo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCuotVenc method, of class Financiera.
     */
    @Test
    public void testGetNumCuotVenc() {
        System.out.println("getNumCuotVenc");
        Financiera instance = new Financiera();
        int expResult = 0;
        int result = instance.getNumCuotVenc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCuotVenc method, of class Financiera.
     */
    @Test
    public void testSetNumCuotVenc() {
        System.out.println("setNumCuotVenc");
        int numCuotActiv = 0;
        Financiera instance = new Financiera();
        instance.setNumCuotVenc(numCuotActiv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumMaxCredActiv method, of class Financiera.
     */
    @Test
    public void testGetNumMaxCredActiv() {
        System.out.println("getNumMaxCredActiv");
        Financiera instance = new Financiera();
        int expResult = 0;
        int result = instance.getNumMaxCredActiv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumMaxCredActiv method, of class Financiera.
     */
    @Test
    public void testSetNumMaxCredActiv() {
        System.out.println("setNumMaxCredActiv");
        int numMaxCredActiv = 0;
        Financiera instance = new Financiera();
        instance.setNumMaxCredActiv(numMaxCredActiv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstados method, of class Financiera.
     */
    @Test
    public void testGetEstados() {
        System.out.println("getEstados");
        Financiera instance = new Financiera();
        List<Estado> expResult = null;
        List<Estado> result = instance.getEstados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstados method, of class Financiera.
     */
    @Test
    public void testSetEstados() {
        System.out.println("setEstados");
        List<Estado> estados = null;
        Financiera instance = new Financiera();
        instance.setEstados(estados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEstado method, of class Financiera.
     */
    @Test
    public void testAgregarEstado() {
        System.out.println("agregarEstado");
        Estado estado = null;
        Financiera instance = new Financiera();
        instance.agregarEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleados method, of class Financiera.
     */
    @Test
    public void testGetEmpleados() {
        System.out.println("getEmpleados");
        Financiera instance = new Financiera();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.getEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpleados method, of class Financiera.
     */
    @Test
    public void testSetEmpleados() {
        System.out.println("setEmpleados");
        List<Empleado> empleados = null;
        Financiera instance = new Financiera();
        instance.setEmpleados(empleados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEmpleado method, of class Financiera.
     */
    @Test
    public void testAgregarEmpleado() {
        System.out.println("agregarEmpleado");
        Empleado empleado = null;
        Financiera instance = new Financiera();
        instance.agregarEmpleado(empleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreditos method, of class Financiera.
     */
    @Test
    public void testGetCreditos() {
        System.out.println("getCreditos");
        Financiera instance = new Financiera();
        List<Credito> expResult = null;
        List<Credito> result = instance.getCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreditos method, of class Financiera.
     */
    @Test
    public void testSetCreditos() {
        System.out.println("setCreditos");
        List<Credito> creditos = null;
        Financiera instance = new Financiera();
        instance.setCreditos(creditos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCredito method, of class Financiera.
     */
    @Test
    public void testAgregarCredito() {
        System.out.println("agregarCredito");
        Credito credito = null;
        Financiera instance = new Financiera();
        instance.agregarCredito(credito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class Financiera.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Financiera instance = new Financiera();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClientes method, of class Financiera.
     */
    @Test
    public void testSetClientes() {
        System.out.println("setClientes");
        List<Cliente> clientes = null;
        Financiera instance = new Financiera();
        instance.setClientes(clientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class Financiera.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        Cliente cliente = null;
        Financiera instance = new Financiera();
        instance.agregarCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanes method, of class Financiera.
     */
    @Test
    public void testGetPlanes() {
        System.out.println("getPlanes");
        Financiera instance = new Financiera();
        List<Plan> expResult = null;
        List<Plan> result = instance.getPlanes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlanes method, of class Financiera.
     */
    @Test
    public void testSetPlanes() {
        System.out.println("setPlanes");
        List<Plan> planes = null;
        Financiera instance = new Financiera();
        instance.setPlanes(planes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPlan method, of class Financiera.
     */
    @Test
    public void testAgregarPlan() {
        System.out.println("agregarPlan");
        Plan plan = null;
        Financiera instance = new Financiera();
        instance.agregarPlan(plan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPlan method, of class Financiera.
     */
    @Test
    public void testBuscarPlan() {
        System.out.println("buscarPlan");
        int idPlan = 0;
        Financiera instance = new Financiera();
        Plan expResult = null;
        Plan result = instance.buscarPlan(idPlan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCliente method, of class Financiera.
     */
    @Test
    public void testObtenerCliente() {
        System.out.println("obtenerCliente");
        int dniCliente = 0;
        Financiera instance = new Financiera();
        Cliente expResult = null;
        Cliente result = instance.obtenerCliente(dniCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Financiera.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Financiera instance = new Financiera();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
