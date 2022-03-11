import java.util.Scanner;

public class exer11
{
	public static void main (String args[])
	{
		int	i;
		int 	soma	= 0;
	
		for (i = 1 ; i <= 10 ; i++)		//encontra e soma os multiplos
		{
			soma = soma + (i*3); 
		}

		System.out.println ("A soma dos múltiplos é: "+soma);	//imprime
	}
}

