package org.dimigo.thread;

public class Race {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread start");
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}