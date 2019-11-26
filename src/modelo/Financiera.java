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
public class Financiera {
    
    private int cuit;
    private String razonSocial;
    private String nombreDeFantasia;
    private String domicilio;
    private double montoMax;
    private double porcAdministrativo;
    private int numCuotVenc;
    private int numMaxCredActiv;
    
    public Financiera() {
    }

    public Financiera(int cuit, String razonSocial, String nombreDeFantasia, String domicilio, double montoMax, double porcAdministrativo, int numCuotVenc, int numMaxCredActiv) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.nombreDeFantasia = nombreDeFantasia;
        this.domicilio = domicilio;
        this.montoMax = montoMax;
        this.porcAdministrativo = porcAdministrativo;
        this.numCuotVenc = numCuotVenc;
        this.numMaxCredActiv = numMaxCredActiv;
    }
    
    //GETTER AND SETTER

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreDeFantasia() {
        return nombreDeFantasia;
    }

    public void setNombreDeFantasia(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getMontoMax() {
        return montoMax;
    }

    public void setMontoMax(double montoMax) {
        this.montoMax = montoMax;
    }

    public double getPorcAdministrativo() {
        return porcAdministrativo;
    }

    public void setPorcAdministrativo(double porcAdministrativo) {
        this.porcAdministrativo = porcAdministrativo;
    }

    public int getNumCuotVenc() {
        return numCuotVenc;
    }

    public void setNumCuotVenc(int numCuotActiv) {
        this.numCuotVenc = numCuotVenc;
    }

    public int getNumMaxCredActiv() {
        return numMaxCredActiv;
    }

    public void setNumMaxCredActiv(int numMaxCredActiv) {
        this.numMaxCredActiv = numMaxCredActiv;
    }
    
    //RELACIONES
    private List<Empleado> empleados = new ArrayList<Empleado>();
    
    private List<Credito> creditos = new ArrayList<Credito>();
    
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    private List<Plan> planes = new ArrayList<Plan>();
    
    private List<Estado> estados = new ArrayList<Estado>();

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
       this.estados = estados;
    }
    
    public void agregarEstado(Estado estado){
        estados.add(estado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Credito> getCreditos() {
        return creditos;
    }

    public void setCreditos(List<Credito> creditos) {
        this.creditos = creditos;
    }
    
    public void agregarCredito(Credito credito){
        creditos.add(credito);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plan> planes) {
        this.planes = planes;
    }
    
    public void agregarPlan(Plan plan){
        planes.add(plan);
    }
    
    //MÉTODOS
    
    public Plan buscarPlan(int idPlan){
        Plan planEncontrado = new Plan();
        for(int i=0;i<planes.size();i++){
            if(planes.get(i).getNumero()==idPlan){
                planEncontrado = planes.get(i);
                i=planes.size()+1;
            }
        }
        return planEncontrado;
    }
    
    public Cliente obtenerCliente(int dniCliente){
        Cliente clienteEncontrado = new Cliente();
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getDni()==dniCliente){
                clienteEncontrado = clientes.get(i);
                i=clientes.size()+1;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public String toString() {
        return "Financiera{" + "clientes=" + clientes + '}';
    }

    
    
    
    
    
}
