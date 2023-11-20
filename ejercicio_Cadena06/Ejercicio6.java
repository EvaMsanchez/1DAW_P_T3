package es.studium.ejercicio_Cadena06;

import java.util.Scanner;

public class Ejercicio6
{
	/* IGUALDAD - Realizar un programa que lea dos cadenas por teclado y nos diga si son iguales o no. */

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		if (cadena1.equals(cadena2)) //== solo para int, double, char, NO string. Compara el CONTENIDO, no el número de carácter.
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
	}

}
