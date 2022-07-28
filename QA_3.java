package com.ineuron.asignment1;

public class QA_3 {

	public static void main(String[] args) {
		int n=14;
		int i,j;

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==0 || i==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
				
			 }
			     System.out.print(" ");
			
			System.out.println();
		}

	}

}
