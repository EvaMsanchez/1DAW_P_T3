package es.studium.ejercicio_Cadena02;

public class Ejercicio2
{
	/* RECORRE – Realizar un programa que, dada una cadena con todo el abecedario de la A a la Z en mayúsculas,
	   la recorra y muestre una a una las letras que la componen. */

	public static void main(String[] args)
	{
		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for (int i=0; i<abecedario.length(); i++)
		{
			System.out.println(abecedario.charAt(i));
		}
		
		for (int i=0; i<26; i++)
		{
			System.out.println(String.format("%d-->%c", i+65, i+65));
		}
	}

}
