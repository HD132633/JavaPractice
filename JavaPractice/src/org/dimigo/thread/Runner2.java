package org.dimigo.thread;

public class Runner2 implements Runnable{

	private String name;
	
	public Runner2(){
		
	}
	
	public Runner2(String name){
		this.name=name;
	}
	
	@Override
	public void run(){
		System.out.println(name + " 출발");
		for(int i=10; i>=0; i--)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name +" "+ i*10 + "미터");
		}
		System.out.println(name + " 골인");
	}
	
}
