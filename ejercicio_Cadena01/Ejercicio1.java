package es.studium.ejercicio_Cadena01;

import java.util.Scanner;

public class Ejercicio1
{
	 /* NOMBRES - Realizar un programa que lea 5 nombres y los muestre por pantalla. */

	public static void main(String[] args)
	{
		String nombre1, nombre2, nombre3, nombre4, nombre5;
		
		Scanner teclado = new Scanner (System.in);
		
		nombre1 = teclado.nextLine();
		System.out.println("Escribe el segundo nombre:");
		nombre2 = teclado.nextLine();
		System.out.println("Escribe el tercer nombre:");
		nombre3 = teclado.nextLine();
		System.out.println("Escribe el cuarto nombre:");
		nombre4 = teclado.nextLine();
		System.out.println("Escribe el quinto nombre:");
		nombre5 = teclado.nextLine();
		teclado.close();
		
		System.out.println(nombre1);
		System.out.println(nombre2);
		System.out.println(nombre3);
		System.out.println(nombre4);
		System.out.println(nombre5);

		System.out.println(String.format("%s %s %s %s %s", nombre1,  nombre2, nombre3, nombre4, nombre5));
	}

}
