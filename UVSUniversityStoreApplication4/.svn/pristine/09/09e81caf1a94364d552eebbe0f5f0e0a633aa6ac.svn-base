package sg.nus.iss.se22ft1.entity;

public class Member extends Customer {
	
	private String memberName;
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	private int loyaltyPoints = 0;
	
	public Member(String name, String id, int loyaltyPoints) {
		setCustomerId(id);
		this.memberName = name;
		this.loyaltyPoints = loyaltyPoints;		
	}
	
	@Override
	public String toString() {
		return memberName + ","	+ getCustomerId()+ "," + loyaltyPoints;
	}

}
