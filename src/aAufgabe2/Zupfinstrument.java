package aAufgabe2;

public class Zupfinstrument 
{
	String name;
	String kategorie;
	String farbe;
	static Zupfinstrument[] array2;
	
	
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
	
	//FillArray
	public static void fillArray(Zupfinstrument[] array2, Zupfinstrument zu, int position)
	{
		array2[position] = zu;
	}

	//ReadArray
	public static void readArray(Zupfinstrument[] array2)
	{
		for (int i=0; i<array2.length; i++)
		{
		System.out.println(array2[i]);
		
		}
	}
	
	//ToString
	public String toString()
	{
		return name + " " + kategorie + " " + farbe;
	}
}
