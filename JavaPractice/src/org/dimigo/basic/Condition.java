package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int dist=10;
		int money=0;
		String car="그 외";
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : "+dist+"km");
		System.out.println("차종류 : "+car);
		
		switch(car)
		{
		case "고속버스":
			money+=850+(dist/10)*300;
			break;
		case "경차":
			money+=300+(dist/10)*200;
			break;
		case "그 외":
			money+=600+(dist/10)*200;
			break;
		}
		
		if(dist==10)
		{
			switch(car)
			{
			case "고속버스":
				money-=300;
				break;
			case "경차":
				money-=200;
				break;
			case "그 외":
				money-=200;
				break;
			}
		}
		System.out.println("통행료 : "+money+"원");

	}

}
