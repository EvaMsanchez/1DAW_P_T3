package es.studium.ejercicio_Tabla04;

public class Ejercicio4
{
	/* INICIALIZAR - Realizar un programa que defina una constante para definir el tamaño de un array de dimensión 3 y
	   utilizarla para cargar el array con ceros y visualizarlo en una fila. */

	public static void main(String[] args)
	{
		final int MAX = 3;
		int tabla [] = new int [MAX];
		
		for (int i=0; i<MAX; i++)
		{
			System.out.print(tabla[i] = 0); //print --> para ponerlo en una sola fila (println una por fila).
			//Otra forma de hacerlo: System.out.print(tabla[i]+" "); al declarar una tabla ya se le asignan los valores nulos o 0.
		}
	}

}
