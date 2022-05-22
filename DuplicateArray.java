package week1.day1;

public class DuplicateArray {
	
	public static void main(String[] args)
	{
		
		String[] names = {"Java","JavaScript","Python","Java"};
		int length = names.length;
		System.out.println(length);
		
		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=i+1;j<=names.length-1;j++)
			{
				if(names[i]==names[j])
				{
					System.out.println(names[i]);
					System.out.println("Duplicates found");
			
				}
			
			}
		}
		
	}
	}
	

