/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Credito {
    
    private String identificadorCredito;
    private DateFormat fechaCreacion;
    private DateFormat fechaFinalizacion;
    private double montoSolicitado;
    private double interes;
    private double montoEntregado;

    public Credito() {
    }
    
    public Credito(String identificadorCredito, DateFormat fechaCreacion, DateFormat fechaFinalizacion, double montoSolicitado, double interes, double montoEntregado) {
        this.identificadorCredito = identificadorCredito;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.montoSolicitado = montoSolicitado;
        this.interes = interes;
        this.montoEntregado = montoEntregado;
    }

    public String getIdentificadorCredito() {
        return identificadorCredito;
    }

    public void setIdentificadorCredito(String identificadorCredito) {
        this.identificadorCredito = identificadorCredito;
    }

    public DateFormat getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(DateFormat fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public DateFormat getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(DateFormat fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }
    
    //Relaciones
    private Financiera financiera;
    private Estado estado;
    private Empleado empleado;
    //private Comprobante comprobante;
    private List<Cuota> cuotas = new ArrayList<Cuota>();
    private Cliente cliente;
    private Plan plan;
    
    //metodos
    public void crearCuotas(int numCuota, double monto){}
    
    
    //XDXD
    
    public Credito(double monto, Plan plan){
        this.montoSolicitado=monto;
        this.plan = plan;
        this.interes=plan.calcularInteres(monto);
        
        //2.3
        double montoCuota = calcularMontoCuota(this.montoSolicitado,plan.getCantCuotas(),this.interes);
        //2.4 - 2.5 - 2.6
        for(int i=0;i<plan.getCantCuotas();i++){
            Cuota cuota = new Cuota(montoCuota);
            cuotas.add(cuota);
        }
        //2.7 - 2.7.1
        boolean cA = plan.isCuotaAdelantada();
        
        //2.8a - 2.8b - 2.8b.1
        if(cA==true){
            calcularMontoEntregadoCA(montoCuota);
        }
        else{
            double porAdm=financiera.getPorcAdministrativo();
            
            
        }
    }
    
    public double calcularMontoCuota(double monto, int cantidadCuota, double interes){
        return (monto+interes)/cantidadCuota;
    }
    
    public void calcularMontoEntregadoCA(double valorCuota){
        montoEntregado = montoSolicitado+interes-valorCuota;
    }
    public void calcularMontoEntregadoCV(double porAdm){
        montoEntregado = montoSolicitado - montoSolicitado*(porAdm/100);
    }
    
    public List<Cuota> obtenerImpagas(){
        List<Cuota> impaga = new ArrayList<Cuota>();;
        for(int i=0; i<cuotas.size();i++){
            if(cuotas.get(i).getSaldo()!= 0){
                impaga.add(cuotas.get(i));
            }
        }
        return impaga;
    }
    
    public Cuota buscarCuota(int idCuota){
        Cuota cuota = new Cuota();
        
        for(int i=0; i< cuotas.size();i++){
            if(cuotas.get(i).getNumero()==idCuota){
                cuota=cuotas.get(i);
                break;
            }
        }
        return cuota;
    }
    
    public void comprobarEstado(){
        Adaptador adaptador = new Adaptador();
        double total=0;
        for(int i=0; i<cuotas.size();i++){
            total = total + cuotas.get(i).getSaldo();
        }
        if(total==0){
            adaptador.finalizarCredito(financiera.getCuit(), cliente.getDni(), identificadorCredito);
        }
    }
    
    
    
    
}
