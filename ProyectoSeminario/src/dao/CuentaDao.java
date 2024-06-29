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
import javax.swing.JOptionPane;
import modelo.Cuenta;

/**
 *
 * @author TEFHI
 */
public class CuentaDao {

    //Permite obtener la cuenta relacionada con el cliente.
    public Cuenta buscarCuenta(int idCliente) {
        Conexion conexion = new Conexion();
        boolean existe = false;
        Cuenta miCuenta = new Cuenta();
        try {
            //Statement estatuto = conex.getConnection().createStatement();
            String query = "SELECT * FROM cuenta WHERE cuenta_cliente='" + idCliente + "'";
            PreparedStatement consulta = conexion.getConnection().prepareStatement(query);
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                miCuenta.setNumero_cuenta(Integer.parseInt(res.getString("id_cuenta")));
                miCuenta.setEstado(res.getString("estado"));
                miCuenta.setSaldoDisponible(Double.parseDouble(res.getString("saldoDisponible")));
            }

            res.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        if (existe) {
            return miCuenta;
        } else {
            return null;
        }
    }

}
