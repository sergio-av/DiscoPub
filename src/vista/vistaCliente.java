package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Clientes;
import modelo.Eventos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;
import beans.Cliente;
import beans.Evento;
import controlador.Metodos;
import java.awt.Font;

public class vistaCliente extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textEmail;
	private JTextField textMovil;
	private JTextField textDireccion;
	private JTextField textPassword;
	private JTextField textEdad;
	private JTextField textDni;
	private JTextField textNombreEvento;
	private JTextField textNumeroEntradas;


	public vistaCliente(Cliente cliente) {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 643, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(23, 11, 53, 22);
		contentPane.add(lblUsuario);
		
		
		JLabel lblNombre = new JLabel(cliente.getNombre());
		lblNombre.setVisible(true);
		lblNombre.setBounds(113, 19, 113, 14);
		contentPane.add(lblNombre);
		
		
		JLabel lblEmail1 = new JLabel("Email: ");
		lblEmail1.setVisible(false);
		lblEmail1.setBounds(23, 55, 46, 14);
		contentPane.add(lblEmail1);
		
		JLabel lblNumeroMovil1 = new JLabel("Numero movil:");
		lblNumeroMovil1.setVisible(false);
		lblNumeroMovil1.setBounds(23, 80, 94, 14);
		contentPane.add(lblNumeroMovil1);
		
		JLabel lblDireccion1 = new JLabel("Direccion:");
		lblDireccion1.setVisible(false);
		lblDireccion1.setBounds(23, 194, 68, 14);
		contentPane.add(lblDireccion1);
		
		JLabel lblPassword1 = new JLabel("Password:");
		lblPassword1.setVisible(false);
		lblPassword1.setBounds(23, 130, 68, 14);
		contentPane.add(lblPassword1);
		
		JLabel lblNewLabel1 = new JLabel("Edad: ");
		lblNewLabel1.setVisible(false);
		lblNewLabel1.setBounds(23, 155, 53, 14);
		contentPane.add(lblNewLabel1);
		
		JLabel lblMEmail = new JLabel(cliente.getEmail());
		lblMEmail.setVisible(false);
		lblMEmail.setBounds(113, 55, 113, 14);
		contentPane.add(lblMEmail);
		
		String numMovilString = Integer.toString(cliente.getNumero_movil());
		JLabel lblMNumero_movil = new JLabel(numMovilString);
		lblMNumero_movil.setVisible(false);
		lblMNumero_movil.setBounds(113, 80, 113, 14);
		contentPane.add(lblMNumero_movil);
		
		JLabel lblMDireccion = new JLabel(cliente.getDireccion());
		lblMDireccion.setVisible(false);
		lblMDireccion.setBounds(113, 194, 272, 14);
		contentPane.add(lblMDireccion);
		
		JLabel lblMPassword = new JLabel(cliente.getPassword());
		lblMPassword.setVisible(false);
		lblMPassword.setBounds(113, 130, 113, 14);
		contentPane.add(lblMPassword);
		
		JLabel lblDni1 = new JLabel("DNI:");
		lblDni1.setVisible(false);
		lblDni1.setBounds(23, 105, 46, 14);
		contentPane.add(lblDni1);
		
		textDni = new JTextField();
		textDni.setVisible(false);
		textDni.setBounds(113, 105, 113, 20);
		contentPane.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblDni = new JLabel(cliente.getDni());
		lblDni.setVisible(false);
		lblDni.setBounds(113, 105, 113, 14);
		contentPane.add(lblDni);
		
		String edadString = Integer.toString(cliente.getEdad());
		JLabel lblMEdad = new JLabel(edadString);
		lblMEdad.setVisible(false);
		lblMEdad.setBounds(113, 155, 113, 14);
		contentPane.add(lblMEdad);
		textUsuario = new JTextField();
		textUsuario.setVisible(false);
		textUsuario.setBounds(113, 12, 113, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setVisible(false);
		textEmail.setBounds(113, 52, 113, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textMovil = new JTextField();
		textMovil.setVisible(false);
		textMovil.setBounds(113, 77, 113, 20);
		contentPane.add(textMovil);
		textMovil.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setVisible(false);
		textDireccion.setBounds(113, 191, 272, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setVisible(false);
		textPassword.setBounds(113, 127, 113, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		textEdad = new JTextField();
		textEdad.setVisible(false);
		textEdad.setBounds(113, 152, 113, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setVisible(false);
		btnModificar.addMouseListener(new MouseAdapter() {
			
		});
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDni.setVisible(true);
				textUsuario.setVisible(true);
				textDireccion.setVisible(true);
				textPassword.setVisible(true);
				textEdad.setVisible(true);
				textMovil.setVisible(true);
				textPassword.setVisible(true);
				textEmail.setVisible(true);
				
				lblNombre.setVisible(false);
				lblMDireccion.setVisible(false);
				lblMPassword.setVisible(false);
				lblMEdad.setVisible(false);
				lblMNumero_movil.setVisible(false);
				lblMPassword.setVisible(false);
				lblMEmail.setVisible(false);
				
			}
		});
		btnModificar.setBounds(236, 51, 136, 23);
		contentPane.add(btnModificar);
		
		
		/* 
		 * En el boton btnAceptarOcultar es el boton que se usara, aparte de ocultar nuestra informacion personal 
		 * para enviar la informacion actualizada a la base de datos con la nueva informacion del usuario.
		 * Esta modificaciones se pueden hacer una vez se ha pulsado el boton modificar.
		 */
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setVisible(false);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsuario.setVisible(false);
				textDireccion.setVisible(false);
				textPassword.setVisible(false);
				textEdad.setVisible(false);
				textMovil.setVisible(false);
				textPassword.setVisible(false);
				textEmail.setVisible(false);
				textDni.setVisible(false);
				
				lblNombre.setVisible(true);
				lblDni.setVisible(true);
				lblMDireccion.setVisible(true);
				lblMPassword.setVisible(true);
				lblMEdad.setVisible(true);
				lblMNumero_movil.setVisible(true);
				lblMPassword.setVisible(true);
				lblMEmail.setVisible(true);
				
				//Actualizar
				String telefonoTxt = textMovil.getText();
				int numero_movilCliente= 0;
				
				if (textMovil.getText() == "") {
					telefonoTxt = "0";
					numero_movilCliente = Integer.parseInt(telefonoTxt);
					if(numero_movilCliente == 0) {
						numero_movilCliente = cliente.getNumero_movil();
					}
				}else {
					try {
						numero_movilCliente = Integer.parseInt(telefonoTxt);
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Rellene el espacio de numero Movil ");
					}
				}
				String edadTxt = textEdad.getText();
				int edadCliente = 0;
				try {
					edadTxt = textEdad.getText();
					edadCliente = Integer.parseInt(edadTxt);
					if(edadTxt == "") {
						edadTxt = "0";
						edadCliente = Integer.parseInt(edadTxt);
						if(edadCliente == 0) {
							edadCliente = cliente.getEdad();
						}
					}
					
				} catch (NumberFormatException e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Rellene el espacio de edad ");
				}
				
				
				int id = cliente.getId();
				
				
				String nombreCliente = textUsuario.getText();
				if(textUsuario.getText() == "") {
					nombreCliente = cliente.getNombre();	
				}
				String dniCliente= textDni.getText();
				if(textDni.getText() == "") {
					dniCliente = cliente.getDni();	
				}
				String direccionCliente = textDireccion.getText();
				if(textDireccion.getText() == "") {
					direccionCliente = cliente.getDireccion();	
				}
				String emailCliente = textEmail.getText();
				if(textEmail.getText() == "") {
					emailCliente = cliente.getEmail();	
				}
				String passwordCliente = textPassword.getText() ;
				if(textPassword.getText() == "") {
					passwordCliente = cliente.getPassword();	
				}
				
				new modelo.Clientes().ActualizarCliente(nombreCliente, emailCliente, dniCliente, passwordCliente, direccionCliente, edadCliente, numero_movilCliente, id);
				
			}
			
		});
		btnAceptar.setBounds(399, 51, 108, 23);
		contentPane.add(btnAceptar);
		
		JButton btnOcultarDatos = new JButton("Ocultar / Cancelar");
		btnOcultarDatos.setVisible(false);
		btnOcultarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnModificar.setVisible(false);
				btnOcultarDatos.setVisible(false);
				btnAceptar.setVisible(false);
				
				lblMDireccion.setVisible(false);
				lblMPassword.setVisible(false);
				lblMEdad.setVisible(false);
				lblMNumero_movil.setVisible(false);
				lblMPassword.setVisible(false);
				lblMEmail.setVisible(false);
				lblDni1.setVisible(false);
				
				lblDireccion1.setVisible(false);
				lblNumeroMovil1.setVisible(false);
				lblDni.setVisible(false);
				lblEmail1.setVisible(false);
				lblPassword1.setVisible(false);
				lblEmail1.setVisible(false);
				lblNewLabel1.setVisible(false);
				
				textUsuario.setVisible(false);
				textDireccion.setVisible(false);
				textPassword.setVisible(false);
				textEdad.setVisible(false);
				textMovil.setVisible(false);
				textPassword.setVisible(false);
				textEmail.setVisible(false);
				textDni.setVisible(false);
				
			}
		});
		btnOcultarDatos.setBounds(399, 11, 108, 23);
		contentPane.add(btnOcultarDatos);
		
		
		JButton btnDatos = new JButton("Mostrar datos");
		btnDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOcultarDatos.setVisible(true);
				btnModificar.setVisible(true);
				btnAceptar.setVisible(true);
				
				
				
				lblMDireccion.setVisible(true);
				lblMPassword.setVisible(true);
				lblMEdad.setVisible(true);
				lblMNumero_movil.setVisible(true);
				lblMPassword.setVisible(true);
				lblMEmail.setVisible(true);
				lblDni1.setVisible(true);
				
				lblDireccion1.setVisible(true);
				lblNumeroMovil1.setVisible(true);
				lblDni.setVisible(true);
				lblEmail1.setVisible(true);
				lblPassword1.setVisible(true);
				lblEmail1.setVisible(true);
				lblNewLabel1.setVisible(true);
			}
		});
		btnDatos.setBounds(236, 11, 136, 23);
		contentPane.add(btnDatos);
		
		JButton btnVerEventos = new JButton("Ver Eventos");
		btnVerEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ArrayList<Evento> eventoRecogido = new Eventos().recogerTodosEventos();
							vistaTablaEvento frame = new vistaTablaEvento(eventoRecogido);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnVerEventos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVerEventos.setBounds(23, 219, 149, 39);
		contentPane.add(btnVerEventos);
		
		
		textNombreEvento = new JTextField();
		textNombreEvento.setVisible(false);
		textNombreEvento.setBounds(172, 266, 200, 20);
		contentPane.add(textNombreEvento);
		textNombreEvento.setColumns(10);
		
		JLabel lblNombreEvento = new JLabel("Nombre Evento:");
		lblNombreEvento.setVisible(false);
		lblNombreEvento.setBounds(59, 269, 86, 14);
		contentPane.add(lblNombreEvento);

		textNumeroEntradas = new JTextField();
		textNumeroEntradas.setVisible(false);
		textNumeroEntradas.setBounds(172, 297, 46, 20);
		contentPane.add(textNumeroEntradas);
		textNumeroEntradas.setColumns(10);
		
		JLabel lblNumeroEntradas = new JLabel("Numero entradas:");
		lblNumeroEntradas.setVisible(false);
		lblNumeroEntradas.setBounds(59, 300, 103, 14);
		contentPane.add(lblNumeroEntradas);
		
		JButton btnAceptarEvento = new JButton("OK");
		btnAceptarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarEvento.setVisible(false);
				lblNumeroEntradas.setVisible(false);
				textNumeroEntradas.setVisible(false);
				lblNombreEvento.setVisible(false);
				textNombreEvento.setVisible(false);
				btnAceptarEvento.setVisible(false);
				
				String nombreEvento=textNombreEvento.getText();
				Evento eventoRecogido= new modelo.Eventos().recogerEvento(nombreEvento);
				
				String numeroEntradasTxt = textNumeroEntradas.getText();
				int entradasCompradas = Integer.parseInt(numeroEntradasTxt);
				new controlador.Metodos().restarEntrada(eventoRecogido, entradasCompradas);
				
				new controlador.Metodos().escribirEntrada(cliente, eventoRecogido);
				
				
					
				
			}
		});
		btnAceptarEvento.setVisible(false);
		btnAceptarEvento.setBounds(382, 265, 68, 23);
		contentPane.add(btnAceptarEvento);
		
		JButton btnSeleccionarEvento = new JButton("Seleccionar Evento");
		btnSeleccionarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarEvento.setVisible(true);
				lblNumeroEntradas.setVisible(true);
				textNumeroEntradas.setVisible(true);
				lblNombreEvento.setVisible(true);
				textNombreEvento.setVisible(true);
				btnAceptarEvento.setVisible(true);
			}
		});
		btnSeleccionarEvento.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSeleccionarEvento.setBounds(193, 219, 200, 38);
		contentPane.add(btnSeleccionarEvento);
		
	}
}
