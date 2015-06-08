package sg.nus.iss.se22ft1.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sg.nus.iss.se22ft1.entity.Customer;
import sg.nus.iss.se22ft1.entity.Member;
import sg.nus.iss.se22ft1.entity.NonMember;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.util.FileOperations;

//Whenever any operations are performed, the Map is updated and syncMemberSources() is called
public class CustomerManager {

	public static final String fileName = "Members.dat";// Only concerned
	// filename should be
	// mentioned here.
	public static String fileDetails = Shop.path + fileName;

	public static Map<String, Member> memberMap = new HashMap<String, Member>();
	public static ArrayList<Member> memberList;

	public CustomerManager() {
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String name = "", id = "";
		int loyalty = 0;
		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			name = temp[0];
			id = temp[1];
			loyalty = Integer.parseInt(temp[2]);
			Member m = new Member(name, id, loyalty);
			memberMap.put(id, m);
		}
		syncMemberSources();
	}

	public String addMember(String id, String name, int loyaltyPoints) {
		if (id == null && name == null) {
			return "MISSING_PARAMETER";
		}
		if(id.equalsIgnoreCase("") && name.equalsIgnoreCase("")){
			return "MISSING_PARAMETER";
		}			
		Member newMember = new Member(name, id, loyaltyPoints);
		Member mTemp = getMemberFromMemberId(id);
		if(mTemp != null){
			return "ALREADY_EXISTS";
		}else{
			memberMap.put(id, newMember);
			syncMemberSources();
		}
		return "MEMBER_ADDED";
	}

	public void deleteMember(Member m) {
		if(m!= null){
			memberMap.remove(m.getCustomerId());
			syncMemberSources();
		}
	}

	public Member getMemberFromMemberId(String id) {
		return memberMap.get(id);
	}

	public String memberListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Member> iterator = memberList.iterator(); iterator
				.hasNext(); i++) {
			Member member = (Member) iterator.next();
			s += member.toString();
			if (i < memberList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public String generateMemberReport() {
		String s = "\t\tList Of Members\n\t\t==================\n\n";
		s+= String.format("%15s\t%15s\t\t%s","Name", "Member Id", "Loyalty Points");
		s+= "\n--------------------------------------------------------\n";
		Iterator<Member> it = memberList.iterator();
		while (it.hasNext()) {
			Member member = (Member) it.next();
			String temp = String.format("%15s\t%15s\t\t%d",
					member.getMemberName(), member.getCustomerId(), member.getLoyaltyPoints());
			s+=temp + "\n";
			
		}
		return s;
	}

	public void syncMemberSources() {
		memberList = new ArrayList<Member>(memberMap.values());
		FileOperations.overwriteFile(fileDetails, memberListToString());
	}

	public String toStringForDeleteScreen(Member m) {
		String s = "'" + m.getMemberName() + "' (" + m.getCustomerId() + ") with " + m.getLoyaltyPoints() + " loyalty points"; 
		return s;
	}

	public Customer getCustomerFromId(String customerId){
		Customer c = new NonMember();;
		if("PUBLIC".equalsIgnoreCase(customerId)){
			return new NonMember();
		}
		Iterator<Member> it = memberList.iterator();
		while (it.hasNext()) {
			Member member = (Member) it.next();
			if(customerId.equalsIgnoreCase(member.getCustomerId())){
				c = member;
			}
			
		}
		return c;
	}

	public boolean validateMemberID(String memberId) {
		if("PUBLIC".equalsIgnoreCase(memberId))
			return true;
		else if(getCustomerFromId(memberId).getCustomerId().equalsIgnoreCase("PUBLIC")){
			return false;
		}
		return true;
	}
	
	public void updateMember(Member m) {
		memberMap.put(m.getCustomerId(), m);
		syncMemberSources();
	}
}