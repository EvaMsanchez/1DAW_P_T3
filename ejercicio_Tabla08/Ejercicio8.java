package es.studium.ejercicio_Tabla08;

import java.util.Scanner;

public class Ejercicio8
{
	/* POSICI�N M�XIMO - Realizar un programa que lea 10 enteros y calcule el valor m�ximo y muestre su posici�n.
	   En el caso de que el m�ximo se repita, indicar todas las posiciones donde aparece. */

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla [] = new int [10];
		int maximo;
		
		Scanner teclado = new Scanner (System.in);
		
		//Pedir los valores al usuario
		for (int i=0; i<MAX; i++)
		{
			System.out.println("Dame un n�mero entero: ");
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
		
		System.out.println("El m�ximo vale "+maximo);
		System.out.println("Y se encuentra en las posici�nes siguientes:");
		
		//Mostrar posicion, si coincide con el m�ximo de arriba
		for (int i=0; i<MAX; i++)
		{
			if (tabla[i]==maximo)
			{
				System.out.println(i+1);
			}
		}
		
	}

}
