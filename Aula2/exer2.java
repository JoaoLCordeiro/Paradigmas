import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer2
{
	public static void main (String args[]) throws IOException
	{
		double[] vetor_d = new double[10];
		int i;
		double soma = 0;
		
		Scanner teclado 	= new Scanner(System.in);

		System.out.println("Digite os valores:");

		for (i = 0 ; i < 10 ; i++)				//guarda as idades
		{
			vetor_d[i] = teclado.nextDouble();
			soma = soma + vetor_d[i];
		}

		System.out.println("A média foi:  "+(soma / 10));	//calcula a média e imprime
		System.out.println("");
		System.out.println("Idades acima da média:");

		for (i=0 ; i < 10 ; i++)				//imprime as idades acima da média
		{
			if (vetor_d[i] > (soma/10))
			{
				System.out.println(vetor_d[i]);
			}
		}

		System.out.println("");
		System.out.println("Idades abaixo da média:");

		for (i=0 ; i < 10 ; i++)				//imprime as idades abaixo da média
		{
			if (vetor_d[i] < (soma/10))
			{
				System.out.println(vetor_d[i]);
			}
		}						
	}
}

