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
public class Cliente {
    
    private int dni;
    private String nombre;
    private String domicilio;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
    
    //Relaciones
    private List<Credito> creditos = new ArrayList<Credito>();

    public List<Credito> getCreditos() {
        return creditos;
    }

    public void setCreditos(List<Credito> creditos) {
        this.creditos = creditos;
    }
    
    public void agregarCredito(Credito credito){
        creditos.add(credito);
    }
    
    //XDXD
    public List<Cuota> cuotasImpagas(){
        List<Cuota> cuotasImpagas = new ArrayList<Cuota>();;
        for(int i=0; i<creditos.size();i++){
            cuotasImpagas.addAll(creditos.get(i).obtenerImpagas());
        }
        return cuotasImpagas;
    }
    
    public Credito buscarCredito(String idCredito){
        Credito credito = new Credito();
        for(int i=0; i<creditos.size();i++){
            if(creditos.get(i).getIdentificadorCredito()==idCredito){
                credito = creditos.get(i);
                break;
            }
        }
        return credito;
    }
    
    public Cuota buscarCuota(String idCredito,int idCuota){
        Cuota cuota = new Cuota();
        for(int i=0; i<creditos.size();i++){
            if(creditos.get(i).getIdentificadorCredito()==idCredito){
                cuota = creditos.get(i).buscarCuota(idCuota);
                break;
            }
        }
        return cuota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio + ", creditos=" + creditos + '}';
    }
    
}
