package Aufgabe2;


public class Schlaginstrument {

	
	String instrumentenName;
	String kategorie;
	boolean definierbareTonhoehe;
//	static Schlaginstrument[] array;
	
	//Konstruktor??
	
	public Schlaginstrument(String instrumentenName, String kategorie, boolean definierbareTonhoehe) {
	
		this.instrumentenName = instrumentenName;
		this.kategorie = kategorie;
		this.definierbareTonhoehe = definierbareTonhoehe;
	}
	
	
	// Setter Methoden
	public void setInstrumentenName (String instrumentenName)
	{
		this.instrumentenName = instrumentenName;
	}
	
	public void setKategorie (String kategorie)
	{
		this.kategorie = kategorie;
	}
	public void setDefinierbareTonhoehe (boolean definierbareTonhoehe)
	{
		this.definierbareTonhoehe = definierbareTonhoehe;
	}
	
	//Getter Methoden
	public String getInstrumntenName (String instrumentenName)
	{
		return instrumentenName;
	}
	
	public String getKategorie (String kategorie)
	{
		return kategorie;
	}
	
	public boolean getDefinierbareTonhoehe (boolean definierbareTonhoehe)
	{
		return definierbareTonhoehe;
	}
	
	//Read Array Methode
	public static void readArray(Schlaginstrument[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	//FillArray Methode
	public static void fillArray(Schlaginstrument[] array, Schlaginstrument s, int position)
	{
		array[position] = s;
	}
	//To String Methode
	public String toString()
	{
		return instrumentenName +" "+ kategorie +" " + definierbareTonhoehe;
	}
	

	

}

