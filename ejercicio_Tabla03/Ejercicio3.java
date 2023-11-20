package es.studium.ejercicio_Tabla03;

public class Ejercicio3
{
	/* RELLENAR TABLA3 - Realizar un programa similar al anterior, pero que muestre los valores del último al primero. */

	public static void main(String[] args)
	{
		final int MAX = 20;
		int tabla [] = new int [MAX];
		
		for (int i=0; i<MAX; i++)
		{
			tabla [i] = i*2;
		}
		
		for (int i=MAX-1; i>=0; i--)
		{
			System.out.println(tabla[i]);
		}
	}

}
