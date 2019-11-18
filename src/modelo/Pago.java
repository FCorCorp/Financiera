/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facundo Cordoba
 */
public class Pago {
    
    private int numero;
    private String concepto;
    private LocalDate fecha;
    private double total;

    public Pago() {
    }

    public Pago(int numero, String concepto, LocalDate fecha, double total) {
        this.numero = numero;
        this.concepto = concepto;
        this.fecha = fecha;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    //Relaciones
    private Empleado empleado;
    private Recibo recibo;
    private List<LineaDePago> lineasPago = new ArrayList<LineaDePago>();
}
