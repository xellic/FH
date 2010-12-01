package Aufgabe2;

public class Tasteninstrument 
{
	private String name = "";
	private String tonerzeugung = "";
	private boolean elektroInstrument = false;

	
	
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
	
	public String toString()
	{
		return name +"\t\t"+ tonerzeugung +"\t\t" + elektroInstrument;
	}
	
	
}