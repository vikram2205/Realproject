package com.nttdata.interfaces;

public class Mobile implements Electronicdevice {
 String color;
 int size;
 int cost;
 String display;
 processor processor;
     public Mobile(String color,int size,int cost,String display,processor processor) {
    	 super();
    	 this.color = color;
    	 this.size = size;
    	 this.display = display;
    	 this.processor = processor;
     }
    
     public void Displaymobile() {
    	 System.out.println("the details of mobile are shown in below");
    	 System.out.println("KEYBOARD"+Electronicdevice.keyboard+"\n"+"COLOR :"+color+"\n"+"SIZE:"+size+"\n"+"DISPLAY : "+display+"\n"+"processor:"+processor.procType);
    	 
     }

	@Override
	public void startDevice(Electronicdevice e) {
		// TODO Auto-generated method stub
		 Mobile m=(Mobile)e;
	}

	@Override
	public void stopDevice(Electronicdevice e) {
		// TODO Auto-generated method stub
		 Mobile m=(Mobile)e;
	}
}
