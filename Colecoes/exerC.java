//Exercício C da lista de Colecoes

import java.util.*;
import java.io.*;

class LeitorString
{
	private Vector <String> stringVector = new Vector <String> ();

	public void adicionaElementos () throws IOException
	{
		BufferedReader teclado  = new BufferedReader(new InputStreamReader(System.in));
		String string 	= new String();
		string 		= teclado.readLine();

		while (! (string.equals("fim")))					//adiciona novos elementos ao Vector até ler "fim"
		{
			this.stringVector.addElement(string); 
			string 	= teclado.readLine();
		}

		Collections.sort (stringVector);
		return;
	}

	public void imprimeElementos ()							//imprime todos os elementos do Vector
	{
		int i;
		System.out.println("");
		for (i = 0 ; i < stringVector.size() ; i++)
		{
			System.out.println(stringVector.elementAt(i));
		}

		return;
	}
}

public class exerC
{
	public static void main (String args[]) throws IOException
	{
		LeitorString leitor = new LeitorString();		//testa a função :)

		leitor.adicionaElementos();
		leitor.imprimeElementos();
	}
}
