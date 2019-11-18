/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Credito {
    
    private String identificadorCredito;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private double montoSolicitado;
    private double interes;
    private double montoEntregado;

    public Credito() {
    }
    
    public Credito(String identificadorCredito, LocalDate fechaCreacion, LocalDate fechaFinalizacion, double montoSolicitado, double interes, double montoEntregado) {
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
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

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    
    
    
    
    //metodos
    
    //XDXD
    public Credito(double monto, Plan plan, String identificadorCredito, Financiera financiera, Cliente cliente, Estado estado){
        this.identificadorCredito = identificadorCredito;
        this.montoSolicitado=monto;
        this.plan = plan;
        this.interes=plan.calcularInteres(monto);
        this.fechaCreacion=LocalDate.now();
        this.financiera=financiera;
        this.cliente=cliente;
        this.estado=estado;
        
        //2.3
        double montoCuota = calcularMontoCuota(this.montoSolicitado,plan.getCantCuotas(),this.interes);
        
        //creacion de cuotas
        
        //2.4 - 2.5 - 2.6
        LocalDate fecha = LocalDate.now().withDayOfMonth(10);
        for(int i=0;i<plan.getCantCuotas();i++){
            fecha.plusMonths(i);
            Cuota cuota = new Cuota(montoCuota, i+1, fecha, this);
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
            calcularMontoEntregadoCV(porAdm, interes);
        }
        
        
    }
    
    public double calcularMontoCuota(double monto, int cantidadCuota, double interes){
        return (monto+interes)/cantidadCuota;
    }
    
    public void calcularMontoEntregadoCA(double valorCuota){
        montoEntregado = montoSolicitado-valorCuota;
    }
    public void calcularMontoEntregadoCV(double porAdm, double interes){
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

    @Override
    public String toString() {
        return "Credito{" + "identificadorCredito=" + identificadorCredito + ", fechaCreacion=" + fechaCreacion + ", fechaFinalizacion=" + fechaFinalizacion + ", montoSolicitado=" + montoSolicitado + ", interes=" + interes + ", montoEntregado=" + montoEntregado + '}';
    }
    
    

    
    
}
