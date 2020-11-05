
public class Taxes {

	public static int percentage(int money)
	{
		if(money>=0 && money<=14990)
		{
			return 0;
		}
		else if(money>=15000 && money<=19999)
		{
			return 10;
		}
		else if(money>=20000 && money<=29999){
			return 15;
		}
		else if(money>=30000 && money<=44999)
		{
			return 20;
		}
		else if(money>=45000)
		{
			return 25;
		}
		return 0;
	}
	
	public static int tax(int money, int tax)
	{
		return (money * tax)/100;
	}
	
	public static void main(String[] args)
	{
		int money = 32000;
		int percent = percentage(money);
		int tax;
		
		System.out.println(percent + "% tax");
		
		tax = tax(money, percent);
		System.out.println(tax);
		
	}
}
