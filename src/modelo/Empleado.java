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
public class Empleado {
    
    private int legajo;
    private String nombre;
    private String domicilio;
    private int telefono;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, String domicilio, int telefono, double sueldo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    //Relaciones
    private Financiera financiera;
    private List<Credito> creditos = new ArrayList<Credito>();
    private List<Pago> pagos = new ArrayList<Pago>();
}
