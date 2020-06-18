package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Login;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  ~ DISCOPUB ~\r\n");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBounds(185, 21, 204, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(57, 87, 60, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(57, 119, 79, 21);
		contentPane.add(lblNewLabel_2);
		
		textNombre = new JTextField();
		textNombre.setBounds(146, 88, 244, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(146, 120, 244, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		//Botones
		
		JButton btnIniciarCliente = new JButton("Iniciar Cliente");
		btnIniciarCliente.addMouseListener(new MouseAdapter() {
			//Accion al hacer click
			@Override
			public void mouseClicked(MouseEvent e) {
				// Llamar al controlador
				String nombreCliente = textNombre.getText();
				String passwordCliente = textPassword.getText();
				new controlador.Login().iniciarSesion(nombreCliente, passwordCliente);
			}
		});
		btnIniciarCliente.setBounds(68, 162, 181, 23);
		contentPane.add(btnIniciarCliente);
		
		JButton btnRegistrarCliente = new JButton("Registrarte\r\n como \r\nCliente");
		btnRegistrarCliente.addMouseListener(new MouseAdapter() {
			//Accion al hacer click
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegistroCliente frame = new RegistroCliente();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		btnRegistrarCliente.setBounds(68, 196, 181, 33);
		contentPane.add(btnRegistrarCliente);
		
		
		JButton btnRegistrarEmpresa = new JButton("Registrarte como Empresa");
		btnRegistrarEmpresa.addMouseListener(new MouseAdapter() {
			//Accion al hacer click
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRegistrarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegistroEmpresa frame = new RegistroEmpresa();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});

		
		btnRegistrarEmpresa.setBounds(259, 196, 209, 33);
		contentPane.add(btnRegistrarEmpresa);
		
		JButton btnIniciarEmpresa = new JButton("Iniciar Empresa");
		btnIniciarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreEmpresa = textNombre.getText();
				String passwordEmpresa = textPassword.getText();
				new controlador.Login().iniciarSesionEmpresa(nombreEmpresa, passwordEmpresa);
				
			}
		});
		btnIniciarEmpresa.setBounds(259, 162, 209, 23);
		contentPane.add(btnIniciarEmpresa);
	}
}
