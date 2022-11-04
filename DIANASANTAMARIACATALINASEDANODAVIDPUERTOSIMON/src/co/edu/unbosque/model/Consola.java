package co.edu.unbosque.model;

import java.awt.event.ActionEvent;

public class Consola {
	private String[] numeros;
	private int i;
	private String botones[];
	
	public Consola() {
		this.numeros = new String[4];
		this.botones = new String[4];
		crearArreglo();
	}
	public String generarNumeroAleatorio() {
		String num = String.valueOf((int)(Math.random()*4+1));
		return num;
	}
	
	public void crearArreglo() {
		int i;
		for ( i = 0; i < this.numeros.length; i++) {
			this.numeros[i] = generarNumeroAleatorio();
		}
	}
	
	public void guardarBotones(ActionEvent e, String boton1, String boton2, String boton3, String boton4) {
		if(this.i < 4) {
			if (e.getActionCommand().equals(boton1)) {
				this.botones[this.i] = "1";
			} if (e.getActionCommand().equals(boton2)) {
				this.botones[this.i] = "2";
			} if (e.getActionCommand().equals(boton3)) {
				this.botones[this.i] = "3";
			} if (e.getActionCommand().equals(boton4)) {
				this.botones[this.i] = "4";
			}
			this.i++;
		}
	}
	
	public String[] getNumeros() {
		return this.numeros;
	}
	public void setNumeros(String[] numeros) {
		this.numeros = numeros;
	}
	public String[] getBotones() {
		return this.botones;
	}
	public void setBotones(String[] botones) {
		this.botones = botones;
	}
	
	
	
}
