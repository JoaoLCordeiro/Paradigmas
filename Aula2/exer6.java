import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer6
{
	public static void main (String args[]) throws IOException
	{
		String frase = new String();
		int i, tamanho, palavras;

		BufferedReader teclado	= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite a sua frase :)");
		System.out.println("");

		frase    = teclado.readLine();

		tamanho  = frase.length();
		palavras = 1;

		if ((frase.charAt(0) == ' ') || (tamanho == 0))
		{
			System.out.println ("Frase inválida ou nula :(");
			return;
		}

		for (i = 0 ; i < tamanho ; i++)
		{
			if (frase.charAt(i) == ' ')
				palavras++;
		}

		System.out.println ("A frase contém "+palavras+" palavras :)");
	}
}

