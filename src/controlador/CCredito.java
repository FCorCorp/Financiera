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
    
    public CCredito(Financiera financiera, Cliente cliente, VSolicitarCredito vistaSolicitarCredito){
        this.financiera=financiera;
        this.cliente=cliente;
        this.vistaSolicitarCredito=vistaSolicitarCredito;
        this.vistaSolicitarCredito.comboxPlan.addActionListener(this);
        this.vistaSolicitarCredito.btnCalcular.addActionListener(this);
        
        //Cargar planes en la vista
        cargarPlanes();
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        //Cargar Alicuota
        if(e.getActionCommand()==vistaSolicitarCredito.comboxPlan.getActionCommand()){
            cargarAlicuota(vistaSolicitarCredito.comboxPlan.getSelectedIndex());
        }
        
        //Calcular cuotas
        if(e.getActionCommand()==vistaSolicitarCredito.btnCalcular.getActionCommand()){
            if(vistaSolicitarCredito.campoImporte!=null){
                Plan plan = financiera.getPlanes().get(vistaSolicitarCredito.comboxPlan.getSelectedIndex());
                double importe = Double.parseDouble(vistaSolicitarCredito.campoImporte.getText());

                double montoCuota = calcularCuotas(plan.getCantCuotas(),plan.getPorcMensual(),importe);
                llenarTabla(plan,montoCuota,importe);
            }
        
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
            vistaSolicitarCredito.campoAlicuota.setText(Double.toString(financiera.getPlanes().get(indice).getPorcMensual()));
        }
    }
    
    public double calcularCuotas(int numCuotas, double alicuota,double importe){
        double montoCuota = (1+(alicuota*(double)numCuotas/100))*importe/numCuotas;
        return montoCuota;
    }
    
    public void llenarTabla(Plan plan, double montoCuotas, double importe){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Numero de Cuota");
        model.addColumn("Importe");
        model.addColumn("Vencimiento");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("10/MM/yyyy");  
        LocalDateTime now = LocalDateTime.now();
        
        
        for(int i=0; i<plan.getCantCuotas(); i++){
            model.addRow(new Object[]{i+1,montoCuotas,dtf.format(now.plusMonths(i+1))});
        }
        
        vistaSolicitarCredito.tableCuotas.setModel(model);
        vistaSolicitarCredito.campoInteres.setText(Double.toString(plan.getPorcMensual()*(double)plan.getCantCuotas())+"%");
        vistaSolicitarCredito.campoTotal.setText(Double.toString(montoCuotas*(double)plan.getCantCuotas()));
        if(plan.isCuotaAdelantada()==true){
            vistaSolicitarCredito.campoEntregar.setText(Double.toString(importe-montoCuotas));
        }
        else{
            vistaSolicitarCredito.campoEntregar.setText(Double.toString(importe - (importe*(plan.getPorcAdministrativo())/100)));
        }
        vistaSolicitarCredito.campoAdministrativo.setText(Double.toString(plan.getPorcAdministrativo())+"%");
    }
    
    
    /*public void solicitarCredito(int monto, int codPlan){
        Plan plan = financiera.buscarPlan(codPlan);
        Credito credito = new Credito(monto, plan);
        
    }
    */
    
    
}
