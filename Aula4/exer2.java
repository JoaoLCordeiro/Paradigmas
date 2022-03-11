class Pessoa
{
	String nome;
	String email;

	public void setNome (String nome)
	{
		this.nome = nome;
		return;
	}
	public String getNome ()
	{
		return (this.nome);
	}

	public void setEmail (String email)
	{
		this.email = email;
		return;
	}
	public String getEmail ()
	{
		return (this.email);
	}

	public Pessoa (String nome, String email)
	{
		this.nome  = nome;
		this.email = email;
	}						
}

class Aluno extends Pessoa
{
	String GRR;

	public void setGRR (String GRR)
	{
		this.GRR = GRR;
		return;
	}
	public String getGRR ()
	{
		return (this.GRR);
	}

	public Aluno (String nome, String email, String GRR)
	{
		this.nome  = nome;
		this.email = email;
		this.GRR   = GRR;
	}						
}

public class exer2
{
	public static void main ()
	{
	}
}
