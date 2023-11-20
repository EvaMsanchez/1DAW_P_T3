package es.studium.ejercicio_Cadena09;

import java.util.Scanner;

public class Ejercicio9
{
	/* SUBCADENA - Realizar un programa que lea una cadena, una posici�n y una longitud y mediante una funci�n obtengamos
	   la subcadena que empieza en la posici�n dada y tiene longitud caracteres de la cadena original. */

	public static void main(String[] args)
	{
		String cadena;
		int posicion, longitud;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Escribe una posici�n: ");
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
	
		//Funci�n.
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
