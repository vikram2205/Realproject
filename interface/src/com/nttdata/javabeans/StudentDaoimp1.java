package com.nttdata.javabeans;

public class StudentDaoimp1  implements StudentDao{




	@Override
	public Student createstudent(Student student) {
		// TODO Auto-generated method stub
		String s=student.getStuName();
		int a=student.getStuid();
		String s1=student.getStuclass();
		student.setStuName(s);
		student.setStuid(a);
		student.setStuclass(s1);
		return student;
	}
}
	
