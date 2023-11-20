package es.studium.ejercicio_Tabla06;

import java.util.Scanner;

public class Ejercicio6
{
	/* CONTADOR - Realizar un programa que vaya leyendo enteros hasta introducir un 0. El programa irá contando en una tabla
	   los positivos y los negativos. Tras pulsar el 0, se mostrará por pantalla el resultado de la cuenta. */

	public static void main(String[] args)
	{
		int numero;
		int contadores [] = new int [2];
		
		Scanner teclado = new Scanner (System.in);
		
		do
		{
			System.out.println("Dame un número:");
			numero = teclado.nextInt();
			
			if (numero>0)
			{
				contadores [0] ++; 
			}
			else if (numero<0)
			{
				contadores [1] ++;
			}
		}while (numero!=0);
		
		teclado.close();
		
		System.out.println("Hay "+contadores [0]+" números positivos.");
		System.out.println("Hay "+contadores [1]+" números negativos."); //en vez de else if: (contadores [1]-1) 
	}

}
