
public class Product
	{
	private int price;
	private String snackname;
	
	public Product(int p, String sn)
		{
		price=p;
		}

	public int getPrice()
		{
		return price;
		}

	public void setPrice(int price)
		{
		this.price = price;
		}

	public String getSnackname()
		{
		return snackname;
		}

	public void setSnackname(String snackname)
		{
		this.snackname = snackname;
		}

	}
