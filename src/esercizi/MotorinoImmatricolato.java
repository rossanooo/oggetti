package esercizi;

import java.util.Scanner;

public class MotorinoImmatricolato 
{
	public Scanner sc;
	String colore;
	float velocita;
	String tipo;
	boolean antifurto = false;
	float maxVelocita;
	String targa;
	float s;
	float x;
	
	MotorinoImmatricolato (String colore, String tipo, float velocita, float maxVelocita, String targa)
	{
		this.colore = colore;
		this.tipo = tipo;
		this.velocita = velocita;
		this.maxVelocita = maxVelocita;
		this.targa = targa;
	}
	
	float getVelocita()
	{
		return velocita;
	}
	
	float getMax() 
	{
		System.out.println(maxVelocita);
		return maxVelocita;
	}
	
	void accellera() 
	{
		sc = new Scanner(System.in);
		if(antifurto == false) 
		{
			
			velocita=velocita+x;
		}
		System.out.println("");
		s = sc.nextFloat();
		if(velocita + s > maxVelocita) 
		{
			velocita = maxVelocita;
		}
		else 
		{
			velocita = velocita + s;
		}
	}
	
	void inserisciAntifurto() 
	{
		antifurto = true;
	}
	
	
}
