package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNumeros extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel texto;
	private JLabel numero1;
	private JLabel numero2;
	private JLabel numero3;
	private JLabel numero4;

	public PanelNumeros(String num1, String num2, String num3, String num4) {
		this.texto = new JLabel("Numero: ");
		this.texto.setFont(new Font("Arial", Font.BOLD, 17));

		this.numero1 = new JLabel(num1);
		this.numero1.setFont(new Font("Arial", Font.BOLD, 15));

		this.numero2 = new JLabel(num2);
		this.numero2.setFont(new Font("Arial", Font.BOLD, 15));

		this.numero3 = new JLabel(num3);
		this.numero3.setFont(new Font("Arial", Font.BOLD, 15));

		this.numero4 = new JLabel(num4);
		this.numero4.setFont(new Font("Arial", Font.BOLD, 15));

		add(this.texto);
		add(this.numero1);
		add(this.numero2);
		add(this.numero3);
		add(this.numero4);
	}

	public JLabel getNumero1() {
		return numero1;
	}

	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}

	public JLabel getNumero2() {
		return numero2;
	}

	public void setNumero2(JLabel numero2) {
		this.numero2 = numero2;
	}

	public JLabel getNumero3() {
		return numero3;
	}

	public void setNumero3(JLabel numero3) {
		this.numero3 = numero3;
	}

	public JLabel getNumero4() {
		return numero4;
	}

	public void setNumero4(JLabel numero4) {
		this.numero4 = numero4;
	}

	public JLabel getTexto() {
		return this.texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

}
