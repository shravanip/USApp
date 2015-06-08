package sg.nus.iss.se22ft1.entity;

import java.util.Date;

/**
 * @author Sharique
 * 
 */
public class MemberDiscount extends Discount implements Comparable<MemberDiscount> {

	public MemberDiscount(String discountCode, String description,
			String startDate, String days, double percentageDiscount,
			String applicableToMember) {
		super(discountCode, description, startDate, days, percentageDiscount,
				applicableToMember);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(MemberDiscount md) {
		int i = -1;
		 if(getPercentageDiscount() >md.getPercentageDiscount()){
			 i = 1;
		 }
		return i;
	}
	
	

}
