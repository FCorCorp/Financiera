/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Financiera;
import vista.VAcciones;
import vista.VRegistrarCliente;
import vista.VSolicitarCredito;

/**
 *
 * @author Facundo Cordoba
 */
public class CPrincipal implements ActionListener{
    
    private VAcciones vistaAcciones;
    private Financiera financiera;
    
    public CPrincipal(VAcciones vista, Financiera financiera){
        this.vistaAcciones = vista;
        this.financiera = financiera;
        this.vistaAcciones.btnRegistrar.addActionListener(this);
        this.vistaAcciones.btnCrear.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()==vistaAcciones.btnRegistrar.getActionCommand()){
            VRegistrarCliente vista = new VRegistrarCliente();
            CCliente controladorCliente = new CCliente(financiera, vista);
            vistaAcciones.setVisible(false);
            controladorCliente.iniciarRegistro();
        }
        
        if(e.getActionCommand()==vistaAcciones.btnCrear.getActionCommand()){
            VSolicitarCredito vista = new VSolicitarCredito();
            CCliente controladorCliente = new CCliente(financiera, vista);
            vistaAcciones.setVisible(false);
            controladorCliente.iniciarSolicitud();
        }
        
    }
    
    public void iniciar(){
        vistaAcciones.setTitle("Opciones");
        vistaAcciones.setLocationRelativeTo(null);
    }
    
    
}
