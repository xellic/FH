package Aufgabe2;

public class Tasteninstrument 
{
	String name = "";
	String tonerzeugung = "";
	boolean elektroInstrument = false;
	static Tasteninstrument[] array3;
	
	
	//Konstruktor
	public Tasteninstrument()
	{
		name = "";
		tonerzeugung = "";
		elektroInstrument = false;
	}
	
	public Tasteninstrument(String name, String tonerzeugung, boolean elektroInstrument)
	{
		this.name = name;
		this.tonerzeugung = tonerzeugung;
		this.elektroInstrument = elektroInstrument;
	}
	
	
	//set Methoden
	public void setName(String name)
	{
		this.name = name; 
	}

	public void setTonerzeugung(String tonerzeugung)
	{
		this.tonerzeugung = tonerzeugung; 
	}
	public void setElektro(boolean elektroInstrument)
	{
		this.elektroInstrument = elektroInstrument; 
	}


	//get-Methoden
	public String getName()
	{
		return name;
	}
	
	public String getTonerzeugung()
	{
		return tonerzeugung;
	}

	public boolean getElektro()
	{
		return elektroInstrument;
	}
	//FillArray
	public static void fillArray(Tasteninstrument[] array3, Tasteninstrument t, int position)
	{
		array3[position] =  t;
	}
	
	//ReadArray
	public static void readArray(Tasteninstrument[] array3)
	{
		for(int i=0; i<array3.length; i++)
		{
			System.out.println(array3[i]);
		}
	}
	
	//ToString Methode
	public String toString()
	{
		return name +" "+ tonerzeugung +" " + elektroInstrument;
	}
	
	
}
