package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
        Calculadora calcu1= new Calculadora();
		
		double resultadoMultiplicacion=calcu1.multiplicar(4, 10);
		System.out.printf("Resultado Multiplicacion =" + resultadoMultiplicacion);

	}

}
