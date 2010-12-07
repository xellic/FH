package Aufgabe3;

import java.util.HashMap;
import java.util.Iterator;

public class StudentTest
{

	public static void main(String[] args)
	{ 	
	
		HashMap<Student, Integer> meineHashMap = new HashMap<Student, Integer>();
		
		Student student1 = new Student("Patrick","Etteldorf","Wirtschaftsinformatik",25);		//Objekt mit gleichem Inhalt - Student1
		Student student2 = new Student("Fabian","Limbach","Wirtschaftsinformatik",24);
		Student student3 = new Student("Ruben","Krapf","Wirtschaftsinformatik",24);
		Student student4 = new Student("Patrick","Etteldorf","Wirtschaftsinformatik",25);		//Objekt mit gleichem Inhalt - Student4
		Student student5 = new Student("Roman","Dino","Wirtschaftsinformatik",22);
		
		System.out.println("student1.equals(student4) : "+student1.equals(student4));		//Da laut meiner equals Methode die Eigenschaft (Vorname, Nachname und alter)
																							//von student1 und student4 gleich sind wird true zurückgegeben	

		meineHashMap.put(student1, 130);		
		meineHashMap.put(student2, 110);		
		meineHashMap.put(student3, 15);
		meineHashMap.put(student4, 60);
		meineHashMap.put(student5, 160);
		
		meineHashMap.keySet();
		

		for (Iterator<Student> iterator = meineHashMap.keySet().iterator(); iterator.hasNext();)
		{
		Student key = iterator.next();
		System.out.println(meineHashMap.get(key));
		}
		

		
		
	}

}