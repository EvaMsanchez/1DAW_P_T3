package es.studium.ejercicio_Cadena10_1;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		String cadena;
		int longitud;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Escribe una posicion: ");
		longitud = teclado.nextInt();
		teclado.close();
		
		for (int i=cadena.length()-longitud; i<cadena.length(); i++)
		{
			System.out.print(cadena.charAt(i));
		}
			
	}

}
