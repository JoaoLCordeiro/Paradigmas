import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class exer5
{
	public static void main (String args[]) throws IOException
	{
		double[][] matriz_a = new double[3][3];				//declaração de variáveis
		double[][] matriz_b = new double[3][3];
		double[][] matriz_c = new double[3][3];
		int i,j;
		
		Scanner teclado 	= new Scanner(System.in);

		System.out.println("Somando matrizes 3x3 :)");
		System.out.println("");
		System.out.println("Digite os valores da primeira matriz:");

		for (i = 0 ; i < 3 ; i++)					//pega a matriz a e ja vai adicionando ela à matriz c
		{
			for (j = 0 ; j < 3 ; j++)
			{
				matriz_a[i][j] = teclado.nextDouble();
				matriz_c[i][j] = matriz_a[i][j];
			}
		}							

		System.out.println("");
		System.out.println("Digite os valores da segunda matriz:");

		for (i = 0 ; i < 3 ; i++)					//pega a matriz b e ja vai adicionando ela à matriz c
		{
			for (j = 0 ; j < 3 ; j++)
			{
				matriz_b[i][j] = teclado.nextDouble();
				matriz_c[i][j] += matriz_b[i][j];
			}
		}							

		System.out.println("");
		System.out.println("Resultados:");
		System.out.println("");

		for (i=0 ; i < 3 ; i++)						//imprime os resultados
		{
			for (j = 0 ; j < 3 ; j++)				//imprime a matriz a
				System.out.print(matriz_a[i][j]+"	");

			if (i == 1)						//sinal de soma
				System.out.print("+	");
			else
				System.out.print("	");

			for (j = 0 ; j < 3 ; j++)				//imprime a matriz b
				System.out.print(matriz_b[i][j]+"	");

			if (i == 1)						//sinal de igualdade
				System.out.print("=	");
			else
				System.out.print("	");

			for (j = 0 ; j < 3 ; j++)				//imprime a matriz c
				System.out.print(matriz_c[i][j]+"	");

			System.out.println("");					//pula linha
		}						
	}
}

