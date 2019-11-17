/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Facundo Cordoba
 */
public class LineaDePago {
    
    private int numero;
    private double monto;

    public LineaDePago() {
    }

    public LineaDePago(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    //Relaciones
    private Pago pago;
    private Cuota cuota;
    
    //XDXD
    
    public LineaDePago(Cuota cuota, Pago pago, double monto){
        this.cuota=cuota;
        this.pago=pago;
        this.monto=monto;
    }
    
}
