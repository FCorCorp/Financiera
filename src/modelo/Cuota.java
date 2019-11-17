/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Cuota {
    
    private int numero;
    private DateFormat fechaVenc;
    private double monto;
    private double saldo;

    public Cuota() {
    }

    public Cuota(int numero, DateFormat fechaVenc, double monto, double saldo) {
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

    public DateFormat getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(DateFormat fechaVenc) {
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
    
    public Cuota(double montoCuota){
        this.monto=montoCuota;
        this.saldo=montoCuota;
    }
    
    public void actualizarSaldo(double saldoNuevo){
        saldo = saldoNuevo;
    }
}
