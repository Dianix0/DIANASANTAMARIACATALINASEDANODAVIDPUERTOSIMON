package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import co.edu.unbosque.model.Consola;
import co.edu.unbosque.view.View;

public class Controller extends TimerTask implements ActionListener {
	private View v;
	private Consola cl;
		
	public Controller() {
		this.cl = new Consola();
		this.v = new View(this, this.cl.getNumeros()[0], this.cl.getNumeros()[1], this.cl.getNumeros()[2],
				this.cl.getNumeros()[3]);
		this.v.setVisible(true);
		
		Timer t = new Timer();
		t.schedule(this, 2000);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cl.guardarBotones(e, v.getPb().BOTON1, v.getPb().BOTON2, v.getPb().BOTON3, v.getPb().BOTON4);
		if (e.getActionCommand().equals(this.v.getPt().TERMINAR)) {
			comprobar();
			this.v.dispose();
		}
	}
	
	public void comprobar() {
		if (cl.getBotones()[0].equals(this.cl.getNumeros()[0]) && cl.getBotones()[1].equals(this.cl.getNumeros()[1]) && cl.getBotones()[2].equals(this.cl.getNumeros()[2]) && cl.getBotones()[3].equals(this.cl.getNumeros()[3])) {
			this.v.mostrarDatoCorrecto("Secuencia exitosa!");
		} else {
			this.v.mostrarDatoError("Fallaste!");
		}
	}

	@Override
	public void run() {
		this.v.getPn().getTexto().setText(" ");

		this.v.getPn().getNumero1().setVisible(false);

		this.v.getPn().getNumero2().setVisible(false);

		this.v.getPn().getNumero3().setVisible(false);

		this.v.getPn().getNumero4().setVisible(false);
	}

}
