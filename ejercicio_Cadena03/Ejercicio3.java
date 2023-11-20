package es.studium.ejercicio_Cadena03;

import java.util.Scanner;

public class Ejercicio3
{
	/* COMPARA - Realizar un programa que compare dos cadenas dadas por teclado. Se nos mostrará un mensaje indicando
	   cuál de las dos es mayor o si son iguales, con respecto a su longitud. */

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe una cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe otra cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		
		if (cadena1.length()==cadena1.length()) //Para comparar la longitud (número de carácteres) no contenido.
		{
			System.out.println("Tienen la misma longitud");
		}
		  	else if (cadena1.length()<cadena2.length())
			{
				System.out.println("La primera cadena es más corta");
			}
		  		else
		  		{
		  			System.out.println("La segunda cadena es más corta");
		  		}
	}

}
