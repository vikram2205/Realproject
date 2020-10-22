package com.nttdata.interfaces;

public class Laptop  implements Electronicdevice{
	String color;
	int size;
	int cost;
	String display;
	Harddisk harddisk;
	public Laptop(String color, int size, int cost, String display, Harddisk harddisk) {
		super();
		this.color = color;
		this.size = size;
		this.cost = cost;
		this.display = display;
		this.harddisk = harddisk;
	}
	       
	@Override
	public void startDevice(Electronicdevice e) {
		Laptop l=(Laptop)e;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void stopDevice(Electronicdevice e) {
	Laptop l=(Laptop)e;
		
	}


	public void Displaylaptop() {
		System.out.println("the details of laptop are");
		System.out.println("KEYBOARD"+Electronicdevice.keyboard+"\n"+"COLOR :"+color+"\n"+"SIZE:"+size+"\n"+"COST :"+cost+"\n"+"DISPLAY : "+display+"\n"+"HARDDISK:"+harddisk.Hdsize);
		
		
	}



	
	
	
		
	}






	

	

