import java.lang.Math;

public class exer2
{
	public static void main (String args[])
	{
		double a = 1.0;
		double b = 1.0;
		double c = -6.0;

		double delta = ((b * b) + (-4 * a * c));

		double raiz = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Raíz 1: "+raiz);
		raiz = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Raíz 2: "+raiz);
	}
}
