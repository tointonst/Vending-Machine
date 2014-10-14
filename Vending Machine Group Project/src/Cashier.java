import java.util.Scanner; 
	public class Cashier
		{
		private int currentCents; 
		
			public int[] addMoney(int value) 
			{
				System.out.println("Please insert money. ex Quarters, Dimes, Nickels, Pennies");
				Scanner userInput1 = new Scanner(System.in);
				int money = userInput1.nextInt();
				
				for(int i = 0; i < 10; i++) 
					{
						if(userInput1.equals("Quarter") || userInput1.equals("quarter")) 
						{
							value = value + 25; 
						}
						if(userInput1.equals("Dime") || userInput1.equals("dime")) 
						{
							value = value + 10; 
						}
					} 
			}
		}
