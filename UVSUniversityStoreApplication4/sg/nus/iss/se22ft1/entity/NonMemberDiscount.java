package sg.nus.iss.se22ft1.entity;

/**
 * @author Sharique
 * 
 */
public class NonMemberDiscount extends Discount implements Comparable<NonMemberDiscount> {

	public NonMemberDiscount(String discountCode, String description,
			String startDate, String days, double percentageDiscount2,
			String applicableToMember) {
		super(discountCode, description, startDate, days, percentageDiscount2,
				applicableToMember);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(NonMemberDiscount nmd) {
		int i = -1;
		 if(getPercentageDiscount() >nmd.getPercentageDiscount()){
			 i = 1;
		 }
		return i;
	}


	

}
