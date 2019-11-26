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
public class Plan {
    
    private int numero;
    private String descripcion;
    private int cantCuotas;
    private double porcMensual;
    private double porcAdministrativo;
    private boolean cuotaAdelantada;

    public Plan() {
    }

    public Plan(int numero, String descripcion, int cantCuotas, double porcMensual, double porcAdministrativo, boolean cuotaAdelantada) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantCuotas = cantCuotas;
        this.porcMensual = porcMensual;
        this.porcAdministrativo = porcAdministrativo;
        this.cuotaAdelantada = cuotaAdelantada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getPorcMensual() {
        return porcMensual;
    }

    public void setPorcMensual(double porcMensual) {
        this.porcMensual = porcMensual;
    }

    public double getPorcAdministrativo() {
        return porcAdministrativo;
    }

    public void setPorcAdministrativo(double porcAdministrativo) {
        this.porcAdministrativo = porcAdministrativo;
    }

    public boolean isCuotaAdelantada() {
        return cuotaAdelantada;
    }

    public void setCuotaAdelantada(boolean cuotaAdelantada) {
        this.cuotaAdelantada = cuotaAdelantada;
    }
    
    //Relaciones
    private List<Credito> creditos = new ArrayList<Credito>();
    
    
    //XDXD
    
   public double obtenerInteres(double monto){
        return calcularInteres(monto);
    }
    
   public double calcularInteres(double monto){
        return monto*(this.porcMensual*this.cantCuotas)/100;
    }
    
}
