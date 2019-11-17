/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;

/**
 *
 * @author Facundo Cordoba
 */
public class Comprobante {
    
    private DateFormat fecha;
    private String descripcion;

    public Comprobante() {
    }

    public Comprobante(DateFormat fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public DateFormat getFecha() {
        return fecha;
    }

    public void setFecha(DateFormat fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Relaciones
    private Credito credito;
    
}
