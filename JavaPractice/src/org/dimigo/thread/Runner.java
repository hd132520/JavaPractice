package org.dimigo.thread;

public class Runner extends Thread {
	
	private String name;
	
	public Runner() {
		
	}
	public Runner(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println(name+"���");
		for(int i=100; i>0; i-=10) {
			System.out.println(name + " " + i+"����");
			try{
				sleep(1000);
			} catch (InterruptedException e) { 
				
				e.printStackTrace(); 
			} 
		System.out.println();

		}
		System.out.println(name+" "+"����");
	}
}
