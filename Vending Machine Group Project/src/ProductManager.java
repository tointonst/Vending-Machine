public class ProductManager
	{
	
	private String itemCode;
	private static String nextItemCode = "A1";
	private Product product;
	private int quantity;

	public ProductManager(Product p, int q )
		{
		product = p;
		quantity = q;
		}

	

	public String getItemCode()
		{
		return itemCode;
		}



	public void setItemCode(String itemCode)
		{
		this.itemCode = itemCode;
		}



	public static String getNextItemCode()
		{
		return nextItemCode;
		}



	public static void setNextItemCode(String nextItemCode)
		{
		ProductManager.nextItemCode = nextItemCode;
		}



	public Product getProduct()
		{
		return product;
		}



	public void setProduct(Product product)
		{
		this.product = product;
		}



	public int getQuantity()
		{
		return quantity;
		}



	public void setQuantity(int quantity)
		{
		this.quantity = quantity;
		}
	



	@Override
	public String toString()
		{
		return "ProductManager [itemCode=" + itemCode + ", product=" + product
				+ ", quantity=" + quantity + "]";
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
