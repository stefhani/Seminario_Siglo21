/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4seminario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author TEFHI
 */


public class ControlSolicitudes {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Poliza> polizas;
    private ArrayList<Solicitud> solicitudes;
    
    public ControlSolicitudes() {
        //Iniciar las listas
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
        this.polizas = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
    
    }
    

    
    public void iniciarDatos() {

        //Clientes
         Cliente cliente1 = new Cliente("kevin", "McStone", "11898237484", "av.San justo 234, Bs As", "SOLTERO","Arg");
        clientes.add(cliente1);
        //Polizas
        Poliza poliza1 = new Poliza(999,"Seguro de vida", "Seguro atencion medica 24hs", 30000, new Date(), "ACTIVA", "ARG", 202, "ACTIVIDO", 500000);
        Poliza poliza2 = new Poliza(999,"Seguro ante robo celular", "Seguro para el cambio de dispo.", 2000, new Date(), "NO ACTIVA", "ARG", 202, "ACTIVIDO", 500000);
        //Cuenta bancarias
        polizas.add(poliza1);
        polizas.add(poliza2);
        cliente1.setListPolizas(polizas);
       
    }
    
    
    public void mostrarDatos() {
        //Mostrar los clientes
       System.out.println("______________Clientes: _____________");
       for (Cliente cli : clientes) {
          System.out.println(cli.getNombreCliente()+' '+cli.getApellidoCliente()+' '+cli.getTelefono()+' '+cli.getApellidoCliente()+' '+cli.getEstadoCivil()+'\n');
          //Mostrar la cuenta relacionada al cliente
          System.out.println("______________Cuentas______________");
          System.out.println("numero cuenta:"+ cli.getListPolizas().get(0).getNumero_cuenta() + "Estado cuenta:"+ cli.getListPolizas().get(0).getEstado_cuenta());
          System.out.println("______________Polizas _____________");
          for (Poliza cu : cli.getListPolizas()){
                 System.out.println("Número poliza:"+cu.getNumero_cuenta()+" Nombre Poliza: "+cu.getNombre()+" Estado: "+cu.getEstado()+'\n');
          }
       }
    }
    
    public boolean verificarCuentaBancaria(int cuenta) {
        boolean result = false;
        for (Poliza p : polizas) {
            if (p.getNumero_cuenta() == cuenta && p.getEstado()== "ACTIVA") {
                 result = true;
            }
        }

        return result;
    }
    
    public void crearSolicitud(String motivoCancelacion, String estado, ArrayList<Integer> listPoliza){
        ArrayList<Poliza> showPolizas = new ArrayList<Poliza>();
        for(Integer i : listPoliza){
            for(Poliza po: polizas){
                if(i == po.getId_poliza()){
                    showPolizas.add(po);
                }
            }
        }
        
        Solicitud sol = new Solicitud(motivoCancelacion,estado,showPolizas);
        solicitudes.add(sol);
    }

    void mostrarSolicitudes() {
        //Mostrar los clientes
       System.out.println("______________Solicitudes creadas: _____________");
       for (Solicitud showSoli : solicitudes) {
          System.out.println("Numero Solictud:"+showSoli.getId_solicitud()+" Estado:"+showSoli.getEstado()+" Fecha:"+showSoli.getFechaRegistro()+ "Motivos:"+showSoli.getMotivoCancelacion()+'\n');
       }
    }

 
    
}
