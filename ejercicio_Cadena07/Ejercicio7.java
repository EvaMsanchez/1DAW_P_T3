package es.studium.ejercicio_Cadena07;

import java.util.Scanner;

public class Ejercicio7
{
	/* LONGITUD - Realizar un programa que lea una frase por teclado e indique mediante una función, la longitud de la misma,
	   incluidos los espacios y sin incluir. */

	public static void main(String[] args)
	{
		String cadena1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.nextLine();
		teclado.close();
		
		System.out.println("Longitud con espacios: "+longitud1(cadena1));
		System.out.println("Longitud sin espacios: "+longitud2(cadena1));
	}

	public static int longitud1(String c1)
	{
		return (c1.length());
	}
	
	public static int longitud2(String c1)
	{
		int contadorEspacios=0;
		
		for (int i=0; i<c1.length(); i++)
		{
			if (c1.charAt(i)!=' ')
			{
				contadorEspacios++;  //También se puede hacer así: c1.replace(" ","").length());
			}
		}
		
		 return contadorEspacios++;
	}
	
}
