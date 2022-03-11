import java.util.Scanner;

public class exer7
{
	public static void main (String args[])
	{
		int lado1,lado2,lado3;
		System.out.println("Digite três lados!");
		Scanner teclado = new Scanner(System.in);
		lado1 = teclado.nextInt();
		lado2 = teclado.nextInt();
		lado3 = teclado.nextInt();
		
		if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3))
		{
			System.out.println("O triângulo é equilátero");
		}
		else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))
		{
			System.out.println("O triângulo é isósceles");
		}
		else//if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))
		{
			System.out.println("O triângulo é escaleno");
		}
	}
}

