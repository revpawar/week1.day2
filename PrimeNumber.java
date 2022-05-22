package week1.day1;


public class PrimeNumber
{

	public static void main(String[] args)
	{
	int primeNumber =4;
	int flag=0;
	for(int i=2;i<primeNumber;i++)
	{
	if(primeNumber%i==0)
	{
//		System.out.println("Not a Prime Number");
		flag=1;
		break;
	}
	}
	if(flag==1)
		System.out.println("not a prime no");
	}
}
