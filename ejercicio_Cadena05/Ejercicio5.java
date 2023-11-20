package es.studium.ejercicio_Cadena05;

import java.util.Scanner;

public class Ejercicio5
{
	/* MAYÚSCULAS–MINÚSCULAS - Realizar un programa que lea una cadena con letras mayúsculas y minúsculas intercaladas y
	   la muestre todo en mayúsculas y todo en minúsculas. */

	public static void main(String[] args)
	{
		String cadena1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena:");
		cadena1 = teclado.nextLine();
		teclado.close();
		
		System.out.println("Palabra en mayuscula: "+mayuscula(cadena1));
		System.out.println("Palabra en minuscula: "+minuscula(cadena1));
	}

	//Función pasar a mayúscula.
	public static String mayuscula(String c1)
	{
		return (c1.toUpperCase());
	}
	
	//Función pasar a minúscula.
	public static String minuscula(String c1)
	{
		return (c1.toLowerCase());
	}
	
}
