

public class ProductManager
	{
	private String product;
	private String itemCode;
	public ProductManager(String p, String ic)
		{
		product=p;
		itemCode=ic;
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
	
	}

	
