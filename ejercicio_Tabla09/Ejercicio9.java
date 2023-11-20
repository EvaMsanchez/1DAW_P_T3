package es.studium.ejercicio_Tabla09;

import java.util.Scanner;

public class Ejercicio9
{
	/* 2 DIMENSIONES - Realizar un programa que lea una tabla de 2 dimensiones 3x4 de caracteres. */

	public static void main(String[] args)
	{
		final int FILAS = 3; //Longitud que son los huecos.
		final int COLUMNAS = 4;
		
		char matriz [] []= new char [FILAS] [COLUMNAS]; //Matriz: primer n�mero indica las filas,
													   // y el segundo n�mero las columnas.
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<FILAS; i++)
		{
			for (int j=0; j<COLUMNAS; j++) //Se mete aqu� y recorre el bucle entero, luego vuelve arriba.
			{
				System.out.println("Indique un car�cter "+i+","+j);
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
			
		System.out.println(""); //Para hacer el salto de l�nea y luego sigue imprimiendo en la siguiente.
		}
	}
	
}
			
			

		

