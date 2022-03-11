import java.lang.Math;
import java.util.Scanner;
import java.io.*;

class Temperatura
{
	public double celsiusParaFarenheit (double celsius)			//computa a temperatura que foi dada em celsius em farenheit, e retorna
	{
		double farenheit = ( (celsius * 9) / 5 ) + 32;
		return farenheit;
	}
}

public class exer3
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("Digite a temperatura em Celsius :)");
		System.out.println("");

		Scanner teclado = new Scanner(System.in);				//inicia o teclado e um objeto temperatura

		Temperatura temperatura = new Temperatura();

		double temperatura_c = teclado.nextDouble();				//lê a temperatura em celsius e calcula ela em farenheit
		double temperatura_f = temperatura.celsiusParaFarenheit(temperatura_c);

		System.out.println("");
		System.out.println("A temperatura "+temperatura_c+"°C corresponde à "+temperatura_f+"°F");
	}
}

