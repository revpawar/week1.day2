package week1.day1;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,56,3};
		
	    
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				int temp=0;
			
				if(arr[i]>arr[j])
				{
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
				
				System.out.println(arr[i]);
				
				
			}
			
		for(int i=arr.length-1;i>=0 ;i--)
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Second Largest Number in Array is :" + arr[1]);
		}
		

	

}
