/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4seminario;

import java.util.ArrayList;

/**
 *
 * @author TEFHI
 */
public class Cliente {
    
    private int id_cliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String domicilio;
    private String telefono;
    private String estadoCivil;
    private String paisResidencia;
    
    private ArrayList<Poliza> listPolizas;

    public Cliente( String nombreCliente, String apellidoCliente,String domicilio, String telefono, String estadoCivil, String paisResidencia) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.paisResidencia = paisResidencia;
        this.listPolizas=new ArrayList<>();
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setListPolizas(ArrayList<Poliza> listPolizas) {
        this.listPolizas = listPolizas;
    }


    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }
    
    

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public ArrayList<Poliza> getListPolizas() {
        return listPolizas;
    }
    
    
    
}
