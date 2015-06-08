/**
 * 
 */
package sg.nus.iss.se22ft1.entity;

/**
 * @author SRICHARAN
 *
 */
public class Product {
	/**
	 * @param args
	 */
	private String productId;
	private String productName;
	private String productDescription;
	private int quantityAvaliable;
	private float price;
	private int barCodeNumber;
	private int reorderQuantity;
	private int orderQuantity;

	public Product(String productId, String productName, String productDescription, int quantityAvaliable, float price, int barCodeNumber, int reorderQuantity, int orderQuantity){
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantityAvaliable = quantityAvaliable;
		this.price = price;
		this.barCodeNumber = barCodeNumber;
		this.reorderQuantity = reorderQuantity;
		this.orderQuantity = orderQuantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getQuantityAvaliable() {
		return quantityAvaliable;
	}

	public void setQuantityAvaliable(int quantityAvaliable) {
		this.quantityAvaliable = quantityAvaliable;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	public int getBarCodeNumber() {
		return barCodeNumber;
	}

	public void setBarCodeNumber(int barCodeNumber) {
		this.barCodeNumber = barCodeNumber;
	}
	
	/* Method Name : getCategoryId
	 * Description : To get the category id from product
	 * Input: 
	 * 		none
	 * Output:
	 * 		Category : String
	 */	
	public String getCategoryId() {
		String[] temp = getProductId().split("/");
		String category = temp[0];
		return category;
	}
	
	/* Method Name : getProductNumber
	 * Description : To get the product number from product id
	 * Input: 
	 * 		none
	 * Output:
	 * 		Product Number : Int
	 */
	public int getProductNumber() {
		String[] temp = getProductId().split("/");
		int num = Integer.parseInt(temp[1]);
		return num;
	}
	
	@Override
	public String toString() {
		return  productId + "," + productName + "," +productDescription
				+ "," + quantityAvaliable + "," + price + "," + barCodeNumber
				+ "," + reorderQuantity + "," + orderQuantity;
	}
}
