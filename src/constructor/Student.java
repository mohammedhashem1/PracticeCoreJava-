package constructor;

import java.util.Scanner;

public class Student {
	String sName;
	int student;
	String univer;
	String add;
	int uStud;
	public Student() {//Default constructor class
		
	}
	
	public Student(String versity,String lCation, int nStudent) {
	String university=this.univer=versity;
	String location=this.add=lCation;
	int student=this. uStud=nStudent;
	System.out.println("Nameis:"+university+";Address is:"+location+";Student is:"+student);
	}
	
	
	
	
	public Student (String slocation, int tStudent) {
		String schoolName=this.sName=slocation;
		int totalStudent=this.student=tStudent;
		System.out.println("Name of academic institution is:"+schoolName+"; Number of student is:"+totalStudent);
		
	}
	//===================================================================================================
	
	String hS;
	String sN;
	double sR;
	public Student(String hSchool,String sName, double sResult) {
	String highSchool=this.hS=hSchool;
	String name=this.sN=sName;	
	double score=this.sR=sResult;	
		System.out.println("Name of the high scholl is:"+highSchool+"; Name of the Student is:"+name+"; Score is :"+score);
	}
	
	
	
	public static void main(String[] args) {
		
		Student serial=new Student("Mohammed pur govt boy's school", 2450);
		Student name=new Student("New York University", " Washington Square park Manhattan",36500);
		Student best=new Student("Notrodeme","Zahir uddin Ahmed", 965.75);
		Scanner type=new Scanner(System.in);
		System.out.println("Name of the best Cardiovascular hospital is :");
		String rank=type.nextLine();
		System.out.println("Name of the Heart Hospital is:"+rank);
		System.out.println("Name of the best President with in 100 years is :");
		String student=type.nextLine();
		System.out.println("Name of the best president last 100 years is :"+student);
	}
	
	
	
	

}
