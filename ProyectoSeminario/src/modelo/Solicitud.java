/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author TEFHI
 */
public class Solicitud {
    private int id_solicitud;
    private String fechaRegistro;
    private String motivoCancelacion;
    private String estado;
    private List<Poliza> listPoliza;
    private int numeroPoliza;
    private int numeroCuenta;

    public Solicitud( String motivoCancelacion, String estado, List<Poliza> listPoliza) {
        this.id_solicitud = (int) (Math.random() * 1000) + 1;
        this.fechaRegistro = "";
        this.motivoCancelacion = motivoCancelacion;
        this.estado = estado;
        this.listPoliza = listPoliza;
    }

    public Solicitud() {
    }
    

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setListPoliza(List<Poliza> listPoliza) {
        this.listPoliza = listPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    
    public int getId_solicitud() {
        return id_solicitud;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public String getEstado() {
        return estado;
    }

    public List<Poliza> getListPoliza() {
        return listPoliza;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
    
}
