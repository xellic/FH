package aAufgabe2;


public class Musikinstrumente {

	static Schlaginstrument[] array = new Schlaginstrument[3];
	static Streichinstrument[] array1 = new Streichinstrument[3];
	static Zupfinstrument[] array2 = new Zupfinstrument[3];
	static 	Tasteninstrument[] array3 = new Tasteninstrument[3];
	
	static Schlaginstrument s1 = new Schlaginstrument("Boobam ", "Schlagzeug", false);
	static Schlaginstrument s2 = new Schlaginstrument("Xylophon ", "Klangspiel", false);
	static Schlaginstrument s3 = new Schlaginstrument("Vibraphone ", "Vibrator", true);

	public static void main(String[] args) 
	{
		

			//Deklaration der Schlaginstrumente
			Schlaginstrument.fillArray(array, s1, 0);
			Schlaginstrument.fillArray(array, s2, 1);
			Schlaginstrument.fillArray(array, s3, 2);
			
			
			//Deklaration der Streichinstrumente
			Streichinstrument se1 = new Streichinstrument("Geige ", "Streicher", "");
			Streichinstrument se2 = new Streichinstrument("Violine ", "Streicher", "");
			Streichinstrument se3 = new Streichinstrument("Kontrabass ", "Streicher", "");
			

			//Deklaration der Zupfintrumente
			Zupfinstrument zu1 = new Zupfinstrument("Gitarre ", "EBass", "");
			Zupfinstrument zu2 = new Zupfinstrument("Gitarre ", "Hochtoener", "");
			Zupfinstrument zu3 = new Zupfinstrument("Harve ", "edler Zupfer", "");
	
			
			//Deklaration der Tasteninstrumente
			Tasteninstrument t1 = new Tasteninstrument("K-Board ", "", false);
			Tasteninstrument t2 = new Tasteninstrument("Piano", "", true);
			Tasteninstrument t3 = new Tasteninstrument("Akkordion", "", true);
		
			

			
			//Befüllen der Array mit Schlaginstrumenten
						
			
			//Befüllen des Array1 mit Streichinstrumenten
			Streichinstrument.fillArray(array1, se1, 0);
			Streichinstrument.fillArray(array1, se2, 1);
			Streichinstrument.fillArray(array1, se3, 2);
			
			//Befüllen des Array2 mit Zupfinsturmenten
			Zupfinstrument.fillArray(array2, zu1, 0);
			Zupfinstrument.fillArray(array2, zu2, 1);
			Zupfinstrument.fillArray(array2, zu3, 2);
			
			//Befüllen des Array3 mit Tasteninstrumenten
			Tasteninstrument.fillArray(array3, t1, 0);
			Tasteninstrument.fillArray(array3, t2, 1);
			Tasteninstrument.fillArray(array3, t3, 2);
			

			Schlaginstrument.readArray(array);

	}
	
	public static void reader()
	{
		

		
		//Gesuchte Methode Read Array
		Schlaginstrument.readArray(array);
	}
}