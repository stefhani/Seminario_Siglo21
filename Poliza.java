/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4seminario;

import java.util.Date;



/**
 *
 * @author TEFHI
 */

//Aplicacion de Herencia
public class Poliza extends Cuenta{
    //Aplicacion de encapsulamiento
    private int id_poliza;
    private String nombre;
    private String descripcion;
    private double monto;
    private Date fechaActivacion;
    private String estado_poliza;
    private String pais;

    public Poliza(int id_poliza, String nombre, String descripcion, double monto, Date fechaActivacion, String estado_poliza, String pais, int numero_cuenta, String estado_cuenta,
            double saldoDisponible) {
        super(numero_cuenta, estado_cuenta, saldoDisponible);
        this.id_poliza = id_poliza;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fechaActivacion = fechaActivacion;
        this.estado_poliza = estado_poliza;
        this.pais = pais;
    }



    public void setId_poliza(int id_poliza) {
        this.id_poliza = id_poliza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public void setEstado(String estado) {
        this.estado_poliza = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId_poliza() {
        return id_poliza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public String getEstado() {
        return estado_poliza;
    }

    public String getPais() {
        return pais;
    }
    
    
    
    
}
