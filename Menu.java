/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4seminario;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TEFHI
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
       
        ControlSolicitudes control = new ControlSolicitudes();
        boolean salir =false;
        
        while(!salir){
         System.out.println("__________________________________");
         System.out.println("MENU PRINCIPAL BANCO BAC CREDOMATIC - SOLICITUDES PARA CANCELACION DE POLIZAS");
         System.out.println("__________________________________");
         System.out.println("1.Inicializacion Datos");
         System.out.println("2.Verificar si existen polizas ACTIVA para una cuenta bancaria ");
         System.out.println("3.Agregar solictud de cancelacion");
         System.out.println("4.Mostrar las solicitudes agregadas");
         System.out.println("5.Salir");
         System.out.println("__________________________________");
         System.out.print("Elige una opcion\n");
         
         
         int opcion =scanner.nextInt();
          switch (opcion){
            case 1:
                //Iniciar los datos para el flujo de ejecucion.
                System.out.println("______________Informacion existente _____________\n");
                control.iniciarDatos();
                control.mostrarDatos();
             break;
            case 2:
               System.out.print("Ingresar cuenta bancaria:\n");
               int numeroCuenta = scanner.nextInt();             
               boolean valid =control.verificarCuentaBancaria(numeroCuenta);
               if(valid){
                    System.out.print("La cuenta ingresada posee polizas ACTIVAS\n");
               }else{
                   System.out.print("La cuenta ingresada posee polizas NO ACTIVAS\n");
               }
               break;
            case 3:
                ArrayList<Integer> listPoliza= new ArrayList<>();
                System.out.print("Ingresar numero de poliza a cancelar:\n");
                int poli = scanner.nextInt(); 
                scanner.nextLine();
                System.out.print("Ingresar motivo de cancelación de la poliza:\n");
                String motivoCancelacion = scanner.nextLine();
                String estado = "EN ESTUDIO"; 
                listPoliza.add(poli);
                control.crearSolicitud(motivoCancelacion, estado, listPoliza);
               break;
            case 4:
               System.out.print("Mostrar solicitudes creadas:\n");
               control.mostrarSolicitudes();
               break;
            case 5:
               salir=true;
               break;
            default:   
               System.out.println("Las opciones son entre 1 y 5");

            }
    }
    }
    
}
