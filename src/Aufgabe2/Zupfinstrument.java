package Aufgabe2;


public class Zupfinstrument 
{
	private String name;
	private String kategorie;
	private String farbe;
	
	
	
	//Konstruktor
	
	public Zupfinstrument()
	{
		name = "";
		kategorie = "";
		farbe = "";
	}
	
	public Zupfinstrument(String name, String kategorie, String farbe)
	{
		this.name = name;
		this.kategorie = kategorie;
		this.farbe = farbe;
	}
	
	
	//setter
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setKategorie(String kategorie)
	{
		this.kategorie = kategorie;
	}
	
	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}
	

	
	//getter
	
	public String getName()
	{
		return name;
	}
	public String getKategorie()
	{
		return kategorie;
	}
	public String getFarbe()
	{
		return farbe;
	}
	
	
	public String toString()
	{
		return name + "\t\t" + kategorie + "\t\t" + farbe;
	}
	

	
}