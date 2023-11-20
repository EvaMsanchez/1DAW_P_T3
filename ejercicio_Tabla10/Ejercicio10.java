package es.studium.ejercicio_Tabla10;

public class Ejercicio10
{
	/* SUMA POSICI�N - Realizar un programa que en una tabla de 10x10 guarde en cada posici�n, la suma de los �ndices 
	   de dicha posici�n (fila + columna) y luego lo muestre por pantalla. */

	public static void main(String[] args)
	{
		final int FILAS = 10;
		final int COLUMNAS = 10;
		
		int tabla[][] = new int[FILAS][COLUMNAS];
		
		for (int i=0; i <FILAS; i++)
		{
			for (int j=0; j<COLUMNAS; j++)
			{
				tabla[i][j] = i+j;
			}
		}
		
		for (int i=0; i<FILAS; i++)
		{
			for (int j=0; j<COLUMNAS; j++)
			{
				System.out.print("\t "+tabla[i][j]); //\t --> tabulador.
			}
			
		System.out.println(""); //Hacer salto de l�nea.
		}
	}
	
}

