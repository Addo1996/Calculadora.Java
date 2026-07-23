package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
        Calculadora calcu1= new Calculadora();
		
		double resultadoMultiplicacion=calcu1.multiplicar(4, 10);
		System.out.printf("Resultado Multiplicacion =" + resultadoMultiplicacion);
		
		double resultadoDivision=calcu1.dividir(10 , 2 );
		System.out.println("Resultado Divicion =" + resultadoDivision);
		
		double resultadoPromediar=calcu1.promediar(10, 6, 8);
		System.out.println("Promedio =" + resultadoPromediar);
		
		calcu1.mostrarResultado();
		
	}

}
