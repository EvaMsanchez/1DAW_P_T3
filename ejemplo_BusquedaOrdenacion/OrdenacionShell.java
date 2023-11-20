package es.studium.ejemplo_BusquedaOrdenacion;

import java.util.Scanner;

public class OrdenacionShell
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		
		int tabla [] = new int [MAX];
		int i, salto, aux;
		boolean cambios;
		
		Scanner teclado = new Scanner (System.in);
		
		//insertar datos en la tabla
		for (i=0; i<MAX; i++)
		{
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}
		
		for (salto=MAX/2; salto!=0; salto=salto/2)
		{
			cambios = true;
			
			while (cambios==true)
			{
				cambios=false;
				
				for (i=salto; i<MAX; i++)
				{
					if (tabla[i-salto]>tabla[i])
					{
						aux=tabla[i];
						tabla[i]=tabla[i-salto];
						tabla[i-salto]=aux;
						cambios=true;
					}
				}
			}
		}
		
		System.out.println("La tabla ordenada queda así: ");
		
		for (i=0; i<MAX; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
