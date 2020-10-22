package com.nttdata.javabeans;

public class MarksDaoimp1  implements MarksDao{
	public Marks createMarks(Marks marks) {
		int i=marks.getMarks1();
		int i1=marks.getMarks2();
		marks.setMarks1(i);
		marks.setMarks2(i1);
		return marks;
		
	}
	

}
