
public class Runner {
	
	public static double sum(double first, double second)
	{
		return first + second;
	}
	
	public static double mult(double first, double second)
	{
		return first * second;
	}
	
	public static void main(String[] args)
	{
		double first = 1;
		double second = 4;
		boolean result = false;
		
		if(result == true)
		{
			System.out.println(sum(first,second));
		}
		else {
			System.out.println(mult(first,second));
		}
	}
	
}
