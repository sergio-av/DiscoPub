package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vistaCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaCliente frame = new vistaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaCliente() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(10, 11, 53, 22);
		contentPane.add(lblUsuario);
		
		JLabel lblNombre = new JLabel("New label");
		lblNombre.setBounds(100, 15, 113, 14);
		contentPane.add(lblNombre);
		
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setVisible(false);
		lblEmail.setBounds(10, 55, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNumeroMovil = new JLabel("Numero movil:");
		lblNumeroMovil.setVisible(false);
		lblNumeroMovil.setBounds(10, 80, 94, 14);
		contentPane.add(lblNumeroMovil);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setVisible(false);
		lblDireccion.setBounds(10, 105, 68, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setVisible(false);
		lblPassword.setBounds(10, 130, 68, 14);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Edad: ");
		lblNewLabel.setVisible(false);
		lblNewLabel.setBounds(10, 155, 53, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMEmail = new JLabel("New label");
		lblMEmail.setVisible(false);
		lblMEmail.setBounds(100, 55, 113, 14);
		contentPane.add(lblMEmail);
		
		JLabel lblMNumero_movil = new JLabel("New label");
		lblMNumero_movil.setVisible(false);
		lblMNumero_movil.setBounds(100, 80, 113, 14);
		contentPane.add(lblMNumero_movil);
		
		JLabel lblMDireccion = new JLabel("New label");
		lblMDireccion.setVisible(false);
		lblMDireccion.setBounds(100, 105, 113, 14);
		contentPane.add(lblMDireccion);
		
		JLabel lblMPassword = new JLabel("New label");
		lblMPassword.setVisible(false);
		lblMPassword.setBounds(100, 130, 113, 14);
		contentPane.add(lblMPassword);
		
		JLabel lblMEdad = new JLabel("New label");
		lblMEdad.setVisible(false);
		lblMEdad.setBounds(100, 155, 113, 14);
		contentPane.add(lblMEdad);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setVisible(false);
		btnModificar.addMouseListener(new MouseAdapter() {
			
			//Visibilidad
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(293, 46, 108, 23);
		contentPane.add(btnModificar);
		
		JButton btnDatos = new JButton("Mostar datos");
		btnDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnModificar.setVisible(true);
					lblNombre.setVisible(true);
					lblDireccion.setVisible(true);
					lblPassword.setVisible(true);
					lblNewLabel.setVisible(true);
					lblNumeroMovil.setVisible(true);
					lblPassword.setVisible(true);
					lblEmail.setVisible(true);
	
			}
		});
		btnDatos.setBounds(236, 11, 108, 23);
		contentPane.add(btnDatos);
		
		/* 
		 * En el boton btnAceptarOcultar es el boton que se usara, aparte de ocultar nuestra informacion personal 
		 * para enviar la informacion actualizada a la base de datos con la nueva informacion del usuario.
		 * Esta modificaciones se pueden hacer una vez se ha pulsado el boton modificar.
		 */
		
		JButton btnAceptarOcultar = new JButton("Ocultar/Aceptar");
		btnAceptarOcultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnModificar.setVisible(false);
				lblNombre.setVisible(false);
				lblDireccion.setVisible(false);
				lblPassword.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNumeroMovil.setVisible(false);
				lblPassword.setVisible(false);
				lblEmail.setVisible(false);
			}
			
		});
		btnAceptarOcultar.setBounds(354, 11, 108, 23);
		contentPane.add(btnAceptarOcultar);
		
	}
}
