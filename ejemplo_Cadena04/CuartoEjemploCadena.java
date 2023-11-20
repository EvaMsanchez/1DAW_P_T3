package es.studium.ejemplo_Cadena04;

public class CuartoEjemploCadena
{

	public static void main(String[] args)
	{
		int edad = 28;
		String nombre = "Cristina";
		String cadenaFormateada = "Nuestra amiga %s tiene %d años";
		
		System.out.println(String.format(cadenaFormateada, nombre, edad));

		int a=5, b=3;
		String cadenaFormateada2 = "%d / %d = %.2f";
		
		System.out.println(String.format(cadenaFormateada2, a, b, (double)a/(double)b));
		
	}

}
