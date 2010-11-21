package aAufgabe2;

public class Streichinstrument 
{
	String name;
	String funktionsweise;
	String typ;
	static Streichinstrument[] array1;
	
	//Konstruktor
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
	
	//Getter
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
	
	//FilArray Methode
	public static void fillArray(Streichinstrument[] array1, Streichinstrument se, int position)
	{
		array1[position] = se;
	}
	
	//ReadArray Methode
	public static void readArray(Streichinstrument[] array1)
	{
		for (int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
	
		}
	}
	
	
	//ToString Methode
	public String toString()
	{
		return name + "" + typ + "" + funktionsweise;
	}
}
