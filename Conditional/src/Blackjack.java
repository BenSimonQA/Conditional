
public class Blackjack {
	
	public static int play(int first, int second)
	{
		int dis1 = 21 - first;
		int dis2 = 21 - second;
		
		if(first > 21 || second > 21 ) 
		{
			return 0;
		}
		else if(dis1<dis2)
		{
			return first;
		}
		else {
			return second;
		}
	}
	
	public static void main(String[] args)
	{
		int first = 5;
		int second = 16;
		
		if(first<=0 || second<=0)
		{
			System.out.println("Unable!");
		}
		else {
			System.out.println(play(first,second));
		}
	}
	
}
