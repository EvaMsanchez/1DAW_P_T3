package es.studium.ejercicio_Tabla02;

public class Ejercicio2
{
	/* RELLENAR TABLA2 - Realizar un programa para crear una tabla de 20 elementos enteros de nombre “Pares”, 
	   la rellene con los primeros números pares y los muestre por pantalla. */

	public static void main(String[] args)
	{
		final int MAX = 20;
		int tabla [] = new int [MAX];
		
		for (int i=0; i<MAX; i++)
		{
			tabla [i] = i*2;
		}
		
		for (int numero: tabla)
		{
			System.out.println(numero);
		}
	}

}
