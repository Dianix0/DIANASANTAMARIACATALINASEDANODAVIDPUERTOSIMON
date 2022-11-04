package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelTerminar extends JPanel {

	private static final long serialVersionUID = 1L;

	public static final String TERMINAR = "terminar";
	private JButton terminar;

	public PanelTerminar() {
		this.terminar = new JButton("Terminar");
		this.terminar.setFont(new Font("Arial", Font.BOLD, 15));
		this.terminar.setActionCommand(this.TERMINAR);
		add(this.terminar);
	}

	public JButton getTerminar() {
		return this.terminar;
	}

	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}

}
