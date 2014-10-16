public class ProductManager
	{
	private String product;
	private String itemCode;

	public ProductManager(String p, String ic)
		{
		product = p;
		itemCode = ic;
		}

	public String getProduct()
		{
		return product;
		}

	public void setProduct(String product)
		{
		this.product = product;
		}

	public String getItemCode()
		{
		return itemCode;
		}

	public void setItemCode(String itemCode)
		{
		this.itemCode = itemCode;
		}

	public boolean isInStock()
		{
		if (InventoryManger.quantity > 0)
			{
			return true;
			}

		else
			{
			return false;
			}
		}

	public boolean vendItem()
		{
		if (isInStock()== true)
			{
			InventoryManger.quantity = InventoryManger.quantity-1;
			return true;
			}
		else
			{
			return false;
			}
		}
	
	public static void incrementItemCode()
		{
		
		}

	}
