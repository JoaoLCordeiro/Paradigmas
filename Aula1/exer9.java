import java.util.Scanner;

public class exer9
{
	public static void main (String args[])
	{
		int num, i;
		int max = 100;
		int cont = 0;
		int soma = 0;
		System.out.println("Digite números!");
		Scanner teclado = new Scanner(System.in);
		int[] string = new int[max];
	
		num = teclado.nextInt();			//lê os números
		while (num != -1)
		{
			string[cont] = num;
			cont++;
			num = teclado.nextInt();
		}

		for (i = 0 ; i < cont ; i++)			//soma os números
		{
			soma = soma + string[i];
		}

		System.out.println("Resultado: "+soma);		//imprime a soma
	}
}

