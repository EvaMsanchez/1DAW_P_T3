package es.studium.ejemplo_Cadena01;

public class PrimerEjemploCadena
{

	public static void main(String[] args)
	{
		String cadena;
		cadena = "Hola mundo!";
		System.out.println(cadena);
		System.out.println(cadena.length()); //cuenta la longitud de la cadena
		System.out.println(cadena.toUpperCase()); //pone toda en may�scula
		System.out.println(cadena.charAt(1)); //que letra est� en la posici�n 1
		System.out.println(cadena.charAt(11)); //no hay 11 sino del 0 al 10

	}

}
