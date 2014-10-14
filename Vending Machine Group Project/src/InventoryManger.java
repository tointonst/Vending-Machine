import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class InventoryManger
	{
	static String product;
	static int price;
	static int quantity;
	static int numberOfLines;
	static ArrayList<ProductManager> allProducts=new ArrayList<ProductManager>();
	
	public static void arrayFiller() throws FileNotFoundException
	{
	Scanner file = new Scanner(new File("snacks.txt"));
	numberOfLines = file.nextInt();
	for (int i = 0; i < numberOfLines; i++)
		{
		product = file.next();
		price = file.nextInt();
		quantity = file.nextInt();
		allProducts.add(new ProductManager(product, price, quantity));
		}
	System.out.println(allProducts);
	}

	}


