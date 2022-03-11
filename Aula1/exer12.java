import java.util.Scanner;

public class exer12
{
	public static void main (String args[])
	{
		double 	nota,maior;
		int 	cont,i;
		System.out.println("Digite as notas!");
		Scanner teclado 	= new Scanner(System.in);
		double[] string_nota	= new double[120];
	
		for (cont = 0 ; cont < 120 ; cont++)		//recebe as notas
		{
			nota	= teclado.nextDouble();
			string_nota[cont] 	= nota;
		}

		double[] string_maiores	= new double[30];
		for (cont = 0 ; cont < 30 ; cont++)		//salva as maiores notas de cada aluno
		{
			maior = string_nota[4*cont];
			for (i = 1 ; i < 4 ; i++)
			{
				if (string_nota[4*cont + i] > maior)
				{
					maior = string_nota[4*cont + i];
				}
			}
			string_maiores[cont]	= maior;
		}

		maior = string_maiores[0];			//encontra a maior nota de cada aluno
		for (cont = 1 ; cont < 30 ; cont++)
		{
			if (string_maiores[cont] > maior)
			{
				maior = string_maiores[cont];
			}
		}
		
		for (cont = 0 ; cont < 30 ; cont++)		//imprime
		{
			System.out.println("Maiores notas de cada aluno: "+string_maiores[cont]);
		}
		System.out.println("A maior nota de todas foi: "+maior);
	}
}

