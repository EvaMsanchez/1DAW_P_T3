package es.studium.ejercicio_Cadena11;

import java.util.Scanner;

public class Ejercicio11
{
	 /* COMPARAR - Realizar un programa que lea dos palabras y nos indique mediante 
	 una funci�n cu�l de las dos es mayor alfab�ticamente. */

	public static void main(String[] args)
	{
		String palabra1, palabra2 =
		null;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escriba una palabra: ");
		palabra1 = teclado.nextLine();
		System.out.println("Escriba una palabra: ");
		palabra1 = teclado.nextLine();
		teclado.close();
		
		if(palabra1.compareTo(palabra2)>0)
		{
			System.out.println("La palabra 1 es alfab�ticamente mayor que la palabra 2");
		}
		
		else if(palabra1.compareTo(palabra2)==0)
		{
			System.out.println("La palabra 1 es alfab�ticamente igual que la palabra 2");
		}
		
		else
		{
			System.out.println("La palabra 1 es alfab�ticamente menor que la palabra 2");
		}
	}

}
