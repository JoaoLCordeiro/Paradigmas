import java.util.Scanner;

public class exer6
{
	public static void main (String args[])
	{
		int num;
		int f;
		System.out.println("Digite um número!");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		if (num < 0)
		{
			System.out.println("A função não é definida para este número");
		}
		else if ((num >= 0) && (num < 5))
		{
			f = num;
			System.out.println("O valor da função para x = "+num+" é f = "+f);
		}
		else if ((num >= 5) && (num < 10))
		{
			f = 2*num + 1;
			System.out.println("O valor da função para x = "+num+" é f = "+f);
		}
		else
		{
			f = num - 3;
			System.out.println("O valor da função para x = "+num+" é f = "+f);
		}
	}
}

