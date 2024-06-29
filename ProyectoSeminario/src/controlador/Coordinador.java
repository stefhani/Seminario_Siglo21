/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.Logica;
import modelo.Poliza;
import modelo.Solicitud;
import vista.VentanaRegistro;

/**
 *
 * @author TEFHI
 */
public class Coordinador {
    private Logica miLogica;
    private VentanaRegistro miVentanaRegistro;
    private ArrayList<Poliza> listPolizas;
    private ArrayList<Solicitud> listSolicitudes;
    
    public void mostrarVentanaRegistro() {
            miVentanaRegistro.setVisible(true);
    }
    
    /////////////////////////////////////////
    
    /**
     * Permite obtener los datos del Cliente consultado desde la interfaz.
    */
    public Cliente mostrarCliente(Cliente cliente) {
        Cliente miCliente = new Cliente();
        miLogica= new Logica();
        miCliente= miLogica.obtenerCliente(cliente);
        return miCliente;   
    }
    
    //Permite obtener un listado de solicitudes que fueron ingresador en el formulario.
    public String mostrarSolicitudes(int idCuenta) {
        miLogica = new Logica();
        listSolicitudes = miLogica.obtenerSolicitudes(idCuenta);
        return miLogica.mostrarDatosSolicitudes(listSolicitudes);
    }
    
    /*
    * Permite obtener un listado de polizas desde MySql por medio de la cuenta_cliente
    */
    public String obtenerPolizas(Cliente miCliente){
        miLogica= new Logica();
        Cliente miCliente2 = new Cliente();
        miCliente2= miLogica.obtenerCliente(miCliente);
        Cuenta miCuenta = new Cuenta();
        miCuenta = miLogica.obtenerCuenta(miCliente2);
        listPolizas = miLogica.obtenerPolizas(miCuenta);
       return  miLogica.mostrarDatos(listPolizas);
    }
    
    /*
    * Permite ingresar la solicitud para ingresar a la DB MySql
    */
    public void ingresarSolicitud(int idCuenta,int idPoliza, String motivo){
        miLogica= new Logica();
        Date myDate = new Date();
        Solicitud miSolicitud= new Solicitud();
        miSolicitud.setFechaRegistro(new SimpleDateFormat("dd-MM-yyyy").format(myDate));
        miSolicitud.setMotivoCancelacion(motivo);
        miSolicitud.setEstado("EN ESTUDIO");
        miSolicitud.setNumeroCuenta(idCuenta);
        miSolicitud.setNumeroPoliza(idPoliza);
        miLogica.ingresarSolicitud(miSolicitud);
    }
    
    //Permite obtener la poliza especifica 
    public Poliza obtenerPoliza(int miPoliza){
         miLogica= new Logica();
       return   miLogica.obtenerPoliza(miPoliza);
    }
    //Permite actualizar de forma generico el estadp de las Solicitud en APROBADO
    public void updateEstadoSolicitud(){
         miLogica= new Logica();
         miLogica.updateEstadoSolicitud();
    }
    

}
