package aAufgabe1;


	public class MemoryCell
	{
		private int content;
		private boolean visible;
		static int counter;
		
		//konstruktor
		public MemoryCell()
		{
			counter++;
			this.content =  content+counter;
		}
		
		//getter und setter
		public int getContent()
		{
			return content;
		}
		public void setContent(int content)
		{
			this.content = content;
		}
		public boolean isVisible()
		{
			return visible;
		}
		public void setVisible(boolean visible)
		{
			this.visible = visible;
		}
		
		public String toString()
		{
			return "["+content+"]";
		}

}
