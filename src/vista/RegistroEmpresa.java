package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Metodos;

public class RegistroEmpresa extends JFrame {
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JTextField textTelefono;
	private JTextField textNif;
	private JTextField textNumero_atencion;
	private JTextField textDireccion;


	public RegistroEmpresa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormularioDeRegistro = new JLabel("Formulario de registro para Empresas\r\n");
		lblFormularioDeRegistro.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblFormularioDeRegistro.setBounds(37, 11, 364, 36);
		contentPane.add(lblFormularioDeRegistro);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(126, 72, 202, 20);
		contentPane.add(textNombre);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(37, 75, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(126, 110, 202, 20);
		contentPane.add(textEmail);
		
		JLabel lblNewLabel_2 = new JLabel("email:");
		lblNewLabel_2.setBounds(37, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password:");
		lblNewLabel_3.setBounds(37, 149, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 146, 202, 20);
		contentPane.add(passwordField);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(126, 177, 202, 20);
		contentPane.add(textTelefono);
		
		JLabel lblNewLabel_4 = new JLabel("telefono:");
		lblNewLabel_4.setBounds(37, 174, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblnif = new JLabel("NIF:");
		lblnif.setBounds(47, 258, 46, 14);
		contentPane.add(lblnif);
		
		textNif = new JTextField();
		textNif.setColumns(10);
		textNif.setBounds(126, 255, 202, 20);
		contentPane.add(textNif);
		
		textNumero_atencion = new JTextField();
		textNumero_atencion.setColumns(10);
		textNumero_atencion.setBounds(126, 217, 202, 20);
		contentPane.add(textNumero_atencion);
		
		JLabel lblNumero_atencion = new JLabel("Numero de atencion:");
		lblNumero_atencion.setBounds(10, 220, 106, 14);
		contentPane.add(lblNumero_atencion);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(172, 308, 72, 14);
		contentPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(38, 333, 331, 20);
		contentPane.add(textDireccion);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String nombre = textNombre.getText();
					String nif = textNif.getText();
					String direccion = textDireccion.getText();
					String email = textEmail.getText();
					String password = passwordField.getText();
					
					//Pasamos los numero que hemos recogido como String a enteros
					
					String telefonoTxt = textTelefono.getText();
					int numero_movil = Integer.parseInt(telefonoTxt);
					String numero_atencionTxt = textNumero_atencion.getText();
					int numero_atencion = Integer.parseInt(numero_atencionTxt);
					
					new Metodos().enviarEmpresaBsd(nombre, numero_atencion, nif, direccion, numero_movil, email, password);
			}
		});
		btnEnviar.setBounds(155, 382, 89, 23);
		contentPane.add(btnEnviar);
	}

}


