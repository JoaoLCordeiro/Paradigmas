//Exercício B da lista de Colecoes

class Fracao
{
	private int cima;
	private int baixo;

	public Fracao ()						//possui dois construtores: um que inicia sem valores e um que inicia com os valores dados
	{
	}

	public Fracao (int cima, int baixo)
	{
		this.cima  = cima;
		this.baixo = baixo;
	}

	public int getBaixo ()					//funções get e set para os números de baixo e de cima da fração
	{
		return this.baixo;
	}

	public void setBaixo (int n)
	{
		this.baixo = n;
		return;
	}

	public int getCima ()
	{
		return this.cima;
	}

	public void setCima (int n)
	{
		this.cima = n;
		return;
	}

	public void imprimeFracao ()			//função que imprime a fração
	{
		System.out.println("A fração é: "+this.getCima()+"/"+this.getBaixo());
	}

	public Fracao somaFracao (Fracao fracao2)		//soma frações
	{
		Fracao fracaoR = new Fracao();

		int baixoR = this.getBaixo() * fracao2.getBaixo();												//multiplica os dois de baixo e
		int cimaR  = (this.getCima() * fracao2.getBaixo()) + (this.getBaixo() * fracao2.getCima());		//soma os de cima com peso dos de baixo

		fracaoR.setBaixo (baixoR);
		fracaoR.setCima  (cimaR);

		return fracaoR;											
	}

	public Fracao multFracao (Fracao fracao2)		//multiplica frações
	{
		Fracao fracaoR = new Fracao();

		int baixoR = this.getBaixo() * fracao2.getBaixo();		//multiplica em cima e multiplica em baixo
		int cimaR  = this.getCima()  * fracao2.getCima();

		fracaoR.setBaixo (baixoR);
		fracaoR.setCima  (cimaR);

		return fracaoR;						
	}

	public Fracao subFracao (Fracao fracao2)		//subtrai frações
	{
		Fracao fracaoR = new Fracao();

		int baixoR = this.getBaixo() * fracao2.getBaixo();		//faz a mesma coisa que a soma mas subtrai
		int cimaR  = (this.getCima() * fracao2.getBaixo()) - (this.getBaixo() * fracao2.getCima());

		fracaoR.setBaixo (baixoR);
		fracaoR.setCima  (cimaR);

		return fracaoR;											
	}

	public Fracao divFracao (Fracao fracao2)		//divide frações
	{
		Fracao fracaoR = new Fracao();

		int baixoR = this.getBaixo() * fracao2.getCima();		//inverte a segunda fração e multiplica
		int cimaR  = this.getCima()  * fracao2.getBaixo();

		fracaoR.setBaixo (baixoR);
		fracaoR.setCima  (cimaR);

		return fracaoR;						
	}
}

public class exerB
{
	public static void main (String args[])
	{
		//bora testar se a classe funciona :)
		
		Fracao fracao1 = new Fracao();
		fracao1.setCima(1);
		fracao1.setBaixo(2);

		Fracao fracao2 = new Fracao(3,4);

		fracao1.imprimeFracao();
		System.out.println("");			
		fracao2.imprimeFracao();
		System.out.println("");			

		Fracao fracao3 = new Fracao (0,0);

		System.out.println("Soma de Fração");
		fracao3 = fracao1.somaFracao(fracao2);
		fracao3.imprimeFracao();
		System.out.println("");			

		System.out.println("Multiplicação de Fração");
		fracao3 = fracao1.multFracao(fracao2);
		fracao3.imprimeFracao();
		System.out.println("");			

		System.out.println("Subtração de Fração");
		fracao3 = fracao1.subFracao(fracao2);
		fracao3.imprimeFracao();
		System.out.println("");			

		System.out.println("Divisão de Fração");
		fracao3 = fracao1.divFracao(fracao2);
		fracao3.imprimeFracao();
		System.out.println("");			
	}
}
