package es.studium.ejercicio_Tabla07;

import java.util.Scanner;

public class Ejercicio7
{
	/* M�XIMO, M�NIMO, MEDIA - Realizar un programa que lea 10 n�meros y calcule la media, el m�ximo y el m�nimo
	   de los n�meros introducidos. */

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla [] = new int [MAX];
		int minimo, maximo;
		float media;
		
		Scanner teclado = new Scanner (System.in);
		
		//Pedir los valores al usuario.
		for (int i=0; i<MAX; i++)
		{
			System.out.println("Dame un n�mero entero: ");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		//Tratamiento de los valores:
		//Minimo.
		minimo = tabla [0];
		
		for (int i=0; i<MAX; i++)
		{
			if (tabla[i]<minimo)
			{
				minimo = tabla[i];
			}
		}
		
		//Maximo.
		maximo = tabla [0];
		
		for (int i=0; i<MAX; i++)
		{
			if (tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		//Media.
		int suma = 0;
		
		for (int i=0; i<MAX; i++)
		{
			suma = suma + tabla[i];
		}
		media = (float)suma / (float)MAX;
		

		//Resultados.
		System.out.println("El m�nimo vale "+minimo);
		System.out.println("El m�ximo vale "+maximo);
		System.out.println("La media vale "+media);
	}

}
