/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Credito;
import modelo.Financiera;
import modelo.Plan;

/**
 *
 * @author Facundo Cordoba
 */
public class CCredito {
    private Financiera financiera;
    
    public void solicitarCredito(int monto, int codPlan){
        Plan plan = financiera.buscarPlan(codPlan);
        Credito credito = new Credito(monto, plan);
        
    }
    
}
