package es.studium.ejercicio_Cadena09;

import java.util.Scanner;

public class Ejercicio9
{
	/* SUBCADENA - Realizar un programa que lea una cadena, una posición y una longitud y mediante una función obtengamos
	   la subcadena que empieza en la posición dada y tiene longitud caracteres de la cadena original. */

	public static void main(String[] args)
	{
		String cadena;
		int posicion, longitud;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Escribe una posición: ");
		posicion = teclado.nextInt();
		System.out.println("Escribe una longitud: ");
		longitud = teclado.nextInt();
		teclado.close();
		
		if(cadena.length()<(posicion+longitud))
		{
			System.out.println("No es posible");
		}
		else
			
			System.out.println("La subcadena es: "+subcadena(cadena, posicion, longitud));
	}
	
		//Función.
		public static String subcadena (String cadena, int p, int l)
		{
			String subcadena;
			
			//subcadena
			subcadena = cadena.substring(p, p+l);
			
			return subcadena;
		}

		
		/* Otra forma de realizar el ejercicio
		
		String subcadena = "";
		
		for (int i = p; i<p+l; i++)
		{
			subcadena = subcadena + cadena.CharAt (i);
		}
		
		return subcadena;
		 
		*/
}
