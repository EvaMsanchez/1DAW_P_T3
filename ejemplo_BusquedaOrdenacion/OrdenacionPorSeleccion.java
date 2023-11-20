package es.studium.ejemplo_BusquedaOrdenacion;

import java.util.Scanner;

public class OrdenacionPorSeleccion
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		
		int tabla [] = new int [MAX];
		int i, j, aux, indice_menor;
		
		Scanner teclado = new Scanner (System.in);
		
		//insertar datos en la tabla
		for (i=0; i<MAX; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}
		
		//-1 para llegar a la posición 8 porque el último número no se compara con el siguiente
		//recorrer la tabla
		for (i=0; i<MAX-1; i++)
		{
			indice_menor = i; 
			
			for (j=i+1; j<MAX; j++)
			{
				if (tabla[j]<tabla[indice_menor])
				{
					indice_menor=j;
				}
			}
			
			aux=tabla[i];
			tabla[i]=tabla[indice_menor];
			tabla[indice_menor]=aux;
		}
		
		System.out.println("La tabla ordenada queda así: ");
		
		for (i=0; i<MAX; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
