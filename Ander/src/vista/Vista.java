package vista;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Vista  {
		public Ventana ventana = new Ventana();
		public Lineas panelLinea = new Lineas();
		public Paradas panelParada =new Paradas();
		
		public Vista() {
			mostrarPanel(panelLinea);
			ventana.setVisible(true);
		}

		public void mostrarPanel(JPanel panel) {
			ventana.setContentPane(panel);
		}
		
	}


