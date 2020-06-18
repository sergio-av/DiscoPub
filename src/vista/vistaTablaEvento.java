package vista;

import java.awt.BorderLayout;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Evento;

import javax.swing.JTable;


public class vistaTablaEvento extends JFrame {



	private JPanel contentPane;
	private JTable table;

	public vistaTablaEvento(ArrayList<Evento> eventos) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/* Crear la tabla con su modelo */
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		contentPane.add(table, BorderLayout.CENTER);
		/* Crear las columnas */
		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("Localizacion");
		dtm.addColumn("Aforo");
		dtm.addColumn("Entradas");
		/* Rellenar los datos con el array de alumnos */
		
		
			for(Evento evento : eventos) {
			Object[] fila = new Object[5];
			fila[0] ="ID: "+ evento.getId();
			fila[1] = "Nombre: "+evento.getNombre();
			fila[2] = "Localizacion: "+evento.getLocalizacion();
			fila[3] = "Aforo: "+evento.getAforo();
			fila[4] = "Entradas: "+ evento.getEntradas();
			dtm.addRow(fila);			
		
			}
		
		
		setVisible(true);
	}

}
