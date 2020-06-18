package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Empresa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class VistaEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textPassword;
	private JTextField textDireccion;
	private JTextField textNumeroEmpresa;
	private JTextField textNumeroAtencion;
	private JTextField textNif;
	private JTextField textEmail;
	private JTextField textNombreEventoB;

	
	public VistaEmpresa(Empresa empresa) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 631, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 11, 67, 14);
		contentPane.add(lblNombre);
		
		JLabel lblpassword = new JLabel("Password:");
		lblpassword.setVisible(false);
		lblpassword.setBounds(10, 50, 67, 14);
		contentPane.add(lblpassword);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setVisible(false);
		lblDireccion.setBounds(10, 91, 67, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblNumero_atencion = new JLabel("Numero Atencion: ");
		lblNumero_atencion.setVisible(false);
		lblNumero_atencion.setBounds(10, 164, 111, 14);
		contentPane.add(lblNumero_atencion);
		
		JLabel lblNumero_movil = new JLabel("Numero Empresa:");
		lblNumero_movil.setVisible(false);
		lblNumero_movil.setBounds(10, 130, 111, 14);
		contentPane.add(lblNumero_movil);
		
		JLabel lblNif = new JLabel("NIF: ");
		lblNif.setVisible(false);
		lblNif.setBounds(10, 207, 46, 14);
		contentPane.add(lblNif);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setVisible(false);
		lblEmail.setBounds(10, 246, 46, 14);
		contentPane.add(lblEmail);
		
		
		textNombre = new JTextField();
		textNombre.setVisible(false);
		textNombre.setBounds(125, 8, 193, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setVisible(false);
		textPassword.setBounds(125, 47, 193, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setVisible(false);
		textDireccion.setBounds(125, 88, 394, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textNumeroEmpresa = new JTextField();
		textNumeroEmpresa.setVisible(false);
		textNumeroEmpresa.setBounds(125, 127, 292, 20);
		contentPane.add(textNumeroEmpresa);
		textNumeroEmpresa.setColumns(10);
		
		textNumeroAtencion = new JTextField();
		textNumeroAtencion.setVisible(false);
		textNumeroAtencion.setBounds(125, 161, 292, 20);
		contentPane.add(textNumeroAtencion);
		textNumeroAtencion.setColumns(10);
		
		textNif = new JTextField();
		textNif.setVisible(false);
		textNif.setBounds(125, 204, 292, 20);
		contentPane.add(textNif);
		textNif.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setVisible(false);
		textEmail.setBounds(125, 243, 394, 20);
		contentPane.add(textEmail);
		
		textEmail.setColumns(10);
		
		JLabel lblNombreM = new JLabel(empresa.getNombre());
		lblNombreM.setBounds(125, 11, 193, 14);
		contentPane.add(lblNombreM);
		
		JLabel lblpasswordM = new JLabel(empresa.getPassword());
		lblpasswordM.setVisible(false);
		lblpasswordM.setBounds(125, 50, 193, 14);
		contentPane.add(lblpasswordM);
		
		JLabel lblDireccionM = new JLabel(empresa.getDireccion());
		lblDireccionM.setVisible(false);
		lblDireccionM.setBounds(125, 91, 394, 14);
		contentPane.add(lblDireccionM);
		
		String lblNumero_movilTxt = Integer.toString(empresa.getNumero_movil());
		JLabel lblNumero_movilM = new JLabel(lblNumero_movilTxt);
		lblNumero_movilM.setVisible(false);
		lblNumero_movilM.setBounds(125, 130, 292, 14);
		contentPane.add(lblNumero_movilM);
		
		String lblNumero_atencionTxt = Integer.toString(empresa.getNumero_atencion());
		JLabel lblNumero_atencionM = new JLabel(lblNumero_atencionTxt);
		lblNumero_atencionM.setVisible(false);
		lblNumero_atencionM.setBounds(125, 164, 292, 14);
		contentPane.add(lblNumero_atencionM);
		
		JLabel lblNifM = new JLabel(empresa.getNif());
		lblNifM.setVisible(false);
		lblNifM.setBounds(125, 207, 292, 14);
		contentPane.add(lblNifM);
		
		JLabel lblEmailM = new JLabel(empresa.getEmail());
		lblEmailM.setVisible(false);
		lblEmailM.setBounds(125, 246, 394, 14);
		contentPane.add(lblEmailM);
		//*********************   Botones y Acciones	**********************************
		//---Permitir ver datos ------------------------------------------
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setVisible(false);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDireccion.setVisible(true);
				textEmail.setVisible(true);
				textNif.setVisible(true);
				textNombre.setVisible(true);
				textNumeroAtencion.setVisible(true);
				textNumeroEmpresa.setVisible(true);
				textPassword.setVisible(true);
				
				lblNombreM.setVisible(false);
				lblDireccionM.setVisible(false);
				lblEmailM.setVisible(false);
				lblNifM.setVisible(false);
				lblNumero_atencionM.setVisible(false);
				lblNumero_movilM.setVisible(false);
				lblpasswordM.setVisible(false);
				
			}
		});
		btnModificar.setBounds(328, 46, 122, 23);
		contentPane.add(btnModificar);
		
		//---	Enviar Datos y hacer actualizaciones ------------------------------------------
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDireccion.setVisible(false);
				textEmail.setVisible(false);
				textNif.setVisible(false);
				textNombre.setVisible(false);
				textNumeroAtencion.setVisible(false);
				textNumeroEmpresa.setVisible(false);
				textPassword.setVisible(false);
				
				lblNombreM.setVisible(true);
				lblDireccionM.setVisible(true);
				lblEmailM.setVisible(true);
				lblNifM.setVisible(true);
				lblNumero_atencionM.setVisible(true);
				lblNumero_movilM.setVisible(true);
				lblpasswordM.setVisible(true);
				
				//Actualizacion datos
				String numeroEmpresaTxt = textNumeroEmpresa.getText();
				int numeroEmpresa=0;
				if (textNumeroEmpresa.getText() == "") {
					numeroEmpresaTxt = "0";
					numeroEmpresa = Integer.parseInt(numeroEmpresaTxt);
					if(numeroEmpresa == 0) {
						numeroEmpresa = empresa.getNumero_movil();
					}
				}else {
					try {
						numeroEmpresa = Integer.parseInt(numeroEmpresaTxt);
						
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Rellene los espacios Numero Atencion y Numero movil ");
					}
				}
				
				String AtencionTxt = textNumeroAtencion.getText();
				int AtencionEmpresa = Integer.parseInt(AtencionTxt);
				if(AtencionTxt == "") {
					AtencionTxt = "0";
					AtencionEmpresa = Integer.parseInt(AtencionTxt);
					if(AtencionEmpresa == 0) {
						AtencionEmpresa = empresa.getNumero_atencion();
					}else {
						try {
							AtencionEmpresa = Integer.parseInt(AtencionTxt);
							
						} catch (NumberFormatException e2) {
							// TODO: handle exception
							JOptionPane.showMessageDialog(null, "Rellene los espacios Numero Atencion y Numero movil ");
						}
					}
				}
				
				int id = empresa.getId();
				
				
				String nombreEmpresa = textNombre.getText();
				if(textNombre.getText() == "") {
					nombreEmpresa = empresa.getNombre();	
				}
				String nifEmpresa= textNif.getText();
				if(textNif.getText() == "") {
					nifEmpresa = empresa.getNif();	
				}
				String direccionEmpresa = textDireccion.getText();
				if(textDireccion.getText() == "") {
					direccionEmpresa = empresa.getDireccion();	
				}
				String emailEmpresa = textEmail.getText();
				if(textEmail.getText() == "") {
					emailEmpresa = empresa.getEmail();	
				}
				String passwordEmpresa = textPassword.getText() ;
				if(textPassword.getText() == "") {
					passwordEmpresa = empresa.getPassword();	
				}
				
				new modelo.Empresas().ActualizarEmpresa(nombreEmpresa, emailEmpresa, nifEmpresa, passwordEmpresa, direccionEmpresa, AtencionEmpresa, numeroEmpresa, id);
			}
		});
		btnAceptar.setVisible(false);
		btnAceptar.setBounds(463, 46, 142, 23);
		contentPane.add(btnAceptar);
		
		//---	Ocultar y cancelar ------------------------------------------
		
		JButton btnOcultar = new JButton("Ocultar / Cancelar");
		btnOcultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOcultar.setVisible(false);
				btnModificar.setVisible(false);
				btnAceptar.setVisible(false);
				
				lblDireccion.setVisible(false);
				lblEmail.setVisible(false);
				lblNif.setVisible(false);
				lblNumero_atencion.setVisible(false);
				lblNumero_movil.setVisible(false);
				lblpassword.setVisible(false);
				
				lblDireccionM.setVisible(false);
				lblEmailM.setVisible(false);
				lblNifM.setVisible(false);
				lblNumero_atencionM.setVisible(false);
				lblNumero_movilM.setVisible(false);
				lblpasswordM.setVisible(false);
				
				textDireccion.setVisible(false);
				textEmail.setVisible(false);
				textNif.setVisible(false);
				textNombre.setVisible(false);
				textNumeroAtencion.setVisible(false);
				textNumeroEmpresa.setVisible(false);
				textPassword.setVisible(false);
				
			}
		});
		btnOcultar.setVisible(false);
		btnOcultar.setBounds(463, 7, 142, 23);
		contentPane.add(btnOcultar);
//------------------- Mostrar Datos y botones --------------------------------------
		
		JButton btnMostrarDatos = new JButton("Mostrar Datos");
		btnMostrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOcultar.setVisible(true);
				btnModificar.setVisible(true);
				btnAceptar.setVisible(true);
				
				lblDireccion.setVisible(true);
				lblEmail.setVisible(true);
				lblNif.setVisible(true);
				lblNumero_atencion.setVisible(true);
				lblNumero_movil.setVisible(true);
				lblpassword.setVisible(true);
				
				lblNombreM.setVisible(true);
				lblDireccionM.setVisible(true);
				lblEmailM.setVisible(true);
				lblNifM.setVisible(true);
				lblNumero_atencionM.setVisible(true);
				lblNumero_movilM.setVisible(true);
				lblpasswordM.setVisible(true);
				
				
				
			}
		});
		btnMostrarDatos.setBounds(331, 7, 122, 23);
		contentPane.add(btnMostrarDatos);
		
		JButton btnNewButton = new JButton("Crear Evento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							vistaCrearEvento frame = new vistaCrearEvento();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(361, 274, 188, 48);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNombreEventoB = new JLabel("Nombre Evento:");
		lblNombreEventoB.setVisible(false);
		lblNombreEventoB.setBounds(20, 330, 100, 14);
		contentPane.add(lblNombreEventoB);
		
		textNombreEventoB = new JTextField();
		textNombreEventoB.setVisible(false);
		textNombreEventoB.setBounds(106, 327, 173, 20);
		contentPane.add(textNombreEventoB);
		textNombreEventoB.setColumns(10);
		
		JButton btnConfirmar = new JButton("OK");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombreEvento = textNombreEventoB.getText();
				new modelo.Eventos().BorrarEvento(nombreEvento);
				
				btnConfirmar.setVisible(false);
				lblNombreEventoB.setVisible(false);
				textNombreEventoB.setVisible(false);
				
				if(nombreEvento =="" ) {
					JOptionPane.showMessageDialog(null, "Escriba en el campo Nombre, el nombre del evento que desea borrar, correctamente.");
					btnConfirmar.setVisible(true);
					lblNombreEventoB.setVisible(true);
					textNombreEventoB.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, nombreEvento+" Ha sido borrado exitosamente");
				}
			}
		});
		btnConfirmar.setVisible(false);
		btnConfirmar.setBounds(289, 326, 54, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnBorrarEvento = new JButton("Borrar Evento");
		btnBorrarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNombreEventoB.setVisible(true);
				textNombreEventoB.setVisible(true);
				btnConfirmar.setVisible(true);
				
			}
		});
		btnBorrarEvento.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBorrarEvento.setBounds(10, 271, 188, 48);
		contentPane.add(btnBorrarEvento);
		
	}
}
