import java.util.Scanner;

public class exer4
{
	public static void main (String args[])
	{
		int num;
		System.out.println("Digite um número!");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		if (num < 0)
		{
			System.out.println("O número é negativo!");
		}
		else
		{
			System.out.println("O número é positivo!");
		}
	}
}

