package com.ineuron.asignment1;

public class QA_1 {

	public static void main(String[] args) {
		
		int n=6;
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || i==5 || j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			 System.out.print("  ");
			 
			 for(j=0;j<n;j++)
				{
					if(j==0 || j==5 || i==j)
						System.out.print("*");
					else
						System.out.print(" ");				
				}
				 System.out.print("  ");
				 
				 for(j=0;j<n;j++)
				 {
					 if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
						 System.out.print("*");
					 else
						 System.out.print(" ");
				 }
				 System.out.print(" ");
				 
				 for(j=0;j<n;j++)
				 {
					 if(j==0 && i!=5 || j==5 && i!=5 || i==5&&j!=0&&j!=5)
						 System.out.print("*");
					 else
						 System.out.print(" ");
				 }
				 System.out.print(" ");
				
				 
				 for(j=0;j<n;j++)
					{
						if(j==0 || i==0 && j!=4 &&j!=n-1 || j==3 && i!=4 && i!=n-2 || i==3 && j!=4 && j!=n-1 || i==4 && j!=1 && j!=n-3&&j!=n-2&&j!=n-1 )
							System.out.print("*");
						else
							System.out.print(" ");				
					}
					System.out.print("  ");
					
					for(j=0;j<n;j++)
					{
						if(j==0&&i!=0&&i!=5 || j==5&&i!=0&&i!=5 || i==0&&j!=0&&j!=5 || i==5&&j!=0&&j!=5)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					
					
					for(j=0;j<n;j++)
					{
						if(j==0 || j==5 || i==j)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
		
			 System.out.println();
			 
	    }
		  

	}
	}
