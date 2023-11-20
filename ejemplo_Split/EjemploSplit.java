package es.studium.ejemplo_Split;

public class EjemploSplit
{

	public static void main(String[] args)
	{
		String texto = "En un lugar de La Mancha ...";
		String tabla[] = texto.split(" "); //quitar lo que se ponga en el paréntesis. Cortar y quitar
		for (String cadena:tabla)
		{
			System.out.println(cadena);
		}
		
		String fecha = "23/11/2022";
		String tabla1[] = fecha.split("/"); 
		for (String cadena:tabla1)
		{
			System.out.println(cadena);
		}
		
	}

}
