/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Adaptador;
import modelo.Cliente;
import modelo.Credito;
import modelo.Cuota;
import modelo.Financiera;
import modelo.LineaDePago;
import modelo.Pago;

/**
 *
 * @author Facundo Cordoba
 */
public class CCliente {
    
    private Financiera financiera;
    
    public CCliente(Financiera financiera){
        this.financiera=financiera;
    }
    
    public void registrarCliente(Cliente cliente){
        financiera.agregarCliente(cliente);
    }
    
    public void consultarDatosCliente(int dni){
        Adaptador adaptador = new Adaptador();
        List<Integer> estadoCrediticio = adaptador.estadoCliente(financiera.getCuit(), dni); //ES UNA FUNCION SIN TIPO, HACERLA CON TIPO Y DEVOLVER UNA CADENA DE VALORES DEL ESTADO DEL CLIENTE
        
        Cliente cliente = financiera.obtenerCliente(dni);
    }
    
    public void buscarCreditosCliente(int dni){
        Cliente cliente = financiera.obtenerCliente(dni);
    }
    
    public void pagarCuotas(double total, String concepto, int dniCliente){
        Pago pago = new Pago();
        pago.getNumero();
        
        Cliente cliente = financiera.obtenerCliente(dniCliente);
        
        List<LineaDePago> lineasDePago = null;
        
        while(listaDeLaVistaTengaElementosAPagar){
            String idCredito = obtenerIdCreditoDeCuota();
            
            int idCuota = obtenerIdCuotaAPagar();
            
            Cuota cuota = cliente.buscarCuota(idCredito,idCuota);
            
            double monto = obtenerMontoAPagarDeCuota();
            
            LineaDePago lineaDePago = new LineaDePago(cuota,pago,monto);
            
            lineasDePago.add(lineaDePago);
            
            double total = obtenerTotalDeCuota();
            cuota.actualizarSaldo(total-monto);
            
            Credito credito =  cliente.buscarCredito(idCredito);
            credito.comprobarEstado();
        }
        
        
        
        
        
        
        
    }
}
