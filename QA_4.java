package com.ineuron.asignment1;

public class QA_4 {

	public static void main(String[] args) {
		int n=14;
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i+j>=(n-1)+(n-1)/2  || i-j>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
				
			 }
			     System.out.print(" ");
			
			System.out.println();
		}

	}

}
