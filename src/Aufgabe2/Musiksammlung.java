package Aufgabe2;

public class Musiksammlung 
{

		Streichinstrument[] streicharray = new Streichinstrument[2];
		Schlaginstrument[] schlagarray = new Schlaginstrument[2];
		Tasteninstrument[] tastenarray = new Tasteninstrument[2];
		Zupfinstrument[] zupfarray = new Zupfinstrument[2];
		private int anzZup = 0;
		private int anzSchl = 0;
		private int anzTast = 0;
		private int anzStrei = 0;
		
	
	//füllen der Arrays
		
	public void addZupf(Zupfinstrument instruobjekt)
	{
		zupfarray[anzZup++] = instruobjekt;
	}
	public void addSchlag(Schlaginstrument instruobjekt)
	{
		schlagarray[anzSchl++] = instruobjekt;
	}
	public void addTast(Tasteninstrument instruobjekt)
	{
		tastenarray[anzTast++] = instruobjekt;
	}
	public void addStreich(Streichinstrument instruobjekt)
	{
		streicharray[anzStrei++] = instruobjekt;
	}


	//wird durch gesammteMusiksammlung aufgerufen!!!
	public String toString()
	{
		//Ausgabe wird gefüllt mit alles Musikinstrumenten
		
		String s = " Schlaginstrumente der Musiksammlung";
		s += "\n------------------------------------------";
			//auslesen der Arrays
			for (int i=0;i<anzSchl;i++)			
			{
				s +="\n";
				s += schlagarray[i];
			}
		s +="\n------------------------------------------";
		s +="\n------------------------------------------";
		s +="\n Zupfinstrumente der Musiksammlung";
		s += "\n-----------------------------------------";
			for (int i=0;i<anzZup;i++)
			{
				s +="\n";
				s += zupfarray[i];
			}
		s +="\n------------------------------------------";
		s +="\n------------------------------------------";
		s +="\n Tasteninstrumente der Musiksammlung";
		s += "\n------------------------------------------";
			for (int i=0;i<anzTast;i++)
			{
				s +="\n";
				s += tastenarray[i];
			}
		s +="\n------------------------------------------";
		s +="\n------------------------------------------";
		s +="\n Streichinstrumente der Musiksammlung";
		s += "\n------------------------------------------";
			for (int i=0;i<anzStrei;i++)
			{
				s +="\n";
				s += streicharray[i];
			}
		s +="\n------------------------------------------";
		s +="\n------------------------------------------";
		
		return s;
	}

}