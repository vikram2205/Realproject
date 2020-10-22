package com.nttdata.interfaces;

public class client {
public static void main(String[] args) {
	
	processor pc=new processor("QUAD CORE");
	Mobile m=new Mobile("blue",6,25000,"AMOLED",pc);
	m.startDevice(m);
	m.Displaymobile();
	System.out.println("-------------------------------------");
	Harddisk HD =new Harddisk(1);
    Laptop l=new Laptop("silver",15,30000,"quartz",HD);
	l.startDevice(l);
	l.Displaylaptop();
}
}
