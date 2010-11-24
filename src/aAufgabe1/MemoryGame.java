package aAufgabe1;

public class MemoryGame {
	public MemoryGame(MemoryCell content)
	{
	//	MemoryCell[][] field = new MemoryCell[4][4];
		MemoryCell[] additionalfield = new MemoryCell[15];
	//	MemoryCell playingfield = new MemoryCell();
		
		int i = 0;
		do   
		{
			//Zufallszahlen generieren
			int random1 =  (int)(7 + Math.floor(Math.random() * (0-7+1)));
			
			//zufallsfelder vom mehrdiminsionalem array füllen
			if (additionalfield[random1] == null)
			{
				additionalfield[random1] = new MemoryCell();
				i++;
			}
			 
		}while(i <= 7);
		
		//refernzen zufällig füllen
		int j = 0;
		do   
		{
			//Zufallszahlen generieren
			int random2 =  (int)(15 + Math.floor(Math.random() * (8-15+1)));
			
			//zufallsfelder vom mehrdiminsionalem array füllen
			if (additionalfield[random2] == null)
			{
				additionalfield[random2] = additionalfield[j];
			}
			 j++;
		}while(j <= 7);
		
		//jetzt ist das array mit zufallszahlen gefüllt und muss noch ausgegeben werden!!
	}
}