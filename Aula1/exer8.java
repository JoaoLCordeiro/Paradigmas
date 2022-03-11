import java.util.Scanner;

public class exer8
{
	public static void main (String args[])
	{
		int num, cont;
		System.out.println("Digite um número!");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
	
		for (cont = 1 ; cont <= 10 ; cont++)					//calcula e imprime a tabuada do número dado
		{
			System.out.println(num+" X "+cont+"	= "+(num * cont));
		}
	}
}

