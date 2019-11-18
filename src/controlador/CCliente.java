/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import modelo.Adaptador;
import modelo.Cliente;
import modelo.Credito;
import modelo.Cuota;
import modelo.Financiera;
import modelo.LineaDePago;
import modelo.Pago;
import vista.VAcciones;
import vista.VRegistrarCliente;
import vista.VSolicitarCredito;

/**
 *
 * @author Facundo Cordoba
 */
public class CCliente implements ActionListener {
    
    private Financiera financiera;
    private VRegistrarCliente vistaRegistrar;
    private VSolicitarCredito vistaSolicitarCredito;
    
    public CCliente(Financiera financiera, VRegistrarCliente registrar){
        this.financiera = financiera;
        this.vistaRegistrar = registrar;
        this.vistaRegistrar.btnAceptar.addActionListener(this);
        this.vistaRegistrar.btnSalir.addActionListener(this);
    }
    
    public CCliente(Financiera financiera, VSolicitarCredito vistaSolicitarCredito){
        this.financiera = financiera;
        this.vistaSolicitarCredito = vistaSolicitarCredito;
        this.vistaSolicitarCredito.btnAceptar.addActionListener(this);
        this.vistaSolicitarCredito.btnSalir.addActionListener(this);
        this.vistaSolicitarCredito.btnCancelar.addActionListener(this);
        this.vistaSolicitarCredito.btnBuscar.addActionListener(this);
        //this.vistaSolicitarCredito.campoImporte.addActionListener(this);
        //this.vistaSolicitarCredito.comboxPlan.addActionListener(this);
    }
    
    //ACCIONES DE LOS BOTONES
    public void actionPerformed(ActionEvent e){
        if(vistaRegistrar != null){
            if(e.getActionCommand()== vistaRegistrar.btnAceptar.getActionCommand()){
                
                registrarCliente(vistaRegistrar);
                System.out.println("Boton aceptar registro");
            }
        }
        if(vistaSolicitarCredito != null){
            if(e.getActionCommand()== vistaSolicitarCredito.btnAceptar.getActionCommand()){
                
                System.out.println("Boton aceptar solicitud");
            }
            if(e.getActionCommand()==vistaSolicitarCredito.btnBuscar.getActionCommand()){
                int dni = Integer.parseInt(vistaSolicitarCredito.campoDni.getText());
                
                Cliente cliente = financiera.obtenerCliente(dni);
                
                Adaptador adaptador = new Adaptador();
                List<Integer> estadoCrediticio = adaptador.estadoCliente(financiera.getCuit(), dni);
                
                //buscarDatosCliente(dni, vistaSolicitarCredito);
                cargarDatosCliente(cliente,estadoCrediticio);
                
                CCredito controladorCredito = new CCredito(financiera,cliente,vistaSolicitarCredito);
                
                
            
            }
        
        
        
        }
    }
    
    //VENTANAS A MOSTRAR
    public void iniciarRegistro(){
        vistaRegistrar.setTitle("Registrar Cliente");
        vistaRegistrar.setLocationRelativeTo(null);
        vistaRegistrar.setVisible(true);
    }
    
    public void iniciarSolicitud(){
        vistaSolicitarCredito.setTitle("Solicitar Credito");
        vistaSolicitarCredito.setLocationRelativeTo(null);
        vistaSolicitarCredito.setVisible(true);
    }
    
    //OPERACIONES CON LA VISTA
    
    
    
    
    
    
    //DAR DE ALTA UN CLIENTE
    public void registrarCliente(VRegistrarCliente vista){
        Cliente cliente = new Cliente();
        cliente.setDni(Integer.parseInt(vistaRegistrar.campoDni.getText()));
        cliente.setNombre(vistaRegistrar.campoNombre.getText());
        cliente.setDomicilio(vistaRegistrar.campoDireccion.getText());
        financiera.agregarCliente(cliente);
    }
    
    public void cargarDatosCliente(Cliente cliente, List<Integer> estadoCrediticio){
        vistaSolicitarCredito.campoNombre.setText(cliente.getNombre());
        vistaSolicitarCredito.campoCreditosActivos.setText(Integer.toString(estadoCrediticio.get(0)));
        if(estadoCrediticio.get(1)==2){
            vistaSolicitarCredito.campoDeudas.setText("No");
        }
        else{
            vistaSolicitarCredito.campoDeudas.setText("Si");
        }
    }
    
    public void iniciarCredito(){}
    
    
    
    /* FUNCION INUTIL
    public void buscarCreditosCliente(int dni){
        Cliente cliente = financiera.obtenerCliente(dni);
    }
    */
    /*public void pagarCuotas(double total, String concepto, int dniCliente){
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
    */
}
