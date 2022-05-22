package week1.day1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		int num1 = 0, num2 = 1;
		
		int nos = 8;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<=8;i++)
		{
		num3=num1+num2;
		System.out.println(num3);
		
		num1=num2;
		num2=num3;
		
		}
		

	}


}
