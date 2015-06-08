package sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sg.nus.iss.se22ft1.entity.*;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.util.FileOperations;

public class CategoryManager {

	public static final String fileName = "Category.dat";//Only concerned filename should be mentioned here.
	public static String fileDetails = Shop.path + fileName;
	
	
	public static ArrayList<Category> CategoryList;
	
	
	public CategoryManager(){  
		
		
		CategoryList= new ArrayList<Category>();
		
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String code="", name = "";
		for (int i = 0; i < fromFile.length; i++) {
			temp=fromFile[i].split(",");
			code=temp[0];
			name=temp[1];			
			Category c = new Category(code,name);			
			CategoryList.add(c);
			
		}
		
	}
	
	public void addCategory(Category c){
		
		CategoryList.add(c);
		syncMemberSources();
		
	}
	
	public String[] getCategories(){
		String []s= new String[100];
		int i=0;
		for (Iterator<Category> iterator = CategoryList.iterator(); iterator.hasNext();i++) {
			Category category = (Category) iterator.next();
			
			s[i]=category.getCategoryName();
			
			}
		return s;
	}
	
	public void addVendorForCategory(Category c,ArrayList<Vendor> vendorList){
		
		String CategoryFile=Shop.path+c.getCategoryCode()+"Vendors";
		FileOperations.overwriteFile(CategoryFile, VendorArrayListToString(c.vendorList));
	}
	
	public void show(){
		
	}
	
	public String arrayListToString() {
		String s = "";
		int i=1;
		for (Iterator<Category> iterator = CategoryList.iterator(); iterator.hasNext();i++) {
			Category category = (Category) iterator.next();
			s+=category.getCategoryName()+"," + category.getCategoryCode();
			if(i<CategoryList.size()){
				s+="\n";
			}
		}
		return s;
	}
	
	public String VendorArrayListToString(ArrayList<Vendor> a) {
		String s = "";
		int i=1;
		for (Iterator<Vendor> iterator = a.iterator(); iterator.hasNext();i++) {
			Vendor v = (Vendor) iterator.next();
			s+=v.getVendorName()+"," + v.getVendorDescription();
			if(i<a.size()){
				s+="\n";
			}
		}
		return s;
	}
	
	public static void main(String[] args){
		
		CategoryManager cm= new CategoryManager();
		for(int i=0;i<cm.getCategories().length;i++){
			if (cm.getCategories()[i]==null)
				break;
			System.out.println(cm.getCategories()[i]);
		}
	}
	
	public void syncMemberSources(){
		
		FileOperations.overwriteFile(fileDetails, arrayListToString());		
	}
	
}
