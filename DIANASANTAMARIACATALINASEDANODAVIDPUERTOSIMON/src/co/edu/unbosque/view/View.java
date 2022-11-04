package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	private PanelBotones pb;
	private PanelNumeros pn;
	private PanelTerminar pt;
	
	public View (Controller c, String num1, String num2, String num3, String num4) {
		setSize(400, 400);
		setResizable(false);
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		this.pb = new PanelBotones();
		this.pn = new PanelNumeros(num1, num2, num3, num4);
		this.pt = new PanelTerminar();
		
		add(this.pn, BorderLayout.NORTH);
		add(this.pb, BorderLayout.CENTER);
		add(this.pt, BorderLayout.SOUTH);
		
		this.pb.getBoton1().addActionListener(c);
		this.pb.getBoton2().addActionListener(c);
		this.pb.getBoton3().addActionListener(c);
		this.pb.getBoton4().addActionListener(c);
		this.pt.getTerminar().addActionListener(c);
	}
	
	public void mostrarDatoCorrecto(String pDato) {
		JOptionPane.showMessageDialog(this.pb, pDato, null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarDatoError(String pDato) {
		JOptionPane.showMessageDialog(this.pb, pDato, null, JOptionPane.ERROR_MESSAGE);
	}

	public PanelBotones getPb() {
		return this.pb;
	}

	public void setPb(PanelBotones pb) {
		this.pb = pb;
	}

	public PanelNumeros getPn() {
		return this.pn;
	}

	public void setPn(PanelNumeros pn) {
		this.pn = pn;
	}

	public PanelTerminar getPt() {
		return this.pt;
	}

	public void setPt(PanelTerminar pt) {
		this.pt = pt;
	}
	
	
}
