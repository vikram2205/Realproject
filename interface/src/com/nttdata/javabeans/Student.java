package com.nttdata.javabeans;

public class Student {
	private String StuName;
	   private int  stuid ;
	   private String stuclass;
	 
	
	public String getStuName() {
		return StuName;
	}


	public void setStuName(String stuName) {
		StuName = stuName;
	}


	public int getStuid() {
		return stuid;
	}


	public void setStuid(int stuid) {
		this.stuid = stuid;
	}


	public String getStuclass() {
		return stuclass;
	}


	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}


	public Student(String stuName, int stuid, String stuclass) {
		super();
		StuName = stuName;
		this.stuid = stuid;
		this.stuclass = stuclass;
	}


	

	
	
}
