package es.studium.ejemplo_BusquedaOrdenacion;

import java.util.Scanner;

public class BusquedaSecuencial
{
	//Búsqueda en una tabla NO ordenada.

	public static void main(String[] args)
	{
		final int MAX = 10;
		
		int tabla [] = new int [MAX];
		int i, elemento;
		boolean encontrado;
		
		Scanner teclado = new Scanner (System.in);
		
		//insertar datos en la tabla
		for (i=0; i<MAX; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}

		System.out.println("Dame el número a buscar: ");
		elemento = teclado.nextInt();
		teclado.close();
		
		//Bucle 
		encontrado = false;
		i=0;
		while ((!encontrado)&&(i<MAX))
		{
			if (tabla[i]==elemento)
			{
				encontrado=true;
			}
			else
			{
				i++;
			}
		}
		if (encontrado)
		{
			System.out.println("El elemento se encontró en la posición: "+i);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado");
		}
	}

}
