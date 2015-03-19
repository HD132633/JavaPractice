package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int a = 3;
		int b = 1500;
		int money = 1700000;
		
		long c = (long)money*12*a*b;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		
		System.out.println("월평균 급여 : "+String.format("%,d",money)+"원");
		
		System.out.println("점포 내 직원 수 : "+a+"명");
		System.out.println("점포 수 : "+String.format("%,d",b)+"개");
		System.out.println();
		System.out.println("연간 인건비 : "+String.format("%,d",c)+"원");
	}

}
