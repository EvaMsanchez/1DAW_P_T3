package es.studium.ejercicio_Cadena04;

import java.util.Scanner;

public class Ejercicio4
{
	/* CONCATENA - Realizar un programa que lea dos cadenas y las concatene en una tercera cadena que mostrará por pantalla. */

	public static void main(String[] args)
	{
		String cadena1, cadena2, concatenacion;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		concatenacion = cadena1+" "+cadena2;
		
		System.out.println(concatenacion);
	}

}
