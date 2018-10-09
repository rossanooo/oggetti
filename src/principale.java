
public class principale 
{
	public static void main(String[] args) 
	{
		archivio a = new archivio(10);
		persona p;
		p = new persona("Simone", "Bulloni", 18, 'M');
		a.aggPersona(p);
		p = new persona("Houssem", "Guerine", 17, 'F');
		a.aggPersona(p);
		p = a.cerca("Guerine");
		System.out.println(p.nome);
		System.out.println(p.cognome);
		System.out.println(p.eta);
		System.out.println(p.getSesso());
	}
}
