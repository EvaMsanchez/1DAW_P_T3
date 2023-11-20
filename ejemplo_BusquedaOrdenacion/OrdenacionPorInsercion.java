package es.studium.ejemplo_BusquedaOrdenacion;

import java.util.Scanner;

public class OrdenacionPorInsercion
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		
		int tabla [] = new int [MAX];
		int i, j, aux;
		
		Scanner teclado = new Scanner (System.in);
		
		//insertar datos en la tabla
		for (i=0; i<MAX; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}
		
		for (i=0; i<MAX; i++)
		{
			j = i;
			aux = tabla[i];
			
			while ((j>0)&&(aux<tabla[j-1]))
			{
				tabla[j] = tabla[j-1];
				j = j-1;
			}
			
			tabla[j] = aux;
		}
		
		System.out.println("La tabla ordenada queda así: ");
		
		for (i=0; i<MAX; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
