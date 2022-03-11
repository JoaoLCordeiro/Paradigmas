import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer5
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("Digite a string :)");
		System.out.println("");

		int i, tam;
		String string		= new String();

		BufferedReader teclado	= new BufferedReader(new InputStreamReader(System.in));	//lê a string desejada
		string			= teclado.readLine();					
	
		tam = string.length();

		System.out.println("");

		for (i = tam-1 ; i >= 0 ; i--)							//imprime, caractere por caractere, inversamente
		{
			System.out.print (string.charAt(i));
		}

		System.out.println("");
	}
}

