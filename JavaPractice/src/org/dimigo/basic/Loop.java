package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		
		while(true){
			k++;
			for(int i=1; i<=10; i++)
			{
				if(i==k) System.out.print("*");
				System.out.print(i);
			}
			System.out.println();
			
			if(k==10)
			{
				break;
			}
		}
	}

}
