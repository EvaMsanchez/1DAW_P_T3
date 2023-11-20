package es.studium.ejercicio_Tabla08;

import java.util.Scanner;

public class Ejercicio8
{
	/* POSICIÓN MÁXIMO - Realizar un programa que lea 10 enteros y calcule el valor máximo y muestre su posición.
	   En el caso de que el máximo se repita, indicar todas las posiciones donde aparece. */

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla [] = new int [10];
		int maximo;
		
		Scanner teclado = new Scanner (System.in);
		
		//Pedir los valores al usuario
		for (int i=0; i<MAX; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		//Maximo
		maximo = tabla [0];
				
		for (int i=0; i<MAX; i++)
		{
			if (tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		System.out.println("El máximo vale "+maximo);
		System.out.println("Y se encuentra en las posiciónes siguientes:");
		
		//Mostrar posicion, si coincide con el máximo de arriba
		for (int i=0; i<MAX; i++)
		{
			if (tabla[i]==maximo)
			{
				System.out.println(i+1);
			}
		}
		
	}

}
