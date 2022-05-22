package week1.day1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		
		int input=154;
		int ip=input;
		int rem=0,sum=0;
		while(input>0)
		{
			rem = input%10;
			sum = sum + (rem*rem*rem);
			input = input/10;
			
			
		}
		
		System.out.println(sum + "sum"); 
		System.out.println(input + "input"); 
		
		if(ip==sum)
		{
			
			System.out.println("Armstrong Number");
			
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}

}
