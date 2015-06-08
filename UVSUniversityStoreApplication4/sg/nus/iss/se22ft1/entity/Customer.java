package sg.nus.iss.se22ft1.entity;


public class Customer {
	public static final String PUBLIC = "PUBLIC";
	private String customerId = PUBLIC;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
