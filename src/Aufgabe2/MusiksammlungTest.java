package Aufgabe2;

public class MusiksammlungTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		
		//erzeugnung der Musiksammlung
		Musiksammlung gesamteMusiksammlung = new Musiksammlung();

		
		
		
		//Das Objekt wird in das entsprechende array geschrieben und auch gleichzeitig hier erzeugt--> also neues Instrument vom typ Schlagzeug
		gesamteMusiksammlung.addSchlag(new Schlaginstrument("Schlagzeug","groß  ",false));
		gesamteMusiksammlung.addSchlag(new Schlaginstrument("Trommel   ","mittel",true));
		
		gesamteMusiksammlung.addZupf(new Zupfinstrument("Gittare","Holz","braun"));
		gesamteMusiksammlung.addZupf(new Zupfinstrument("Haafe  ","Holz","hell "));
		
		gesamteMusiksammlung.addTast(new Tasteninstrument("Klavier", "Hohlraum", true));
		gesamteMusiksammlung.addTast(new Tasteninstrument("Flügel ", "Hohlraum", false));
		
		gesamteMusiksammlung.addStreich(new Streichinstrument("Geige     ", "Streichen", "klein    "));
		gesamteMusiksammlung.addStreich(new Streichinstrument("Kontrabass", "Streichen", "sehr GROß"));
		
		System.out.println(gesamteMusiksammlung);

		
		
		
		
	}

}