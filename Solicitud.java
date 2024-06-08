/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4seminario;

import java.util.Date;
import java.util.List;

/**
 *
 * @author TEFHI
 */
public class Solicitud {
    private int id_solicitud;
    private Date fechaRegistro;
    private String motivoCancelacion;
    private String estado;
    private List<Poliza> listPoliza;

    public Solicitud( String motivoCancelacion, String estado, List<Poliza> listPoliza) {
        this.id_solicitud = (int) (Math.random() * 1000) + 1;
        this.fechaRegistro = new Date();
        this.motivoCancelacion = motivoCancelacion;
        this.estado = estado;
        this.listPoliza = listPoliza;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public void setFechaRegistro(Date fechaRegistro) {
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

    public int getId_solicitud() {
        return id_solicitud;
    }

    public Date getFechaRegistro() {
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

    
    
}
