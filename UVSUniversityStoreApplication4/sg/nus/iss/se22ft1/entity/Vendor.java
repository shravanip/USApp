package sg.nus.iss.se22ft1.entity;

public class Vendor {
	
	private String vendorName;
	private String vendorDescription;
	
	public Vendor(String vendorName,String vendorDescription){
	
		this.vendorName=vendorName;
		this.vendorDescription=vendorDescription;
	}
	
	public String getVendorName() {
		return vendorName;
	}

	public String getVendorDescription() {
		return vendorDescription;
	}

	public Vendor(){
		
	}

}
