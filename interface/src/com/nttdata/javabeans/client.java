package com.nttdata.javabeans;

public class client {
	

	public static void main(String args[]) {
		Student sd=new Student("vikram", 10,"last year");
		Marks m=new Marks(30,33);
		StudentDao studentDao=new StudentDaoimp1();
		Student sd1=studentDao.createstudent(sd);
	System.out.println(sd1.getStuName());
		System.out.println(sd1.getStuid());
		System.out.println(sd1.getStuclass());
		
		MarksDao marksDao=new MarksDaoimp1();
	
	
	Marks m1=marksDao.createMarks(m);
		
		System.out.println(m1.getMarks1());
		System.out.println(m1.getMarks2());
	}

}