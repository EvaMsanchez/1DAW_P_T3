package es.studium.ejemplo_Tabla03;

import java.util.Scanner;

public class TercerEjemploTabla
{

	public static void main(String[] args)
	{
		String paises[] = {"Alemania", "B�lgica", "Canad�", "Dinamarca", "Espa�a", "Finlandia"};
		
		System.out.println("**Pa�ses**");
		
		//for (int i=0; i<paises.length; i++)
		for (String pais: paises)//solo para mostrar la informaci�n que hay dentro
		{
			System.out.println(pais);
		}
	
	}

}
