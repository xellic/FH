package Aufgabe2;

public class Schlaginstrument 
{
	private String instrumentenName = "";
	private String kategorie = "";
	private boolean definierbareTonhoehe = false;
	
	
	
	//Konstruktor
	public Schlaginstrument()
	{
		instrumentenName = "";
		kategorie = "";
		definierbareTonhoehe = false;
	}
	
	
	public Schlaginstrument(String instrumentenName, String kategorie, boolean definierbareTonhoehe)
		
	{
		this.definierbareTonhoehe = definierbareTonhoehe;
		this.kategorie = kategorie;
		this.instrumentenName = instrumentenName;
	}
	
	
	//set Methoden
	public void setInstrumentenName(String instrumentenName)
	{
		this.instrumentenName = instrumentenName; 
	}
	
	public void setKategorie(String kategorie)
	{
		this.kategorie = kategorie; 
	}
	
	public void setdefinierbareTonhoehe(boolean definierbareTonhoehe)
	{
		this.definierbareTonhoehe = definierbareTonhoehe; 
	}
	
	
	//get Methoden
	public String getInstrumentenName()
	{
		return instrumentenName;
	}
	public String getKategorie()
	{
		return kategorie;
	}
	public boolean getDefinierbareTonhoehe()
	{
		return definierbareTonhoehe;
	}

	public String toString()
	{
		return String.format("%s",getInstrumentenName()) + String.format("%20s",getKategorie()) +String.format("%20s",getDefinierbareTonhoehe());
	}
}