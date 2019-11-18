/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Credito;
import modelo.Estado;
import modelo.Financiera;
import modelo.Plan;
import vista.VSolicitarCredito;

/**
 *
 * @author Facundo Cordoba
 */
public class CCredito implements ActionListener {
    private Financiera financiera;
    private Cliente cliente;
    private VSolicitarCredito vistaSolicitarCredito;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    public CCredito(Financiera financiera, Cliente cliente, VSolicitarCredito vistaSolicitarCredito){
        this.financiera=financiera;
        this.cliente=cliente;
        this.vistaSolicitarCredito=vistaSolicitarCredito;
        this.vistaSolicitarCredito.comboxPlan.addActionListener(this);
        this.vistaSolicitarCredito.btnCalcular.addActionListener(this);
        this.vistaSolicitarCredito.btnAceptar.addActionListener(this);
        
        //Cargar planes en la vista
        cargarPlanes();
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        //Cargar Alicuota cuando se cambie el plan
        if(e.getActionCommand()==vistaSolicitarCredito.comboxPlan.getActionCommand()){
            cargarAlicuota(vistaSolicitarCredito.comboxPlan.getSelectedIndex());
        }
        
        //Llenar datos de cuotas y resto de campos en pantalla
        if(e.getActionCommand()==vistaSolicitarCredito.btnCalcular.getActionCommand()){
            
            if(vistaSolicitarCredito.campoImporte!=null){
                Plan plan = financiera.getPlanes().get(vistaSolicitarCredito.comboxPlan.getSelectedIndex());
                double importe = Double.parseDouble(vistaSolicitarCredito.campoImporte.getText());
                double montoCuota = calcularMontoCuotas(plan.getCantCuotas(),plan.getPorcMensual(),importe);
                
                llenarVista(plan,montoCuota,importe);
            }
        
        }
        
        if(e.getActionCommand()==vistaSolicitarCredito.btnAceptar.getActionCommand()){
            Plan plan = financiera.getPlanes().get(vistaSolicitarCredito.comboxPlan.getSelectedIndex());
            int numeroCredito = cliente.getCreditos().size();
            Estado estado = financiera.getEstados().get(0); //ESTADO ACTIVO, falta confirmacion con el servicio externo
            Credito credito = new Credito(Double.parseDouble(vistaSolicitarCredito.campoImporte.getText()), plan, Integer.toString(numeroCredito+1), financiera, cliente, estado);
            cliente.agregarCredito(credito);
            System.out.println(credito.getCuotas().get(1));
        }
    }
    
    
    //METODOS
    public void cargarPlanes(){
        vistaSolicitarCredito.comboxPlan.removeAllItems();
        for(int i=0; i<financiera.getPlanes().size();i++){
            vistaSolicitarCredito.comboxPlan.addItem(financiera.getPlanes().get(i).getDescripcion());
        }
    }
    
    public void cargarAlicuota(int indice){
        if(indice>=0){
            vistaSolicitarCredito.campoAlicuota.setText(Double.toString(financiera.getPlanes().get(indice).getPorcMensual())+"%");
        }
    }
    
    public double calcularMontoCuotas(int numCuotas, double alicuota,double importe){
        double montoCuota = (1+(alicuota*numCuotas/100))*importe/numCuotas;
        return montoCuota;
    }
    
    public void llenarVista(Plan plan, double montoCuotas, double importe){
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Numero de Cuota");
        model.addColumn("Importe");
        model.addColumn("Vencimiento");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDateTime now = LocalDateTime.now().withDayOfMonth(10);
        
        for(int i=0; i<plan.getCantCuotas(); i++){
            model.addRow(new Object[]{i+1,montoCuotas,dtf.format(now.plusMonths(i+1))});
        }
        
        vistaSolicitarCredito.tableCuotas.setModel(model);
        double interesPorc = plan.getCantCuotas()*plan.getPorcMensual();
        vistaSolicitarCredito.campoInteres.setText(Double.toString(interesPorc)+"%");
        double totalAPagar = importe*(1+(interesPorc/100));
        vistaSolicitarCredito.campoTotal.setText(Double.toString(totalAPagar));
        if(plan.isCuotaAdelantada()==true){
            vistaSolicitarCredito.campoEntregar.setText(Double.toString(importe-montoCuotas));
        }
        else{
            vistaSolicitarCredito.campoEntregar.setText(Double.toString(importe - (importe*(plan.getPorcAdministrativo())/100)));
        }
        vistaSolicitarCredito.campoAdministrativo.setText(Double.toString(plan.getPorcAdministrativo())+"%");
    }
    
}
