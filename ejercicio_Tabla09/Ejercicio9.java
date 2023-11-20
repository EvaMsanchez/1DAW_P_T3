package es.studium.ejercicio_Tabla09;

import java.util.Scanner;

public class Ejercicio9
{
	/* 2 DIMENSIONES - Realizar un programa que lea una tabla de 2 dimensiones 3x4 de caracteres. */

	public static void main(String[] args)
	{
		final int FILAS = 3; //Longitud que son los huecos.
		final int COLUMNAS = 4;
		
		char matriz [] []= new char [FILAS] [COLUMNAS]; //Matriz: primer número indica las filas,
													   // y el segundo número las columnas.
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<FILAS; i++)
		{
			for (int j=0; j<COLUMNAS; j++) //Se mete aquí y recorre el bucle entero, luego vuelve arriba.
			{
				System.out.println("Indique un carácter "+i+","+j);
				matriz [i] [j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		
		for (int i=0;i<FILAS;i++)
		{
			for (int j=0;j<COLUMNAS;j++)
			{
				System.out.print(" "+matriz[i][j]);
			}
			
		System.out.println(""); //Para hacer el salto de línea y luego sigue imprimiendo en la siguiente.
		}
	}
	
}
			
			

		

