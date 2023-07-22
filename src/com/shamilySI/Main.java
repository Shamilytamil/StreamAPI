
package com.shamilySI;

import java.util.Scanner;

class Student
{

static String prin;
static String cshod;
static String ithod;
static String ecehod;
static String eeehod;
static String cehod;

static{
	
	prin="Gopal";
	cshod="Anu";
	ithod="Sankar";
	ecehod="Bal";
	eeehod="Priya";
	cehod="Vikram";
			
}

Student(String sname,int rollno,int syear,String sdept ){
	System.out.println("argument passed");
	
	switch(sdept.toUpperCase()) {
	
	case "CS":
		System.out.println("Name: " + sname);
		System.out.println("Rollno: " + rollno);
		System.out.println("Year of Study: " + syear);
		System.out.println("Department:  " + sdept  );
		System.out.println("CS HOD:" + cshod);
		System.out.println("Principle:" + prin);
		break;
		
	case "IT":
		System.out.println("Name: " + sname);
		System.out.println("Rollno: " + rollno);
		System.out.println("Year of Study: " + syear);
		System.out.println("Department:  " + sdept  );
		System.out.println("CS HOD:" + cshod);
		System.out.println("Principle:" + prin);
		break;
		
	case "EE":
		System.out.println("Name: " + sname);
		System.out.println("Rollno: " + rollno);
		System.out.println("Year of Study: " + syear);
		System.out.println("Department:  " + sdept  );
		System.out.println("CS HOD:" + cshod);
		System.out.println("Principle:" + prin);	
		break;
		
	case "EC":
		System.out.println("Name: " + sname);
		System.out.println("Rollno: " + rollno);
		System.out.println("Year of Study: " + syear);
		System.out.println("Department:  " + sdept  );
		System.out.println("CS HOD:" + cshod);
		System.out.println("Principle:" + prin);
		break;
		
	case "CE":
		System.out.println("Name: " + sname);
		System.out.println("Rollno: " + rollno);
		System.out.println("Year of Study: " + syear);
		System.out.println("Department:  " + sdept  );
		System.out.println("CS HOD:" + cshod);
		System.out.println("Principle:" + prin);	
		break;
		
	default :
			System.out.println("Pls Enter Correct Department Code!!!!");
			
	}
}
Student(int syear){
	System.out.println("Know About Your Exam Schedule");
	
	switch(syear) {
	
	case 1:
		System.out.println("For 1st Year Students Exam Start from 22nd August");
		break;
	case 2:
		System.out.println("For 2nd Year Students Exam Start from 25th August");
		break;
	
	case 3:
		System.out.println("For 3rd Year Students Exam Start from 28th August");
		break;
	case 4:
		System.out.println("For 4th Year Students Exam Start from 30th August");
		break;
		
	default:
		System.out.println("Pls Enter correct Year of Study");
		
		
	
	}
	
	

	
}
}
public class Main {

	public static void main(String[] args) {
	
		String sname,sdept;
		int rollno,syear;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		sname = sc.next();
		System.out.println("Enter your Roll Number: ");
		rollno = sc.nextInt();
		System.out.println("Enter Year of study(1,2,3,4): ");
		syear = sc.nextInt();
		System.out.println("Enter Your Department(CS/IT/EE/EC/CE): ");
		sdept = sc.next();
		Student sf = new Student (sname,rollno,syear,sdept);
		Student sy = new Student(syear);
		
		

	}
}

