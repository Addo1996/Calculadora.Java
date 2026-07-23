package com.krakedev;

public class Calculadora {
	
	public double multiplicar(double valor1, double valor2) {
		double resultado = valor1*valor2;
		return resultado;
	}
	
	public double dividir(double valor1, double valor2) {
		double resultado = valor1/valor2;
		return resultado;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double resultado= (valor1 + valor2 + valor3)/3;
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	

}
