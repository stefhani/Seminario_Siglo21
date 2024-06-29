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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import modelo.Poliza;

/**
 *
 * @author TEFHI
 */
public class PolizaDao {

    ArrayList<Poliza> listPolizas = new ArrayList<Poliza>();

    //Permite retorna un listado de Polizas en relacion a una cuenta.
    public ArrayList<Poliza> buscarPolizas(int idCuenta) {
        Conexion conexion = new Conexion();
        boolean existe = false;

        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "SELECT * FROM poliza WHERE poliza_cuenta='" + idCuenta + "'";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Poliza miPoliza = new Poliza(Integer.parseInt(res.getString("poliza_cuenta")), res.getString("estado"), 
                        Double.parseDouble(res.getString("monto")));
                miPoliza.setId_poliza(Integer.parseInt(res.getString("id_poliza")));
                miPoliza.setNombre(res.getString("nombre"));
                miPoliza.setDescripcion(res.getString("descripcion"));
                miPoliza.setMonto(Double.parseDouble(res.getString("monto")));
                miPoliza.setEstado(res.getString("estado"));
                // miPoliza.setFechaActivacion(Date(res.getString("fechaActiva")));
                listPolizas.add(miPoliza);
            }

            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        if (existe) {
            return listPolizas;
        } else {
            return null;
        }
    }

    //Permite obtener una Poliza especifica.
    public Poliza obtenerPoliza(int idPoliza){
        Conexion conexion = new Conexion();
        boolean existe = false;
                try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "SELECT * FROM poliza WHERE id_poliza='" + idPoliza + "'";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                Poliza miPoliza = new Poliza(Integer.parseInt(res.getString("poliza_cuenta")), res.getString("estado"), 
                        Double.parseDouble(res.getString("monto")));
                miPoliza.setId_poliza(Integer.parseInt(res.getString("id_poliza")));
                miPoliza.setNombre(res.getString("nombre"));
                miPoliza.setDescripcion(res.getString("descripcion"));
                miPoliza.setMonto(Double.parseDouble(res.getString("monto")));
                miPoliza.setEstado(res.getString("estado"));
                // miPoliza.setFechaActivacion(Date(res.getString("fechaActiva")));
                listPolizas.add(miPoliza);
            }

            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        if (existe) {
            return listPolizas.get(0);
        } else {
            return null;
        }
    }

}
