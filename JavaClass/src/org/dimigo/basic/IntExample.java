package org.dimigo.basic;

public class IntExample {

	public static void main(String[] args) {
		String name="아이유";
		boolean trans=true;
		int year=23;
		double ki=161.8;
		float weight=(float) 44.3;
		char blood='A';
		
		System.out.println("이름:"+name);
		if(trans)
		{
			System.out.println("성별:여자");
		}
		else
		{
			System.out.println("성별:남자");
		}
		System.out.println("나이:"+year+"세");
		System.out.println("키:"+ki+"cm");
		System.out.println("몸무게:"+weight+"kg");
		System.out.println("혈액형:"+blood+"형");
	}
}