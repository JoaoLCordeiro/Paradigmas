//Exercício 1 da lista de Tipos Genéricos

import java.util.*;
import java.io.*;

class Vetor
{
	public <T extends Comparable<T>> void ordenaVetor (Vector<T> vetor)
	{

		int n = vetor.size();							//pega o tamanho do vector

		int i, j;

		T temp;

		for (i = 0 ; i < n-1 ; i++)						//ordena o vetor usando Bubble Sort
		{
			for (j = 0 ; j < n - 1 - i ; j++)
			{
				if (vetor.elementAt(j).compareTo(vetor.elementAt(j+1)) > 0)
				{
					temp = vetor.elementAt(j);
					vetor.remove(j);
				       	vetor.add(j+1,temp);
				}
			}
		}

		this.imprimeVector(vetor);						//imprime o vetor ordenado

		return;
	}

	public <T extends Comparable<T>> void imprimeVector (Vector<T> vetor)
	{
		int n = vetor.size();							//imprime o vetor

		int i;

		System.out.println("");
		for (i = 0 ; i < n ; i++)
		{
			System.out.printf("%s ", vetor.elementAt(i));
		}
		System.out.println("");

		return;
	}
}

public class exer1
{
	public static void main (String args[])
	{
		//bora testar se a classe funciona :)
	
		int i;

		Vector <Integer> vetor_i = new Vector <Integer> ();			//a estrutura de dados é testada com inteiros e números com ponto flutuante
		Vector <Double> vetor_d = new Vector <Double> ();

		for (i = 1 ; i < 21 ; i++)
		{
			vetor_i.add(i-1,((int)    ((230-i)%i)));
			vetor_d.add(i-1,((double) ((230-i)%i)));
		}

		Vetor tratador_vetor = new Vetor();

		tratador_vetor.ordenaVetor(vetor_i);
		tratador_vetor.ordenaVetor(vetor_d);

	}
}
