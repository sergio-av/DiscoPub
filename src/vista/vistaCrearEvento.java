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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaCrearEvento extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textAforo;
	private JTextField textPrecio;
	private JTextField textEntradas;
	private JTextField textLocalizacion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public vistaCrearEvento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitulo = new JLabel("Crear Evento");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbltitulo.setBounds(172, 0, 108, 39);
		contentPane.add(lbltitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 44, 58, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(78, 41, 190, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblAforo = new JLabel("Aforo: ");
		lblAforo.setBounds(10, 80, 58, 14);
		contentPane.add(lblAforo);
		
		textAforo = new JTextField();
		textAforo.setBounds(78, 77, 70, 20);
		contentPane.add(textAforo);
		textAforo.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 122, 46, 14);
		contentPane.add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(78, 119, 70, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblEntradas = new JLabel("Entradas:");
		lblEntradas.setBounds(10, 165, 58, 14);
		contentPane.add(lblEntradas);
		
		textEntradas = new JTextField();
		textEntradas.setBounds(78, 165, 70, 20);
		contentPane.add(textEntradas);
		textEntradas.setColumns(10);
		
		JLabel lblLocalizacion = new JLabel("Localizaci\u00F3n: ");
		lblLocalizacion.setBounds(10, 213, 63, 14);
		contentPane.add(lblLocalizacion);
		
		textLocalizacion = new JTextField();
		textLocalizacion.setBounds(78, 210, 190, 20);
		contentPane.add(textLocalizacion);
		textLocalizacion.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = textNombre.getText();
				String localizacion = textLocalizacion.getText();
				
				
				//Pasamos los numero que hemos recogido como String a enteros
				
				String aforoTxt = textAforo.getText();
				int aforo = Integer.parseInt(aforoTxt);
				String entradasTxt = textEntradas.getText();
				int entradas = Integer.parseInt(entradasTxt);
				String precioTxt = textPrecio.getText();
				int precio = Integer.parseInt(precioTxt);
				
				new Metodos().enviarEventoBsd( nombre,  aforo,  localizacion,  entradas ,  precio);
			}
		});
		btnAceptar.setBounds(309, 209, 89, 23);
		contentPane.add(btnAceptar);
	}
}
