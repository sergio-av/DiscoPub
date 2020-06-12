package main;



import java.awt.EventQueue;

import bbdd.conexion;
import vista.Principal;


public class Main {

	public static void main(String[] args) {
		
		/*Realizamos la conexion con la Base de Datos que va ser 
		  constante en la aplicacion.*/
		conexion.Conectar();
		
		/* Llamamos a la vista principal.*/
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Principal frame = new Principal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}
}
