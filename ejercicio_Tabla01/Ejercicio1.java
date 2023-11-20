package es.studium.ejercicio_Tabla01;

import java.util.Scanner;

public class Ejercicio1
{
	/* RELLENAR TABLA - Realizar un programa que lea los valores de una tabla de 4 enteros y luego los muestre por pantalla. */

	public static void main(String[] args)
	{
		int tabla [] = new int [4];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<tabla.length; i++)
		{
			System.out.println("Dame el número entero de la posición "+i);
			tabla[i] = teclado.nextInt();
		}
		
		for (int i=0; i<tabla.length; i++)
		{
			System.out.println("Valor de "+i+": "+tabla[i]);
		}
		teclado.close();
	}

}
