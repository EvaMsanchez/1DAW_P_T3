package es.studium.ejercicio_Tabla06;

import java.util.Scanner;

public class Ejercicio6
{
	/* CONTADOR - Realizar un programa que vaya leyendo enteros hasta introducir un 0. El programa ir� contando en una tabla
	   los positivos y los negativos. Tras pulsar el 0, se mostrar� por pantalla el resultado de la cuenta. */

	public static void main(String[] args)
	{
		int numero;
		int contadores [] = new int [2];
		
		Scanner teclado = new Scanner (System.in);
		
		do
		{
			System.out.println("Dame un n�mero:");
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
		
		System.out.println("Hay "+contadores [0]+" n�meros positivos.");
		System.out.println("Hay "+contadores [1]+" n�meros negativos."); //en vez de else if: (contadores [1]-1) 
	}

}
