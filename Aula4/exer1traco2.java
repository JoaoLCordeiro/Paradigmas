import java.lang.Math;
import java.util.Scanner;
import java.io.*;

class Aluno
{
	String 	nome		= new String();
	String 	endereco	= new String();
	String 	email		= new String();
	double	notas[]		= new double[4];

	public void setNome (String nome)
	{
		this.nome = nome;
		return;
	}
	public String getNome ()
	{
		return (this.nome);
	}

	public void setEndereco (String endereco)
	{
		this.endereco = endereco;
		return;
	}
	public String getEndereco ()
	{
		return (this.endereco);
	}

	public void setEmail (String email)
	{
		this.email = email;
		return;
	}
	public String getEmail ()
	{
		return (this.email);
	}

	public void setNota (double nota, int i)
	{
		this.notas[i] = nota;
	}
	public double getNota (int i)
	{
		return (this.notas[i]);
	}

	public double getMedia ()
	{
		double soma = this.notas[0]+ this.notas[1] + this.notas[2] + this.notas[3];
		return (soma / 4);
	}
}

public class exer1traco2
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

