/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Coordinador;
import dao.ClienteDao;
import dao.CuentaDao;
import dao.PolizaDao;
import dao.SolictudDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TEFHI
 */
public class Logica {

    private Coordinador miCoordinador;
    public static boolean consultaPersona = false;
    public static boolean modificaPersona = false;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;

    }

    public Cliente obtenerCliente(Cliente miCliente) {
        Cliente resultado = new Cliente();
        if (miCliente.getApellidoCliente() != null || miCliente.getNombreCliente() != null) {
            ClienteDao miClienteDao = new ClienteDao();
            resultado = miClienteDao.buscarCliente(miCliente.getNombreCliente(), miCliente.getApellidoCliente());
        } else {
            JOptionPane.showMessageDialog(null, "El Cliente no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

        return resultado;
    }

    public Cuenta obtenerCuenta(Cliente miCliente) {
        Cuenta resultado = new Cuenta();
        if (miCliente.getId_cliente() > 0) {
            CuentaDao miCuentaDao = new CuentaDao();
            resultado = miCuentaDao.buscarCuenta(miCliente.getId_cliente());
        } else {
            JOptionPane.showMessageDialog(null, "El Cliente no existe Cuentas Activas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        return resultado;
    }

    public ArrayList<Poliza> obtenerPolizas(Cuenta miCuenta) {
        ArrayList<Poliza> resultado = new ArrayList<Poliza>();
        if (miCuenta.getNumero_cuenta() > 0) {
            PolizaDao miPolizaDao = new PolizaDao();
            resultado = miPolizaDao.buscarPolizas(miCuenta.getNumero_cuenta());
        } else {
            JOptionPane.showMessageDialog(null, "No posee polizas Activas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        return resultado;
    }

    public String mostrarDatos(ArrayList<Poliza> misPolizas) {
        String text="";
        for (Poliza cu : misPolizas) {
           text+= "Número poliza:" + cu.getId_poliza() + " Nombre Poliza: " + cu.getNombre() + " Estado: " + cu.getEstado() + '\n';
        }
       return text;
    }
    
   public void ingresarSolicitud(Solicitud miSolicitud){
       SolictudDao solDao = new SolictudDao();
       solDao.insertSolicitud(miSolicitud);
   }
   
    public Poliza obtenerPoliza(int idpoliza) {
        PolizaDao polizaDao = new PolizaDao();
       return  polizaDao.obtenerPoliza(idpoliza);
    }
    
    public ArrayList<Solicitud> obtenerSolicitudes(int idCuenta) {
       SolictudDao solDao = new SolictudDao();
        return solDao.buscarSolicitudes(idCuenta);
    }
    
    public String mostrarDatosSolicitudes(ArrayList<Solicitud> misSolicitudes) {
        String text = "";
        for (Solicitud sol : misSolicitudes) {
            text += "Fecha:" + sol.getFechaRegistro()+ " Motivo: " + sol.getMotivoCancelacion()+ " Estado: " + sol.getEstado()+ '\n';
        }
        return text;
    }
    
    public void updateEstadoSolicitud(){
       SolictudDao solDao = new SolictudDao();
       solDao.updateEstadoSolictudes();
    }
}
