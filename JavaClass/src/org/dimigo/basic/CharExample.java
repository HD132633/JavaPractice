package org.dimigo.basic;

public class CharExample {

	public static void main(String[] args) {
		int unicode = '가';
		System.out.println(unicode);
		
		char ch5 = (char) unicode;
		System.out.println(ch5);;
		
		String name = "김자바";
		System.out.println("My name is" + name);

		System.out.println("123"+10+3.14+name);
	}

}
