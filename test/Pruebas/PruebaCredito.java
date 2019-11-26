/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import modelo.*;
import controlador.*;
import java.time.LocalDate;
import vista.*;

/**
 *
 * @author Dru_a
 */
public class PruebaCredito {
    
   
    
    static Financiera financiera;
    static Cliente clientePrueba;
    static Credito creditoPrueba;
    static double montoSolicitado=10000;
    static Plan planPrueba;
    @BeforeClass
    public static void setUpClass() {
        
     financiera=new Financiera();
     clientePrueba=new Cliente(36584642,"Eduardo Gomez","Avenida Solano Vera");
     financiera.agregarCliente(clientePrueba);
     creditoPrueba=new Credito();
     planPrueba = new Plan(1234, "Plan cuota adelantada", 3, 5, 2, true);

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

    
    @Test
     public void pruebaParaBuscarClienteYaRegistrado()  {
      
     Cliente clienteEsperado = clientePrueba;
     Cliente clienteResultado=financiera.obtenerCliente(36584642);
     
        assertEquals(clienteEsperado, clienteResultado);

     }
     
     
     @Test
     public void pruebaParaCalcularMontoCuota()
     { 
         
         double montoCuotaEsperado = 3833.33 ;
         double montoCuotaResultado =creditoPrueba.calcularMontoCuota(montoSolicitado, 3, 1500);
         
         assertEquals(montoCuotaEsperado, montoCuotaResultado, 0.50);
         
     }
     
     @Test
       public void pruebaParaCalcularMontoAEntregarConPlanDeCuotaAdelantada()
        {
          double montoEntregadoEsperado = 6166.67; 
          creditoPrueba.setMontoSolicitado(montoSolicitado);
          
          double montoEntregadoResultado = creditoPrueba.calcularMontoEntregadoCA(3833.33);
          
            assertEquals(montoEntregadoEsperado, montoEntregadoResultado, 0.50);
        }
             
     @Test 
     public void pruebaParaCalcularInteresDelCredito()
     {
         double interesEsperado = 1500;
        double interesResultado = planPrueba.calcularInteres(montoSolicitado);
         
         assertEquals(interesEsperado, interesEsperado, montoSolicitado);
     }
       
     @Test
     public void pruebaParaCalcularMontoAEntregarConPlanDeCuotaVencida()
      {
          double montoEntregadoEsperado=9800;
          creditoPrueba.setMontoSolicitado(montoSolicitado);
          
          double montoEntregadoResultado= creditoPrueba.calcularMontoEntregadoCV(planPrueba.getPorcAdministrativo(), 1500);
          
          assertEquals(montoEntregadoEsperado, montoEntregadoResultado, 0.5);
      }
       
       
       
       
      /*    @Test 
     public void pruebaParaBuscarCredito()//terminar
     {
         Financiera financiera=new Financiera();
         Cliente clientePrueba=new Cliente(36584642,"Eduardo Gomez","Avenida Solano Vera");
         VSolicitarCredito vistaSolicitarCredito=new VSolicitarCredito();   
         financiera.agregarCliente(clientePrueba);
         CCredito controladorCredito=new CCredito(financiera,clientePrueba,vistaSolicitarCredito);
         Plan planPrueba = new Plan(001, "Plan cuota adelantada", 3, 10, 0, true);
         Estado estadoPrueba=new Estado ("Activo","");
         Credito creditoPrueba=new Credito(10000, planPrueba, null, financiera, clientePrueba,estadoPrueba );
         
         clientePrueba.agregarCredito(creditoPrueba);
         
     }*/
}
