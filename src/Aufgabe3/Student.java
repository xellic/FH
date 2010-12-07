package Aufgabe3;

public class Student
{
	String vorname, nachname, studiengang;
	int alter;
	
	public Student()																		//Konstruktor ohne Parameter
	{
		vorname = "";
		nachname = "";
		studiengang = "";
		alter = 0;
	}
	
	public Student(String vorname, String nachname, String studiengang, int alter)			//Konstruktor mit Parameter
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.studiengang = studiengang;
		this.alter = alter;
	}
	
	public String getNachname()
	{
		return nachname;
	}
	
	public String getVorname()
	{
		return vorname;
	}
	
	public String getStudiengang()
	{
		return studiengang;
	}
	
	public int getAlter()
	{
		return alter;
	}
	
	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public void setStudiengang(String studiengang)
	{
		this.studiengang = studiengang;
	}
	
	public void setAlter(int alter)
	{
		this.alter = alter;
	}
	
	public String toString()
	{
		return nachname+" "+vorname+" "+studiengang+" "+alter;
	}
	
	public boolean equals(Student checkObjekt)			//gibt bei gleichheit der Eigenschaften im Objekt true, sonst false zurück
	{
		if(this.alter == checkObjekt.getAlter() && this.nachname == checkObjekt.getNachname() && this.vorname == checkObjekt.getVorname());
		{
			return true;								//Mit equals kann bei richtiger Nutzung sichergestellt werden das die Objekte (bzw. deren Inhalt) gleich sein.
		}												//dazu müssen dann natürlich alle Eigenschaften auf gleichheit überprüft werden.
		//return false;									//Diese Methode benötigt aber mehr Rechenzeit als die Methode hashCode()
	}								
														//Wird ein Objekt mit sich selbst verglichen, wird true zurückgeliefert
														//Der Vergleich von Objekt 1 mit Objekt 2 muss das selbe Ergebnis liefern, wie der Vergleich von Objekt 2 mit Objekt 1
														//Wenn Objekt 1 gleich Objekt 2 ist und Objekt 2 gleich Objekt 3, dann muss Objekt 1 auch gleich Objekt 3 sein
														//Auch nach n Vergleichen zweier Objekte verändert sich das Resultat nicht
														//Kein Objekt entspricht null

	public int hashCode()								
	{													
		int hashcode = 2;												
		final int primzahl = 31;						
		hashcode = primzahl * hashcode + alter;
		hashcode = primzahl * hashcode + ((nachname == null) 	? 0 : nachname.hashCode());		//if (nachname == null) {0} else {nachname.hashcode}
		hashcode = primzahl * hashcode + ((studiengang == null) ? 0 : studiengang.hashCode());	
		hashcode = primzahl * hashcode + ((vorname == null) 	? 0 : vorname.hashCode());
		return hashcode;
	}	//HashCode
		//Diese Methode berechnet einen hashCode zweier Objekte und vergleicht diesen
		//sind die hashCods gleich ist die gleichheit sehr wahrscheinlich, aber NICHT sicher
		//dann sollte ich die equals Methode aufrufen um die gleich zu bestätigen!
		//die die hashCodes nicht gleich ist eine gleichheit der Objekte NICHT möglich!
		//Diese Methode benötigt oft weniger Rechenzeit als equals()

		//Egal wann hashCode aufgerufen wurde  der Rückgabewert ist immer gleich. Dies gilt aber nur, wenn
		//	1.) Sich der Inhalt des Objekts seit dem letzten Aufruf nicht verändert hat
		//	2.) Das Programm zwischenzeitlich nicht beendet wurde
		//Sind zwei Objekte gleich, generieren sie auch den selben hashCode
	
	
	
	
}