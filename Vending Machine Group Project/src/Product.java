
public class Product
	{
	private int price;
	private String snackname;
	private int quantity;
	
	public Product(int p, String sn, int q)
		{
		price=p;
		snackname=sn;
		quantity=q;
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

	public int getQuantity()
		{
		return quantity;
		}

	public void setQuantity(int quantity)
		{
		this.quantity = quantity;
		}

	

	}
