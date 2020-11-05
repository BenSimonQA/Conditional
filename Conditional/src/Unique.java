
public class Unique {
	
	public static int sum(int first, int second, int third)
	{
		if(first == second && first == third)
		{
			return 0;
		}
		if(first == second)
		{
			return third;
		}
		else if(first == third)
		{
			return second;
		}
		else if(second == third)
		{
			return first;
		}
		else {
			return first+second+third;
		}
	}
	
	public static void main(String[] args)
	{
		int first = 2;
		int second = 5;
		int third = 3;
		
		System.out.println(sum(first, second, third));
		
	}
}
