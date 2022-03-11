import java.lang.Math;
import java.util.Scanner;
import java.io.*;

class Produto
{
	int codigo;
	String nome;
	int quantidade;
	double preco;

	public void setCodigo(int codigo)		//funcoes set e get para cada variável da classe
	{
		this.codigo = codigo;
	}
	public int getCodigo()
	{
		return this.codigo;
	}

	public void mostraPreco()
	{
		System.out.println(preco);
	}
	public void atualizaPreco(double perc)
	{
		preco += preco*perc/100;
	}

	public void setPreco (double preco)
	{
		this.preco = preco;
	}
	public double getPreco ()
	{
		return this.preco;
	}

	public void setQuantidade (int quantidade)
	{
		this.quantidade = quantidade;
	}
	public int getQuantidade ()
	{
		return this.quantidade;
	}

	public void setNome (String nome)
	{
		this.nome = nome;
	}
	public String getNome ()
	{
		return this.nome;
	}
}

public class exer6
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("Digite os dados :)");
		System.out.println("");

		int i, tam;					//declaração de variáveis
		String 	nome	= new String();
		int	codigo,quantidade;
		double	preco;	

		BufferedReader 	teclado1	= new BufferedReader(new InputStreamReader(System.in));		//inicia leitores de teclado
		Scanner		teclado2	= new Scanner(System.in);

		Produto produto = new Produto();

		codigo		= teclado2.nextInt(); 		//lê os dados
		nome		= teclado1.readLine();
		quantidade	= teclado2.nextInt();
		preco		= teclado2.nextDouble();


		System.out.println("");
		System.out.println("Produto : "+codigo+"	"+nome+"	"+quantidade+"	"+preco);	//imprime os dados
	}
}

