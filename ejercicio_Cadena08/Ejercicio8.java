package es.studium.ejercicio_Cadena08;

import java.util.Scanner;

public class Ejercicio8
{
	/* BUSCAR POSICI�N - Realizar un programa que lea una frase y un car�cter y muestre la primera posici�n donde aparece
	   dicho car�cter por primera vez. */

	public static void main(String[] args)
	{
		String cadena;
		char caracter;
		int i=0;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Escribe una cadena:");
		cadena = teclado.nextLine();
		System.out.println("Escribe un car�cter:");
		caracter = teclado.nextLine().charAt(0);
		teclado.close();
		
		boolean encontrado=false;
		
		while((encontrado==false)&&(i<cadena.length()))
		{
			if (cadena.charAt(i)==caracter)
			{
				System.out.println("El car�cter encontrado est� en la posici�n: "+(i+1));
				encontrado=true;
			}
			
			i++;
		}
		if (!encontrado) //! --> NO encontrado
		{
			System.out.println("No encontrado");
		}
		
		//System.out.println("El car�cter encontrado est� en la posici�n: "+cadena.lastIndexOf(caracter)+1);
	}
	
}
	
