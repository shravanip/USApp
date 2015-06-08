package sg.nus.iss.se22ft1.entity;

import java.util.ArrayList;

public class Category {
	
	private String categoryCode;
	private String categoryName;
	
	public ArrayList<Vendor> vendorList; 
	
	public Category(String categoryCode,String categoryName){    //, ArrayList<Vendor> vendorList
		
		this.categoryCode=categoryCode;
		this.categoryName=categoryName;
		this.vendorList=new ArrayList<Vendor>();
		
	}
	public void addVendor(){
		
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	
}
