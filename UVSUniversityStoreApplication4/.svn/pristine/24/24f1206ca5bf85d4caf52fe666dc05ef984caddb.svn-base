package sg.nus.iss.se22ft1.entity;


/**
 * @category 	control the transaction item
 * @author 		xu xiao.
 * @version 	2013/03/16 - Created by xu xiao.
 */

public class TransactionItem {
	
	private	int	quantityPurchased 	= 0;
	private	Product product 		= null;
	
	public TransactionItem(int quantityPurchased, Product product) {
		
		super();
		this.quantityPurchased = quantityPurchased;
		this.product 	= product;
	}
	
	@Override
    public String toString () {
        return (product.getProductId()+ quantityPurchased);
        }
	
    public void show() {
        System.out.println (this);
    }


	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public Product getProduct() {
		return product;
	}



    
}
