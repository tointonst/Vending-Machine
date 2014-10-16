import java.util.Scanner; 
	public class Cashier
		{
		private int currentCents = 0;
		private int theMoney = 0; 
		public int[] addMoney(int value)
		{
			currentCents = currentCents + value; 
			return currentValue(); 
		}
		public int[] currentValue() 
		{ 
			return new int[]{currentCents / 100, currentCents -(currentCents / 100) * 100}; 
		}
		public static int toPennies(int[] value) 
		{
		  	return ((value[0] * 100) + value[1]); 
		}
		public void purchase(int price) 
		{
			theMoney += price; 
			currentCents -= price;
		}
		public static String showCash(int[] money) 
		{
			return "$" + money[0] + "." + money[1]; 
		}
		public String returnChange(int[] money) 
		{
		  	currentCents -= toPennies(money); 
		  	return showCash(money); 
		}
		//add line
	 }
