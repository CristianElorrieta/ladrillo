package vista;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lineas extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnNewButton =new JButton("mostrar lineas");
	private JTextArea textAreaLineas;
	public Lineas() {
		setLayout(null);
		
		textAreaLineas = new JTextArea();
		textAreaLineas.setBounds(66, 67, 318, 181);
		add(textAreaLineas);
		
		
		btnNewButton.setBounds(10, 259, 111, 23);
		add(btnNewButton);

	}
	public void MostrarLineas(String lineas) {
		textAreaLineas.append(lineas);
	}
	
	
	
}
