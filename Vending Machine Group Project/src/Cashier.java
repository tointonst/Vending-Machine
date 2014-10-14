import java.util.Scanner; 
	public class Cashier
		{
		public static void main(String[] args)
		{
		

		}
		
		public int[] addMoney(int value) 
			{
				System.out.println("Please insert money. ex Quarters, Dimes, Nickels, Pennies");
				Scanner userInput1 = new Scanner(System.in);
				String money = userInput1.next();
				
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
						if(userInput1.equals("Nickele") || userInput1.equals("nickele")) 
						{
							value = value + 5; 
						}
						if(userInput1.equals("Penny") || userInput1.equals("penny")) 
						{
							value = value + 1; 
						}
						else 
						{
							value = value + 0; 
						}
					} 
				return ; 
			}
			
			public int[] currentValue() 
			{
				
			}
		}
