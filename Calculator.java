package week1.day1;

public class Calculator {
	
	public int Sum(int a,int b)
	{
		return a+b;
	}
	public int Sub(int a,int b)
	{
		return a-b;
	}
	public int Mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.Sum(2, 3));
		System.out.println(calc.Sub(2, 3));
		System.out.println(calc.Mul(2, 3));
		System.out.println(calc.div(2, 3));
		
		
	}
}
