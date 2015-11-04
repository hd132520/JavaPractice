package org.dimigo.thread;

public class Runner extends Thread {
	
	private String name;
	
	public Runner() {
		
	}
	public Runner(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println(name+"출발");
		for(int i=100; i>0; i-=10) {
			System.out.println(name + " " + i+"미터");
			try{
				sleep(1000);
			} catch (InterruptedException e) { 
				
				e.printStackTrace(); 
			} 
		System.out.println();

		}
		System.out.println(name+" "+"골인");
	}
}
