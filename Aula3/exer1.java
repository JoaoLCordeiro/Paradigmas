import java.lang.Math;
import java.util.Scanner;
import java.io.*;

class Pessoa
{
	String nome;
	String endereco;
	String telefone;
	String email;

	public String getNome()					//funcoes get e set para o nome
	{
		return this.nome;
	}
	public void setNome(String nome_novo)
	{
		this.nome = nome_novo;
		return;
	}

	public String getEndereco()				//funcoes get e set para o endereco
	{
		return this.endereco;
	}
	public void setEndereco(String endereco_novo)
	{
		this.endereco = endereco_novo;
		return;
	}					

	public String getTelefone()				//funcoes get e set para o telefone
	{
		return this.telefone;
	}
	public void setTelefone(String telefone_novo)
	{
		this.telefone = telefone_novo;
		return;
	}		

	public String getEmail()				//funcoes get e set para o email
	{
		return this.email;
	}
	public void setEmail(String email_novo)
	{
		this.email = email_novo;
		return;
	}
}

class Leitor
{
	public float leNumeroFloat()				//todas as funcoes iniciam um teclado ara usar dentro do método, então leem o valor e o retornam
	{
		Scanner teclado = new Scanner(System.in);
		float n 	= teclado.nextFloat();
		return n;
	}
	public int leNumeroInt()
	{
		Scanner teclado	= new Scanner(System.in);
		int n		= teclado.nextInt();
		return n;
	}

	public double leNumeroDouble()
	{
		Scanner teclado = new Scanner(System.in);
		double n	= teclado.nextDouble();
		return n;
	}

	public String leString() throws IOException
	{
		BufferedReader teclado	= new BufferedReader(new InputStreamReader(System.in));
		String string		= teclado.readLine();					
		return string;
	}
}												

public class exer1
{
	public static void main (String args[]) throws IOException
	{
		int i;

		System.out.println("Digite os dados das pessoas :)");
		System.out.println("");

		Leitor 	leitor 		= new Leitor();			//iniciando um leitor
		Pessoa[] pessoas 	= new Pessoa[4];		//iniciando um vetor de pessoas
		
		for (i = 0 ; i < 4 ; i++)
		{
			pessoas[i]	= new Pessoa();			//inciando cada pessoa do vetor
			pessoas[i].setNome 	(leitor.leString());	//lendo os dados para cada pessoa
			pessoas[i].setEndereco	(leitor.leString());
			pessoas[i].setTelefone	(leitor.leString());
			pessoas[i].setEmail	(leitor.leString());
		}

		System.out.println("");

		Pessoa pessoa 		= new Pessoa();			//variável de suporte para o println ficar mais legível

		for (i = 0 ; i < 4 ; i++)
		{
			pessoa = pessoas[i];
			System.out.println ("Pessoa "+i+": "+pessoa.getNome()+"	"+pessoa.getEndereco()+"	"+pessoa.getTelefone()+"	"+pessoa.getEmail());
		}
	}
}

