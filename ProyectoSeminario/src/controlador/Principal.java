/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import vista.VentanaRegistro;

/**
 *
 * @author TEFHI
 */
public class Principal {
    VentanaRegistro miVentanaRegistro;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal miPrincipal=new Principal();
        miPrincipal.iniciar();
    }

    private void iniciar() {
        /*Se instancian las clases*/
        miVentanaRegistro=new VentanaRegistro();
        miVentanaRegistro.setVisible(true);
    }
    
}
