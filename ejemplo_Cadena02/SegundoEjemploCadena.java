package es.studium.ejemplo_Cadena02;

import java.util.Scanner;

public class SegundoEjemploCadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		
		String nombre, primerApellido, segundoApellido;
		String nombreCompleto;
		
		System.out.println("Dame tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Dame tu primer apellido");
		primerApellido = teclado.nextLine();
		System.out.println("Dame tu segundo apellido");
		segundoApellido = teclado.nextLine();
		teclado.close();
		
		nombreCompleto = nombre+" "+primerApellido+" "+segundoApellido;
		
		System.out.println("Tu nombre completo es "+nombreCompleto);
		
		for (int i = 0; i<nombreCompleto.length(); i+=2)
		{
			System.out.print(nombreCompleto.charAt(i));
			if(i<nombreCompleto.length()-1)
			{
				System.out.println(nombreCompleto.charAt(i+1));
			}
		}

	}

}
