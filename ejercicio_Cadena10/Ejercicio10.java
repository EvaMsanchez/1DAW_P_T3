package es.studium.ejercicio_Cadena10;

import java.util.Scanner;

public class Ejercicio10
{
	/* SUBCADENA2 – Realizar un programa que obtenga la parte derecha de una cadena de caracteres indicando la cadena y
	   un valor numérico entero que nos dirá cuántos caracteres debemos obtener desde el final de la cadena. */

	public static void main(String[] args)
	{
		String cadena;
		int posicion;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Escribe una cadena:");
		cadena = teclado.nextLine();
		System.out.println("Indique un valor numérico:");
		posicion = teclado.nextInt();
		teclado.close();
		
		System.out.println(cadena.substring((cadena.length()-posicion),cadena.length()));  //Coge un trozo de la cadena.
																						  //Indicar los dos valores, separados por coma.
																						 //El largo menos la posición que le damos, empieza a contar desde el principio pero coge los 4 últimos.
	}

}
