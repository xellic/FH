package Aufgabe2;

public class Streichinstrument 
{
	private String name;
	private String funktionsweise;
	private String typ;
	
	//konstruktor
	public Streichinstrument()
	{
		name = "";
		funktionsweise = "";
		typ = "";
	}
	public Streichinstrument(String name, String funktionsweise, String typ)
	{
		this.name = name;
		this.funktionsweise = funktionsweise;
		this.typ = typ;
	}
	
	
	//Setter
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setFunktionsweise(String funktionsweise)
	{
		this.funktionsweise = funktionsweise;
	}
	public void setTyp(String typ)
	{
		this.typ = typ;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	
	public String getFunktionsweise()
	{
		return funktionsweise;
	}
	
	public String getTyp()
	{
		return typ;
	}
	
	public String toString()
	{
		return name + "\t\t" + typ + "\t\t" + funktionsweise;
	}
}