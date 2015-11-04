package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Runner("지구인");
		Thread t2 = new Runner("화성인");
		
		
		
		t1.start();
		t2.start();
		
		
		
		
		System.out.println("main thread end");
		

	}

}
