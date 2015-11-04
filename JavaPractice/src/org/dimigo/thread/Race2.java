package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner("지구인"));
		Thread t2 = new Thread(new Runner("화성인"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		
		
		
		System.out.println("main thread end");
		

	}

}
