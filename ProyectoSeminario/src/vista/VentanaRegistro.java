/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Coordinador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.Poliza;

/**
 *
 * @author TEFHI
 */
public class VentanaRegistro extends JFrame implements ActionListener{

	private Coordinador miCoordinador; //objeto miCoordinador que permite la relacion entre esta clase y la clase coordinador
	private JLabel labelTitulo, labelSolicitud,labelSolNumPoliza,labelSolMotivo;
	private JTextField textNombre,textApellido,textSolNumPoliza,textSolMotivo;
	private JLabel nombreCliente,apellidoCliente,solicDescripcion;
	private JButton botonBuscarPoliza,botonGuardarSolicitud,botonCancelar;
        private JTextArea areaIntroduccion, areaSolicitudes;
	public String textoIntroduccion = "";
	/**
	 * constructor de la clase donde se inicializan todos los componentes
	 * de la ventana de registro
	 */
	public VentanaRegistro() {
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		botonBuscarPoliza = new JButton();
		botonBuscarPoliza.setBounds(530, 120, 120, 25);
		botonBuscarPoliza.setText("Buscar Polizas");
                
                botonGuardarSolicitud = new JButton();
		botonGuardarSolicitud.setBounds(43, 465, 140, 25);
		botonGuardarSolicitud.setText("Agregar solicitud");
		
		labelTitulo = new JLabel();
		labelTitulo.setText("GENERACIÓN DE SOLICITUDES 'CANCELACIÓN DE PÓLIZAS'");
		labelTitulo.setBounds(170, 20, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 11));

		
		nombreCliente=new JLabel();
		nombreCliente.setText("Nombre");
		nombreCliente.setBounds(20, 120, 80, 25);
		add(nombreCliente);

		apellidoCliente=new JLabel();
		apellidoCliente.setText("Apellido");
		apellidoCliente.setBounds(290, 120, 80, 25);
		add(apellidoCliente);
		
		textNombre=new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);
                
                textApellido = new JTextField();
                textApellido.setBounds(340, 120, 190, 25);
                add(textApellido);
                
                areaIntroduccion = new JTextArea();
		areaIntroduccion.setBounds(50, 200, 590, 140);
		areaIntroduccion.setEditable(false);
		areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 14));
		areaIntroduccion.setLineWrap(true);
		areaIntroduccion.setText(textoIntroduccion);
		areaIntroduccion.setWrapStyleWord(true);
		areaIntroduccion.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.LOWERED, null, null, null,
				new java.awt.Color(0, 0, 0)));
                
                add(areaIntroduccion);
                
                areaSolicitudes = new JTextArea();
                areaSolicitudes.setBounds(50, 500, 590, 140);
                areaSolicitudes.setEditable(false);
                areaSolicitudes.setFont(new java.awt.Font("Verdana", 0, 14));
                areaSolicitudes.setLineWrap(true);
             //   areaSolicitudes.setText(textoIntroduccion);
                areaSolicitudes.setWrapStyleWord(true);
                areaSolicitudes.setBorder(javax.swing.BorderFactory.createBevelBorder(
                        javax.swing.border.BevelBorder.LOWERED, null, null, null,
                        new java.awt.Color(0, 0, 0)));

                add(areaSolicitudes);
                
                labelSolicitud = new JLabel();
                labelSolicitud.setText("Agregar solicitudes: Solo polizas con estado ACTIVA");
                labelSolicitud.setBounds(50, 350, 600, 30);
                add(labelSolicitud);
                
                labelSolNumPoliza = new JLabel();
                labelSolNumPoliza.setText("Ingresar n° poliza:");
                labelSolNumPoliza.setBounds(52, 400, 120, 25);
                add(labelSolNumPoliza);
                
                labelSolMotivo = new JLabel();
                labelSolMotivo.setText("Ingresar motivo de cancelacion de poliza:");
                //x e y width e heigth
                labelSolMotivo.setBounds(52, 425, 300, 25);
                add(labelSolMotivo);
                //Se obtiene el numero de la poliza               		
		textSolNumPoliza=new JTextField();
		textSolNumPoliza.setBounds(170, 400, 120, 25);
		add(textSolNumPoliza);
                //Se obtiene el motivo de solicitudes
                textSolMotivo = new JTextField();
                textSolMotivo.setBounds(315, 425, 316, 25);
                add(textSolMotivo);
                
		botonBuscarPoliza.addActionListener(this);
		add(botonBuscarPoliza);
                
                botonGuardarSolicitud.addActionListener(this);
		add(botonGuardarSolicitud);
                
		add(labelTitulo);
		limpiar();
                //x e y
		setSize(700, 700);
		setTitle("Patron de disenio: MVC - Stefhani Cadillo");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

	}


	private void limpiar() 
	{
		textNombre.setText("");
		textApellido.setText("");
	}


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{       //Flujo para el analisis del boton Buscar Polizas
		if (e.getSource()==botonBuscarPoliza)
		{
			try {
				Cliente cliente = new Cliente();
                                String text="";
				cliente.setNombreCliente(textNombre.getText());
				cliente.setApellidoCliente(textApellido.getText());
                                miCoordinador = new Coordinador();
				text = miCoordinador.obtenerPolizas(cliente);
                                areaIntroduccion.setText(text);
                                
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"El cliente no tiene polizas disponibles","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
                 //Flujo para el analisis del boton Agregar Solicitudes
		if (e.getSource()==botonGuardarSolicitud)
		{
			try {
                                ArrayList<Poliza> polizas = new ArrayList<>();
                                miCoordinador = new Coordinador();
                                int miPoliza=Integer.parseInt(textSolNumPoliza.getText());
                                polizas.add(miCoordinador.obtenerPoliza(miPoliza));
                                miCoordinador.ingresarSolicitud(polizas.get(0).getNumero_cuenta(),polizas.get(0).getId_poliza(),textSolMotivo.getText());
                                String textMotivo=miCoordinador.mostrarSolicitudes(polizas.get(0).getNumero_cuenta());
                                areaSolicitudes.setText(textMotivo);
                                
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error en el Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==botonCancelar)
		{
			this.dispose();
		}
	}
	
	

}
