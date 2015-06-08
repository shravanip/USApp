package sg.nus.iss.se22ft1.main;

import java.text.ParseException;
import java.util.ArrayList;

import sg.nus.iss.se22ft1.entity.Member;
import sg.nus.iss.se22ft1.entity.Product;
import sg.nus.iss.se22ft1.frames.MainMenuFrame;
import sg.nus.iss.se22ft1.manager.CustomerManager;
import sg.nus.iss.se22ft1.manager.DiscountManager;
import sg.nus.iss.se22ft1.manager.ProductManager;
import sg.nus.iss.se22ft1.manager.TransactionManager;

public class Shop {
	//public static final String path = "C:\\Users\\Gambit\\Desktop\\DAT\\";
	//public static final String path = "C:\\Users\\Sharique\\Desktop\\DAT\\";
	public static final String path = "C:\\DAT\\";
	public static ProductManager productManager = new ProductManager();
	public static CustomerManager customerManager = new CustomerManager();
	public static DiscountManager discountManager = new DiscountManager();
	public static TransactionManager transMgr = new TransactionManager();
	
	public static void main(String[] args) {
		MainMenuFrame mmf = new MainMenuFrame();
		mmf.setVisible(true);
	}

	public static TransactionManager returnTransactionManager() {
		return transMgr;
	}
	public static Product getProductFromProductId(String productId){
		return productManager.getProductFromProductId(productId);
	}	
	
	public static void updateMember(Member m) {
		customerManager.updateMember(m);;
	}
	
	//	public static String checkCredentials(String username, String password) {
	//		return (storeKeeperManager.checkCredentials(username, password));
	//	}
	//
	//	public static String createNewUser(String username, String password) {
	//		return (storeKeeperManager.createNewUser(username, password));
	//	}

	public static double getMaximumDiscount(String ma, String date){
		try {
			return (discountManager.getDiscount(ma, date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static String generateMemberReport() {
		return (customerManager.generateMemberReport());
	}

	public static String addMember(String id, String name, int loyaltyPoints) {
		return customerManager.addMember(id, name, loyaltyPoints);
	}

	public static ArrayList<Member> getMembers() {
		return CustomerManager.memberList;
	}

	public static String customersForDisplay(Member m) {
		return customerManager.toStringForDeleteScreen(m);
	}

	public static void deleteMember(Member m) {
		customerManager.deleteMember(m);
	}

	/*	public static String categoryListToString() {
		return categoryManager.categoryListToString();
	}

	public static String categoryReport() {
		return categoryManager.categoryReport();
	}

	public static String categoryForDisplay() {
		return categoryManager.categoryForDisplay();
	}

	public static void addNewCategory(String categoryCode, String categoryName,
			String vName1, String vName2, String vName3, String vDesc1,
			String vDesc2, String vDesc3) {
		categoryManager.addNewCategory(categoryCode, categoryName, vName1,
				vName2, vName3, vDesc1, vDesc2, vDesc3);
	}

	public static boolean isDuplicate(String code) {
		return categoryManager.isDuplicate(code);
	}

	public static Category getCategoryByCode(String code) {
		return categoryManager.getCategoryByCode(code);
	}

	public static String productReport() {
		return productManager.productReport();
	}

	public static String[] getCategoryCodeArray() {
		return categoryManager.getCategoryCodeArray();
	}

	public static String addVendor(String vendorName, String vendorDescription,
			String catgoryCode) {
		return categoryManager.addVendor(vendorName, vendorDescription,
				catgoryCode);
	}

	public static void addProduct(String productName,
			String productDescription, int quantityAvailable, float price,
			int barCodeNumber, int reorderQuantity, int orderQuantity,
			String categoryCode) {
		productManager.addProduct(productName, productDescription,
				quantityAvailable, price, barCodeNumber, reorderQuantity,
				orderQuantity, categoryCode);
	}
	public static Product getProductFromProductId(String productId){
		return productManager.getProductFromProductId(productId);
	}
	public static Customer getCustomerFromId(String customerId){
		return customerManager.getCustomerFromId(customerId);
	}
	public static String generateTransactionReport(){
		return transactionManager.generateTransactionReport();
	}
	public static float getDiscountPercentage(){
		return 5F;
	}
	public static boolean[] validate(String memberId, String productId, String productQuantity){
		return transactionManager.validate(memberId, productId, productQuantity);
	}
	 */
	public static boolean validateMemberID(String memberId) {
		return customerManager.validateMemberID(memberId);
	}
	/*
	public static boolean validateProductId(String productId) {
		return productManager.validateProductId(productId);
	}

	public static String generateTransactionRecord(String memberId, String productId, String quantity){
		return transactionManager.generateTransactionRecord(memberId, productId, quantity);
	}
	public static float calculateTotal(String productId, String quantity){
		return transactionManager.calculateTotal(productId, quantity);
	}
	 */
	public static Member getMemberFromMemberId(String id){
		return customerManager.getMemberFromMemberId(id);
	}
	/*	
	public static void addTransaction(Transaction t){
		transactionManager.addTransaction(t);
	}
	public static void updateMember(Member m) {
		customerManager.updateMember(m);
	}
	public static void manageProducts(Map <Product, Integer> m){
		productManager.manageProducts(m);
	}
	 */

	public static String productReport() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String categoryReport() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String generateTransactionReport() {
		// TODO Auto-generated method stub
		return null;
	}
}
