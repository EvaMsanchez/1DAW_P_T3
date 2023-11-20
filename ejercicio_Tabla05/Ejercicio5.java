package es.studium.ejercicio_Tabla05;

import java.util.Scanner;

public class Ejercicio5
{
	/* CUADRADOS - Realizar un programa que lea un número por teclado y guarde en una tabla los cuadrados de los 10 números
	   siguientes al dado. Mostrarlos todos por pantalla. */

	public static void main(String[] args)
	{
		int numero;
		int tabla [] = new int [10];
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número:");
		numero = teclado.nextInt();
		teclado.close();
		
		for (int i=0; i<tabla.length; i++)
		{
			tabla[i] = (numero+1)*(numero+1);
			numero++;
		}
		
		for (int n: tabla)
		{
			System.out.println(n);
		}
		
		/*es lo mismo que:
		 
		for (int i=0; i<tablaEnteros.length; i++)
		{
			System.out.println(tabla[i]);
		}
		
		*/	
	}

}
