package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private static final long serialVersionUID = 1L;

	public static final String BOTON1 = "1";
	public static final String BOTON2 = "2";
	public static final String BOTON3 = "3";
	public static final String BOTON4 = "4";
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;

	public PanelBotones() {
		setLayout(new GridLayout(2, 2));

		this.boton1 = new JButton("1");
		this.boton1.setFont(new Font("Arial", 0, 35));
		this.boton1.setActionCommand(this.BOTON1);

		this.boton2 = new JButton("2");
		this.boton2.setFont(new Font("Arial", 0, 35));
		this.boton2.setActionCommand(this.BOTON2);

		this.boton3 = new JButton("3");
		this.boton3.setFont(new Font("Arial", 0, 35));
		this.boton3.setActionCommand(this.BOTON3);

		this.boton4 = new JButton("4");
		this.boton4.setFont(new Font("Arial", 0, 35));
		this.boton4.setActionCommand(this.BOTON4);

		add(this.boton1);
		add(this.boton2);
		add(this.boton3);
		add(this.boton4);

	}

	public JButton getBoton1() {
		return this.boton1;
	}

	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}

	public JButton getBoton2() {
		return this.boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public JButton getBoton3() {
		return this.boton3;
	}

	public void setBoton3(JButton boton3) {
		this.boton3 = boton3;
	}

	public JButton getBoton4() {
		return this.boton4;
	}

	public void setBoton4(JButton boton4) {
		this.boton4 = boton4;
	}
}
