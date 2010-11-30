package aAufgabe1;

public class MemoryStart
{

 
	public static void main(String[] args)
	{
		MemoryGame game1 = new MemoryGame();
		for (int i=0; i<=100; i++)
		{
		game1.check((int) Math.floor(Math.random()*4), (int) Math.floor(Math.random()*4), (int) Math.floor(Math.random()*4), (int) Math.floor(Math.random()*4));
		}
		game1.show();
		
		
	}

}
