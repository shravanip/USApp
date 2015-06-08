/**
 * 
 */
package sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;

import sg.nus.iss.se22ft1.entity.Product;
import sg.nus.iss.se22ft1.frames.MainMenuFrame;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.util.FileOperations;

/**
 * @author SRICHARAN
 *
 */
public class ProductManager {

	/**
	 * @param args
	 */
	ArrayList<Product> productList;
	int pruductNumber;
	public final String FILENAME = "Products.dat";
	public final String PATH = "C:\\Users\\SRICHARAN\\Desktop\\MTECH\\UniversityStore4\\UniversityStoreApplication\\";
	public final String FILEPATH = PATH + FILENAME;

	/* Constructor Name : ProductManager
	 * Description : To get the product list from file and save it in array list
	 * Input: 
	 * 		none
	 * Output:
	 * 		none
	 */
	public ProductManager() {
		productList = new ArrayList();
		String[] products = FileOperations.readFromFile(FILEPATH).toString().split("\n");
		String[] param = null;
		for ( int itr = 0 ; itr < products.length ; itr++ ) {
			param = products[itr].toString().split(",");
			Product temp = new Product(param[0], param[1], param[2], Integer.parseInt(param[3]), Float.parseFloat(param[4]), Integer.parseInt(param[5]), Integer.parseInt(param[6]), Integer.parseInt(param[7]));
			productList.add(temp);
		}
	}
	
	/* Method Name : addProduct
	 * Description : To add a new product to product list and update it in the file
	 * Input: 
	 * 		category 			: String
	 * 		name     			: String
	 * 		description 		: String
	 * 		quantityAvaliable	: int
	 * 		price				: float
	 * 		barCodeNumber 		: int
	 * 		reorderQuantity 	: int
	 * 		orderQuantity 		: int
	 * Output:
	 * 		none
	 */
	public void addProduct(String category, String name, String description, int quantityAvaliable, float price, int barCodeNumber, int reorderQuantity, int orderQuantity) {
		if (checkExistingProduct(barCodeNumber)) {
			Product temp = new Product(nextProductId(category), name, description, quantityAvaliable, price, barCodeNumber, reorderQuantity, orderQuantity);
			productList.add(temp);
			FileOperations.appendToFile(FILEPATH, temp.toString());
		} else {
			System.out.println("Product with Same Barcode exist in Database");
		}
	}
	
	/* Method Name : checkExistingProduct
	 * Description : To check whether the new product is present in file by checking the bar codes
	 * Input: 
	 * 		barCodeNumber	:	int
	 * Output:
	 * 		True	- 	Product is not present in file
	 * 		False	-	Product is already present in file
	 */
	public boolean checkExistingProduct(int barCodeNumber) {
		boolean flag = true;
		for (Product temp : productList) {
			if (temp!=null && temp.getBarCodeNumber()==barCodeNumber) {
				flag = false;
			}
		}
		return flag;
	}
	
	/* Method Name : getProductFromProductId
	 * Description : To get the product information based on product id
	 * Input: 
	 * 		ProductId 	: String
	 * Output:
	 * 		Product		: Product Entity	
	 */
	public Product getProductFromProductId(String productId) {
		for (Product temp : productList) {
			if (temp!=null && temp.getProductId().equalsIgnoreCase(productId)){
				return temp;
			}
		}
		return null;
	}
	
	/* Method Name : productToString
	 * Description : To get the list of product details in one lines to write in file
	 * Input: 
	 * 		none
	 * Output:
	 * 		Products List : String
	 */
	public String productToString() {
		String products = "";
		for (Product temp : productList){
			products += temp.toString();
			products += "\n";
		}
		return products;
	}
	
	/* Method Name : sync
	 * Description : To sync the data structure and file by writing the data from arraylist to file
	 * Input: 
	 * 		none
	 * Output:
	 * 		none
	 */
	public void sync(){
		FileOperations.overwriteFile(FILEPATH, productToString());
	}
	
	/* Method Name : nextProductId
	 * Description : To get the next product id based on category
	 * Input: 
	 * 		Category  : String
	 * Output:
	 * 		ProductId : String
	 */
	public String nextProductId(String category) {
		int max = 0;
		for (Product temp : productList){
			if (temp!=null && temp.getCategoryId()!=null && temp.getCategoryId().equalsIgnoreCase(category)) {
				if (max < temp.getProductNumber())	{
					max = temp.getProductNumber();
				}
			}
		}
		String productId = category + "/" +String.valueOf((max+1));
		return productId;
	}
	
	/* Method Name : getReorderList
	 * Description : To get the list of products which are below threshold.
	 * Input: 
	 * 		none
	 * Output:
	 * 		ProductList : ArrayList
	 */
	public ArrayList<Product> geReorderList() {
		ArrayList<Product> reOrderList = new ArrayList<Product>();
		for (Product temp : productList) {
			if (temp.getQuantityAvaliable() < temp.getReorderQuantity()) {
				reOrderList.add(temp);
			}
		}
		return reOrderList;
	}
	
	/* Method Name : show
	 * Description : To get the list of products along with other details.
	 * Input: 
	 * 		none
	 * Output:
	 * 		none
	 */
	public void show() {
		System.out.println("ProductID\t  Name\t\tDescription\t\tQuantity\tPrice\tBarcode\tReorder Quantity\tOrder Quantity");
		for (Product temp : productList) {
			System.out.println("  "+temp.getProductId()+"\t    "+temp.getProductName()+"\t"+temp.getProductDescription()+"\t\t"+temp.getQuantityAvaliable()+"\t"+temp.getPrice()+"\t"+temp.getBarCodeNumber()+"\t"+temp.getReorderQuantity()+"\t"+temp.getOrderQuantity());
		}
	}
}