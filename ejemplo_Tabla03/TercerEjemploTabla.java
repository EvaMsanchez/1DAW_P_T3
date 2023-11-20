package es.studium.ejemplo_Tabla03;

import java.util.Scanner;

public class TercerEjemploTabla
{

	public static void main(String[] args)
	{
		String paises[] = {"Alemania", "Bélgica", "Canadá", "Dinamarca", "España", "Finlandia"};
		
		System.out.println("**Países**");
		
		//for (int i=0; i<paises.length; i++)
		for (String pais: paises)//solo para mostrar la información que hay dentro
		{
			System.out.println(pais);
		}
	
	}

}
