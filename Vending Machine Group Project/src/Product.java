
public class Product
	{
	private int costInCents;
	private String snackName;
	
	public Product(String name ,int price )
		{
		snackName = name;
		costInCents = price;
		}

	public String getSnackName()
		{
		return snackName;
		}
	
	public int[] getPrice()
		{
		int[] money = new int[2];
		money[0] = costInCents/100;
		money[1] = costInCents % 100;
		return money;
		}

	}
