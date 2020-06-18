package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Metodos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class RegistroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textDni;
	private JTextField textEdad;


	
	public RegistroCliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulario de registro para Clientes\r\n");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel.setBounds(32, 11, 364, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(42, 68, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(109, 65, 202, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("email:");
		lblNewLabel_2.setBounds(42, 106, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textEmail = new JTextField();
		textEmail.setBounds(108, 103, 202, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("password:");
		lblNewLabel_3.setBounds(42, 142, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("telefono:");
		lblNewLabel_4.setBounds(42, 182, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 139, 202, 20);
		contentPane.add(passwordField);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(109, 179, 202, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Direccion");
		lblNewLabel_8.setBounds(182, 325, 72, 14);
		contentPane.add(lblNewLabel_8);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(48, 350, 331, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("DNI:");
		lblNewLabel_9.setBounds(42, 226, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		textDni = new JTextField();
		textDni.setBounds(109, 223, 202, 20);
		contentPane.add(textDni);
		textDni.setColumns(10);
		
		textEdad = new JTextField();
		textEdad.setBounds(109, 280, 86, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(42, 283, 46, 14);
		contentPane.add(lblEdad);
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				String dni = textDni.getText();
				String direccion = textDireccion.getText();
				String email = textEmail.getText();
				String password = passwordField.getText();
				
				//Pasamos los numero que hemos recogido como String a enteros
				
				String telefonoTxt = textTelefono.getText();
				int numero_movil = Integer.parseInt(telefonoTxt);
				String edadTxt = textEdad.getText();
				int edad = Integer.parseInt(edadTxt);
				
				new Metodos().enviarClienteBsd(nombre, edad, dni, direccion, numero_movil, email, password);
			}
		});
		btnEnviar.setBounds(165, 395, 89, 23);
		contentPane.add(btnEnviar);
		
		
	}
}

/*
		JButton btnCalcularEdad = new JButton("Calcular edad");
		btnCalcularEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String diatxt = textDia.getText();
				int diaN = Integer.parseInt(diatxt);
				String mestxt = textMes.getText();
				int mesN = Integer.parseInt(mestxt);
				String yeartxt = textYear.getText();
				
				
				
			}
		});
		btnCalcularEdad.setBounds(211, 282, 89, 23);
		contentPane.add(btnCalcularEdad);
 */