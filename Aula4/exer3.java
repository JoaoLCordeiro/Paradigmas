class Pessoa implements Serializable
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

class Aluno extends Pessoa implements Serializable
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

class Arquivo
{
	public void gravaAlunos (Vector alunos)
	{
		Aluno aluno_i = new Aluno();
		int i;
	
		FileOutputStream 	arq = new FileOutputStream("arq.dat");
		ObjectOutputStream 	out = new ObjectOutputStream(arq);

		for (i = 0 ; i < alunos.size() ; i++)
		{
			aluno_i = alunos.elementAt(i);
			out.writeObject(aluno_i);
			out.flush();
		}

		out.close();
	}

	public void leAlunos ()
	{
		int i;
		Aluno aluno_i = new Aluno();

		FileInputStream 	arq = new FileInputStream("arq.dat");
		ObjectInputStream 	in  = new ObjectInputStream(arq);

		for (i = 0 ; i < alunos.size() ; i++)
		{
			aluno_i = (Aluno) in.readObject();
			System.out.println( aluno_i.getNome()  );
			System.out.println( aluno_i.getEmail() );
		}

		in.close();
	}
}

public class exer3
{
	public static void main ()
	{
	}
}
