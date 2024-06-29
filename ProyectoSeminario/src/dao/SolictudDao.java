/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Poliza;
import modelo.Solicitud;

/**
 *
 * @author TEFHI
 */
public class SolictudDao {

    ArrayList<Solicitud> listSolicitudes = new ArrayList<Solicitud>();

    //Se inserta registro en la DB
    public void insertSolicitud(Solicitud miSolicitud) {
        Conexion conexion = new Conexion();
        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "INSERT INTO solicitud (fecha_registro,descripcion_motivo, estado_solicitud, solicitud_poliza, solicitud_cuenta) VALUES"
                    + "('" + miSolicitud.getFechaRegistro() + "','" + miSolicitud.getMotivoCancelacion() + "','" + miSolicitud.getEstado() + "'," + 
                    miSolicitud.getNumeroPoliza() + "," + miSolicitud.getNumeroCuenta() + ");";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            consulta.executeUpdate(query);
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
    }
   //Se obtiene una lista de solicitudes desde la DB.
    public ArrayList<Solicitud> buscarSolicitudes(int idCuenta) {
        Conexion conexion = new Conexion();
        boolean existe = false;

        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "SELECT * FROM solicitud WHERE solicitud_cuenta='" + idCuenta + "'";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Solicitud miSolicitud = new Solicitud();
                miSolicitud.setId_solicitud(Integer.parseInt(res.getString("id_solicitud")));
                miSolicitud.setFechaRegistro(res.getString("fecha_registro"));
                miSolicitud.setMotivoCancelacion(res.getString("descripcion_motivo"));
                miSolicitud.setEstado(res.getString("estado_solicitud"));
                listSolicitudes.add(miSolicitud);
            }

            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        if (existe) {
            return listSolicitudes;
        } else {
            return null;
        }
    }
    
    public void updateEstadoSolictudes() {
        Conexion conexion = new Conexion();
        boolean existe = false;
        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "UPDATE SET estado_solicitud='APROBADO' FROM solicitud '";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Solicitud miSolicitud = new Solicitud();
                miSolicitud.setId_solicitud(Integer.parseInt(res.getString("id_solicitud")));
                miSolicitud.setFechaRegistro(res.getString("fecha_registro"));
                miSolicitud.setMotivoCancelacion(res.getString("descripcion_motivo"));
                miSolicitud.setEstado(res.getString("estado_solicitud"));
                listSolicitudes.add(miSolicitud);
            }

            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
    }

}
