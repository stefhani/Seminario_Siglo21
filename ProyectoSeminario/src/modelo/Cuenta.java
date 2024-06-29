/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author TEFHI
 */
public class Cuenta{
    private int numero_cuenta;
    private String estado_cuenta;
    private double saldoDisponible;

    public Cuenta(int numero_cuenta,String estado_cuenta,double saldoDisponible) {
        this.numero_cuenta=numero_cuenta;
        this.estado_cuenta=estado_cuenta;
        this.saldoDisponible=saldoDisponible;
        
    }

    public Cuenta() {
       
    }

    public void setEstado(String estado) {
        this.estado_cuenta = estado;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }


    public String getEstado() {
        return estado_cuenta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

   
    
    
    
    
}
