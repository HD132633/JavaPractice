package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a=9,b=10;
		double h=5.8;
		int a2=9;
		double h2=5.4;
		
		double s1 = ((double)(a+b)*h)/2;
		double s2 = (double)(a2)*h2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : "+s1);
		System.out.println("평행사변형 넓이 : "+s2);
		
		System.out.println();
		if(s1>s2)
		{
			System.out.println("사다리꼴이 평행사변형 보다 "+(s1-s2) + " 더 큽니다.");		
		}
		if(s1<s2)
		{
			System.out.println("평행사변형 보다 사다리꼴이 "+(s2-s1) + " 더 큽니다.");
		}
		if(s1==s2)
		{
			System.out.println("사다리꼴과 평행사변형이 같습니다");
		}
	}

}
