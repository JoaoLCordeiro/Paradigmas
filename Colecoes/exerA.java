//Exercício A da lista de Colecoes

class Array10
{
	private int array[] = new int[10];

	public void adicionaElemento (int n, int i)				//adiciona um elemento no vetor de 10 posições
	{
		if ((i < 0) || (i > 9))
		{
			System.out.println("ERRO: índice inválido");	//caso o índice não esteja no intervalo do vetor
			return;
		}

		this.array[i] = n;

		return;
	}

	public int retornaElemento (int i)						//retorna o valor do elemento na posição
	{
		if ((i < 0) || (i > 9))
		{
			System.out.println("ERRO: índice inválido");	//caso o índice não esteja no intervalo do vetor
			return (-1);
		}

		return (this.array[i]);
	}

	public int buscaElemento (int n)						//procura um elemento e, se encontra, retorna o índice, se não, retorna -1
	{
		int i = 0;
		boolean achou = false;

		while ((i < 10)&&(! achou))
		{
			if (this.array[i] == n)
				achou = true;

			i++;
		}

		if (achou)
			return (i-1);
		else
			return (-1);
	}

	public void ordenaElementos ()							//ordena os elementos do vetor usando o Bubble Sort
	{
		int i,j,temp;
		for (i = 0 ; i < 10 ; i++)
			for (j = 0 ; j < 9-i ; j++)
			{
				if (this.array[j] > this.array[j+1])
				{
					temp 		= this.array[j];
					this.array[j] 	= this.array[j+1];
					this.array[j+1]	= temp;
				}
			}
	}

	public void imprimeElementos ()							//imprime todos os elementos do vetor
	{
		int i;
		for (i = 0 ; i < 10 ; i++)
			System.out.print(array[i]+"	");
		System.out.println("");
	}
}

public class exerA
{
	public static void main (String args[])
	{
		//bora testar se a classe funciona :)
		
		Array10 array = new Array10();

		int i;
		for (i = 0 ; i < 10 ; i++)
		{
			array.adicionaElemento(10-i,i);
		}

		for (i = 0 ; i < 10 ; i++)
		{
			System.out.println("Elemento "+i+":	"+array.retornaElemento(i));
		}

		System.out.println("Elemento 3 está em "+array.buscaElemento(3));
		System.out.println("Elemento 7 está em "+array.buscaElemento(7));

		array.ordenaElementos();

		array.imprimeElementos();
	}
}
