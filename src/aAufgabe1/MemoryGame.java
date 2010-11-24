package aAufgabe1;

public class MemoryGame
{
	public MemoryGame(MemoryCell content)
	{
		MemoryCell[][] field = new MemoryCell[4][4];
		MemoryCell[] additionalfield = new MemoryCell[15];
		MemoryCell playingfield = new MemoryCell();
		
		
		for (int i = 0; i <=8; i++)
		{
			additionalfield[i] = playingfield;
		}
		
		for(int i=9; i<additionalfield.length; i++)
		{
			for (int j=0; i <=8; i++)
			{
				additionalfield[i] = additionalfield[j];
			}
		}
		
			
		
	}
}
