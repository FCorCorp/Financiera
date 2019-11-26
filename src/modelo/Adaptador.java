/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Adaptador {
    
    private List<Integer> respuesta = new ArrayList<Integer>();

    public Adaptador() {
    }
    
    public List<Integer> estadoCliente(int codigoFinanciera,int dni){
        respuesta.add(2);
        respuesta.add(2);
        return respuesta;
    }
    
    public String informarCredito(int codigoFinanciera, int dni, String identificadorCredito, double montoOtorgado){
        return "Credito INFORMADO";
    }
    public String finalizarCredito(int codigoFinanciera, int dni, String identificadorCredito){
        
        return "Credito FINALIZADO";
    }
    
    
}
