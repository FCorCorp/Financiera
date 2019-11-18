/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Cuota {
    
    private int numero;
    private LocalDate fechaVenc;
    private double monto;
    private double saldo;

    public Cuota() {
    }

    public Cuota(int numero, LocalDate fechaVenc, double monto, double saldo) {
        this.numero = numero;
        this.fechaVenc = fechaVenc;
        this.monto = monto;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Relaciones
    private Credito credito;
    private List<LineaDePago> lineasPagos = new ArrayList<LineaDePago>();
    
    
    //XDXD
    
    public Cuota(double montoCuota,int numero, LocalDate fecha, Credito credito){
        this.monto=montoCuota;
        this.saldo=montoCuota;
        this.numero=numero;
        this.fechaVenc=fecha;
        this.credito=credito;
    }
    
    public void actualizarSaldo(double saldoNuevo){
        saldo = saldoNuevo;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numero=" + numero + ", fechaVenc=" + fechaVenc + ", monto=" + monto + ", saldo=" + saldo + ", credito=" + credito + ", lineasPagos=" + lineasPagos + '}';
    }

    
    
    


    
    
    
    
    
    
}
