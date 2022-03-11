import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer4
{
	public static void main (String args[]) throws IOException
	{
		String[] vetor_s = new String[10];
		String nome	 = new String();
		int i;
		boolean achou;

		BufferedReader teclado	= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite os nomes a serem guardados:");

		for (i = 0 ; i < 10 ; i++)					//guarda os nomes
		{
			vetor_s[i] = teclado.readLine();
		}

		System.out.println("Digite o nome a ser procurado:");
		nome	= teclado.readLine();

		achou 	= false;
		i 	= 0;
		while ((!achou)&&(i < 10))					//procura os nomes
		{
			if (vetor_s[i].equals(nome))
				achou = true;
			i++;	
		}

		if (achou)							//imprime se achou ou não
			System.out.println("O nome está na lista :)");
		else
			System.out.println("O nome não está na lista :(");
	}
}

