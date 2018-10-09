
public class archivio 
{
	private int indice = 0;
	private persona [] listapersone = new persona[10];
	
	public boolean aggPersona(persona p)
	{
		if (indice < 10) 
		{
			listapersone[indice++] = p;
			return true;
		}
		return false;
	}
	
	public persona cerca(String cognome) 
	{
		for(persona p : listapersone) 
		{
			if(cognome.equals(p.cognome)) 
			{
				return p;
			}
		}
		return null;
	}
}
