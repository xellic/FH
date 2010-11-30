package Aufgabe1;

//import java.lang.reflect.Array;

public class MemoryGame
{
	MemoryCell[][] field = new MemoryCell[4][4];
	MemoryCell[] additionalfield = new MemoryCell[16];
	
	public MemoryGame()
	{
		
		int s = 0;
		do   
		{
			//Zufallszahlen generieren
			int random1 =  (int)(Math.floor(Math.random() * 8));
			
			//zufallsfelder vom mehrdiminsionalem array füllen
			if (additionalfield[random1] == null)
			{
				additionalfield[random1] = new MemoryCell();
				s++;
			}
			 
		}while(s <= 7);
		
		//refernzen zufällig füllen
		int t = 0;
		do   
		{
			//Zufallszahlen generieren
			int random2 =  (int)(8 + (Math.floor(Math.random() * (15-8+1))));
			
			//zufallsfelder vom array füllen
			if (additionalfield[random2] == null)
			{
				additionalfield[random2] = additionalfield[t];
				 t++;
			}
			
		}while(t <= 7);
		
		//jetzt ist das array mit zufallszahlen gefüllt und muss noch ausgegeben werden!!
		
//		for (int k = 0; k <=15; k++ )						//array ausgeben!
//		{
//			System.out.print(additionalfield[k]);
//		}
		

		//Array befüllen mit eindimensionalem array!
		for (int i = 0; i <= 3; i++)
		{
			field[0][i] = additionalfield[i];
			field[1][i] = additionalfield[i+4];
			field[2][i] = additionalfield[i+8];
			field[3][i] = additionalfield[i+12];
		}
		
//		//2 dimensionales array ausgeben
//		for (int i = 0; i <= 3; i++)
//		{
//			System.out.println();
//			for (int j = 0; j <= 3; j++)
//			{
//				System.out.print(field[i][j]);
//			}
//		}
		
	}
	
	
	public void show()
	{
		for (int i = 0; i <= 3; i++)
		{
					

			
			System.out.println();
			for (int j = 0; j <= 3; j++)
			{
				if (field[i][j].isVisible() == true)
				{
					System.out.print(field[i][j]);
				}
				else 
				{
					System.out.print("[ ]");
				}
			}
		}
		
	}
	
	//überprüfen ob 2 felder gleich sind
	public boolean check(int x1, int x2, int y1, int y2)
	{
		if (field[x1][x2].equals(field[y1][y2]) && (x1 != y1 && x2 != y2))
		{
			
			field[x1][x2].setVisible(true);
			field[y1][y2].setVisible(true);
			return true;
		}
		else
		{
			return false;
		}
	}
	
}