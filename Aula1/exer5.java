import java.util.Scanner;

public class exer5
{
	public static void main (String args[])
	{
		int num;
		System.out.println("Digite um número!");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		if ((num%2) == 0)
		{
			System.out.println("O número é par!");
		}
		else
		{
			System.out.println("O número é ímpar!");
		}
	}
}

