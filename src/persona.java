 	
public class persona 
{
	String nome;
	String cognome;
	int eta;
	private char sesso;

	public persona(String nome, String cognome, int eta, char sesso)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
	}
	
	public char getSesso() 
	{
		return sesso;
	}
	
	public void setSesso(char sesso) 
	{
		if(sesso!= 'm') sesso = 'M'; 
		if(sesso!= 'f') sesso = 'F';
		this.sesso = sesso;
	}
}
