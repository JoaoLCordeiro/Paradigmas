import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer1
{
	public static void main (String args[]) throws IOException
	{
		String[] vetor_s = new String[5];
		int i;

		BufferedReader teclado	= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite os nomes a serem sorteados:");

		for (i = 0 ; i < 5 ; i++)					//guarda os nomes que serão sorteados
		{
			vetor_s[i] = teclado.readLine();
		}

		i = (int)(Math.random()*5);					//sorteia

		System.out.println("O sorteado foi:  "+vetor_s[i]);		//imprime o nome vencedor do sorteio
	}
}

