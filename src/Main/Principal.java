/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controlador.CPrincipal;
import modelo.*;
import vista.VAcciones;

/**
 *
 * @author Facundo Cordoba
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Financiera financiera = new Financiera();
        financiera.setCuit(2019);
        financiera.setNombreDeFantasia("Empresa6");
        financiera.setRazonSocial("75263b76-71fc-4d0e-b5e6-7daa8e947319");
        financiera.setDomicilio("Rivadavia 1050");
        financiera.setMontoMax(100000.00);
        financiera.setPorcAdministrativo(2);
        financiera.setNumCuotVenc(2);
        financiera.setNumMaxCredActiv(3);
        
        //agregar empleados
        financiera.agregarEmpleado(new Empleado(4001,"Alfa","Calle 1",155000001,12000.50));
        financiera.agregarEmpleado(new Empleado(4002,"Beta","Calle 2",155000002,13000.00));
        financiera.agregarEmpleado(new Empleado(4003,"Gamma","Calle 3",155000003,14000));

        //Clientes
        //financiera.agregarCliente(new Cliente(33000010,"Mario Bross","MushroomsKingdom"));
        //financiera.agregarCliente(new Cliente(33000020,"Sonic el Erizo","Green Hill"));
        //financiera.agregarCliente(new Cliente(33000030,"Roberto Perez","Ciudad de Juarez"));
        Cliente clienteA = new Cliente(33000010,"Mario Bross","MushroomsKingdom");
        Cliente clienteB = new Cliente(33000020,"Sonic el Erizo","Green Hill");
        Cliente clienteC = new Cliente(33000030,"Roberto Perez","Ciudad de Juarez");
        financiera.agregarCliente(clienteA);
        financiera.agregarCliente(clienteB);
        financiera.agregarCliente(clienteC);
        
        
        //Planes de pago
        
        Plan cuot3Ad = new Plan();
        cuot3Ad.setNumero(1031);
        cuot3Ad.setDescripcion("plan de 3 cuotas con pago adelantado");
        cuot3Ad.setCantCuotas(3);
        cuot3Ad.setPorcMensual(10);
        cuot3Ad.setPorcAdministrativo(0);
        cuot3Ad.setCuotaAdelantada(true);
        
        Plan cuot3Venc = new Plan();
        cuot3Venc.setNumero(1032);
        cuot3Venc.setDescripcion("plan de 3 cuotas con primera cuota vencida");
        cuot3Venc.setCantCuotas(3);
        cuot3Venc.setPorcMensual(10);
        cuot3Venc.setPorcAdministrativo(2);
        cuot3Venc.setCuotaAdelantada(false);
        
        Plan cuot8Ad = new Plan();
        cuot8Ad.setNumero(1081);
        cuot8Ad.setDescripcion("plan de 8 cuotas con pago adelantado");
        cuot8Ad.setCantCuotas(8);
        cuot8Ad.setPorcMensual(5);
        cuot8Ad.setPorcAdministrativo(0);
        cuot8Ad.setCuotaAdelantada(true);
        
        Plan cuot8Venc = new Plan();
        cuot8Venc.setNumero(1082);
        cuot8Venc.setDescripcion("plan de 8 cuotas con primera cuota vencida");
        cuot8Venc.setCantCuotas(8);
        cuot8Venc.setPorcMensual(5);
        cuot8Venc.setPorcAdministrativo(2);
        cuot8Venc.setCuotaAdelantada(false);
        
        financiera.agregarPlan(cuot3Ad);
        financiera.agregarPlan(cuot3Venc);
        financiera.agregarPlan(cuot8Ad);
        financiera.agregarPlan(cuot8Venc);
        
        //Estados del credito
        Estado activo = new Estado();
        activo.setNombre("activo");
        activo.setDescripcion("El credito esta activo en el sistema online");
        
        Estado pendiente = new Estado();
        pendiente.setNombre("pendiente");
        pendiente.setDescripcion("Falta validar el credito en el sistema online");
        
        Estado moroso = new Estado();
        moroso.setNombre("moroso");
        moroso.setDescripcion("El credito posee cuotas vencidas");
        
        Estado pendienteFinalizacion = new Estado();
        pendienteFinalizacion.setNombre("pendienteFinalizacion");
        pendienteFinalizacion.setDescripcion("Falta validar la finalizacion en el sistema online");
        
        Estado finalizado = new Estado();
        finalizado.setNombre("finalizado");
        finalizado.setDescripcion("El credito esta finalizado y validado en el sistema online");
        
        financiera.agregarEstado(activo);
        financiera.agregarEstado(pendiente);
        financiera.agregarEstado(moroso);
        financiera.agregarEstado(pendienteFinalizacion);
        financiera.agregarEstado(finalizado);
        
        VAcciones vista = new VAcciones();
        CPrincipal principal = new CPrincipal(vista, financiera);
        principal.iniciar();
        vista.setVisible(true);
    }
    
}
