package timetable;

import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> list=new LinkedList<Student>();
		LinkedList<Timetable> list1=new LinkedList();
		LinkedList<Faculty> list2=new LinkedList();
		LinkedList<Subject> list3=new LinkedList();
		Student s1=new Student();
		Student s2=new Student();
		Subject sb1=new Subject();
		Subject sb2=new Subject();
		Timetable t1=new Timetable();
		Timetable t2=new Timetable();
		Faculty f1=new Faculty();
		Faculty f2=new Faculty();
		
		s1.setId(1);
		s1.setName("Komal");
		s1.setAddress("Jalgaon");
		s1.setContact(841846298);
		s2.setId(1);
		s2.setName("Chetan");
		s2.setAddress("Jalgaon");
		s2.setContact(545896555);
		
		sb1.setSubName("M2");
		sb1.setTeacher("Mr.Thorat");
		sb1.setClassName("SE");
		sb2.setSubName("ADE");
		sb2.setTeacher("Mrs.Raut");
		sb2.setClassName("BE");
		
		t1.setSubjectName("M1");
		t1.setClassname("FE");
		t1.setTeacher("Mrs.Shinde");
		t2.setSubjectName("PS1");
		t2.setClassname("BE");
		t2.setTeacher("Mr.Jadhav");
		
		f1.setFid(1);
		f1.setFname("D.S.Patil");
		f2.setFid(2);
		f2.setFname("P.J.Shaha");
		
		list.add(s1);
		list.add(s2);
		list1.add(t1);
		list1.add(t2);
		list2.add(f1);
		list2.add(f2);
		list3.add(sb1);
		list3.add(sb2);
		System.out.println("Student Data");
		System.out.println("-------------------------------------------------------------------------------------------");
		list.forEach(sl->System.out.println(sl));
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("TimeTable Data");
		System.out.println("-------------------------------------------------------------------------------------------");
		list1.forEach(sl1 ->System.out.println(sl1));
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Faculty Data");
		System.out.println("-------------------------------------------------------------------------------------------");
		list2.forEach(sl2 -> System.out.println(sl2));
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Subject Data");
		System.out.println("-------------------------------------------------------------------------------------------");
		list3.forEach(sl3 -> System.out.println(sl3));
		

	}

}