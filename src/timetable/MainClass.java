package timetable;

import java.util.LinkedList;
public class MainClass {
	LinkedList<Student> list = new LinkedList<Student>();
	LinkedList<Timetable> list1 = new LinkedList();
	LinkedList<Faculty> list2 = new LinkedList();
	LinkedList<Subject> list3 = new LinkedList();
	 
	public static void main(String[] args) {
		String sub1[][] = {{"AI", "OOPS", "DS", "OS"},{"OOPS", "AI", "OS", "DS"},{"OS", "OOPS", "AI", "DS"},{"DS", "OS", "OOPS", "AI"},{"AI", "DS", "OS", "OOPS"}};
		String sub2[][] = {{"HTML", "CSS", "JS", "TS"},{"CSS", "HTML", "TS", "JS"},{"JS", "TS", "CSS", "HTML"},{"TS", "JS", "HTML", "CSS"},{"JS", "HTML", "CSS", "TS"}};
		String sub3[][] = {{"JAVA", "OOPS", "HTML", "CSS"},{"OOPS", "JAVA", "CSS", "HTML"},{"HTML", "OOPS", "JAVA", "CSS"},{"CSS", "OOPS", "HTML", "JAVA"},{"OOPS", "HTML", "JAVA", "CSS"}};

		String ds = "";
		System.out.println("----------------------------## TIMETABLE ##-------------------------------------------");
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("%15s %15s %15s %15s %15s","DAY","FIRST HR","SECOND HR","THIRD HR","FORTH HR");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------");
	
		for (int i = 0; i < 5; i++) {
			
			  switch(i) {
			  case 0: 
				  ds = "MONDAY";
				  break; 
			  case 1:
				  ds = "TUESDAY";
				  break;
			  case 2:
				  ds = "WEDNESDAY";
				  break;
			  case 3:
				  ds = "THURSDAY";
				  break; 
			  case 4:
				  ds = "FRIDAY";
				   break;
			  }
			  
			System.out.print(String.format("%15s", ds));	
			
			for (int j = 0; j < 4; j++) {
				System.out.print(String.format("%15s",sub1[i][j]));
			}
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------");
		}
		
	}

}