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
import modelo.Cliente;
import modelo.Cuenta;
import modelo.Poliza;

/**
 *
 * @author TEFHI
 */
public class ClienteDao {

    /**
     * Permite obtener al cliente de la DB
     */
    public Cliente buscarCliente(String nombre, String apellido) {
        Conexion conexion = new Conexion();
        Cliente cliente = new Cliente();
        boolean existe = false;
        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "SELECT * FROM cliente WHERE nombre='" + nombre + "' or apellido= '" + apellido + "'";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                cliente.setId_cliente(Integer.parseInt(res.getString("id_cliente")));
                cliente.setNombreCliente(res.getString("nombre"));
                cliente.setApellidoCliente(res.getString("apellido"));
                cliente.setTelefono(res.getString("telefono"));
                cliente.setDomicilio(res.getString("domicilio"));
                cliente.setEstadoCivil(res.getString("estado_civil"));
            }
            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        if (existe) {
            return cliente;
        } else {
            return null;
        }
    }



}
