package es.studium.ejemplo_Cadena01;

public class PrimerEjemploCadena
{

	public static void main(String[] args)
	{
		String cadena;
		cadena = "Hola mundo!";
		System.out.println(cadena);
		System.out.println(cadena.length()); //cuenta la longitud de la cadena
		System.out.println(cadena.toUpperCase()); //pone toda en mayúscula
		System.out.println(cadena.charAt(1)); //que letra está en la posición 1
		System.out.println(cadena.charAt(11)); //no hay 11 sino del 0 al 10

	}

}
