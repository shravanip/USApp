package sg.nus.iss.se22ft1.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

import sg.nus.iss.se22ft1.entity.Discount;
import sg.nus.iss.se22ft1.entity.MemberDiscount;
import sg.nus.iss.se22ft1.entity.NonMemberDiscount;
import sg.nus.iss.se22ft1.main.Shop;
import sg.nus.iss.se22ft1.util.FileOperations;

/**
 * @author Sharique
 * 
 */
public class DiscountManager {
	public static final String fileName = "Discount.dat";
	public static String fileDetails = Shop.path + fileName;

	public ArrayList<Discount> discountList;
	public ArrayList<MemberDiscount> memberList;
	public ArrayList<NonMemberDiscount> nonMemberList;

	public DiscountManager() { // ArrayList<Category> discountList

		discountList = new ArrayList<Discount>();

		String[] fromFile = FileOperations.readFromFile(fileDetails).toString()
				.split("\n");
		String[] temp = null;
		String code = "", desc = "", sDate = "", appMember = "", days = "";
		float perDiscount;

		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			code = temp[0];
			desc = temp[1];
			sDate = temp[2];
			days = temp[3];
			perDiscount = Float.parseFloat(temp[4]);
			appMember = temp[5];
			Discount m = new Discount(code, desc, sDate, days, perDiscount,
					appMember);
			discountList.add(m);
			// DiscountMap.put(code, m);
		}
		syncMemberSources();
	}

	public void addDiscount(String dcode, String desc, String sdate,
			String days, double e, String applicableToMember) {
		Discount d = new Discount(dcode, dcode, sdate, days, e,
				applicableToMember);
		discountList.add(d);
		syncMemberSources();
	}

	public double getDiscount(String ma, String date) throws ParseException {
		memberList = new ArrayList<MemberDiscount>();
		nonMemberList = new ArrayList<NonMemberDiscount>();

		/*****************/
		String all = "";
		String mem = "";
		double apa = 0.0;
		double apm = 0.0;
		double maxDiscount = 0.0;

		/*******************/
		String[] fromFile = FileOperations.readFromFile(fileDetails).toString().split("\n");
		String[] temp = null;
		String code = "", desc = "", sDate = "", appMember = "", days = "";
		float perDiscount;

		for (int i = 0; i < fromFile.length; i++) {
			temp = fromFile[i].split(",");
			code = temp[0];
			desc = temp[1];
			sDate = temp[2];
			days = temp[3];
			perDiscount = Float.parseFloat(temp[4]);
			appMember = temp[5];

			/**************************/
			if (!sDate.equals("ALWAYS")) {
				if (!date.equalsIgnoreCase("ALWAYS")) {
					String current = date;
					SimpleDateFormat formatter = new SimpleDateFormat(
							"yyyy-MM-dd");
					Date currentDate = formatter.parse(current);
					System.out.println("Current Date :"
							+ formatter.format(currentDate));
					Date date1 = (new SimpleDateFormat("yyyy-MM-dd"))
							.parse(sDate);
					Calendar cal = Calendar.getInstance();
					cal.setTime(date1);
					cal.add(Calendar.DATE, Integer.parseInt(days));
					System.out.println((new SimpleDateFormat("yyyy-MM-dd"))
							.format(cal.getTime()));
					if (date1.getTime() > currentDate.getTime()
							|| cal.getTime().getTime() < currentDate.getTime()) {
						continue;
					}
				}
			}

			if (appMember.equals("A")) {
				NonMemberDiscount nml = new NonMemberDiscount(code, desc,
						sDate, days, perDiscount, appMember);
				nonMemberList.add(nml);
			} else {
				MemberDiscount ml = new MemberDiscount(code, desc, sDate, days,
						perDiscount, appMember);
				memberList.add(ml);
			}

			/**************************/
		}
		Collections.sort(nonMemberList);
		Collections.sort(memberList);

		if (ma.equals("A")) {

			NonMemberDiscount nm = nonMemberList.get(nonMemberList.size() - 1);
			all = nm.getPercentageDiscount() + "\n";
			apa = Double.parseDouble(all);
			maxDiscount = apa;
			System.out.println("All--------->" + all);
		}
		if (ma.equalsIgnoreCase("M")) {
			MemberDiscount nm = memberList.get(memberList.size() - 1);
			mem = nm.getPercentageDiscount() + "\n";
			apm = Double.parseDouble(mem);

			NonMemberDiscount nml = nonMemberList.get(nonMemberList.size() - 1);
			all = nml.getPercentageDiscount() + "\n";
			apa = Double.parseDouble(all);
			maxDiscount = (apm > apa ? apm : apa);

			System.out.println("Mem--------->" + apm);
			System.out.println("maxDiscount--------->" + maxDiscount);
		}
		System.out.println("apm.." + apm);
		System.out.println("apa.." + apa);

		return maxDiscount;
	}

	public String arrayListToString() {
		String s = "";
		int i = 1;
		for (Iterator<Discount> iterator = discountList.iterator(); iterator
				.hasNext(); i++) {
			Discount discount = (Discount) iterator.next();
			s += discount.getDiscountCode() + "," + discount.getDescription()
					+ "," + discount.getStartDate() + ","
					+ discount.getPeriodOfDiscount() + ","
					+ discount.getPercentageDiscount() + ","
					+ discount.getApplicableToMember();
			if (i < discountList.size()) {
				s += "\n";
			}
		}
		return s;
	}

	public void syncMemberSources() {
		FileOperations.overwriteFile(fileDetails, arrayListToString());
	}

}
