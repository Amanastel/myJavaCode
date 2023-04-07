package com.masai.sprint3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TaxPayer {
	private String PAN;
	private long adhaarNumber;
	private String name;
	TaxPayer(String PAN, long adhaarNumber, String name) {
	    this.PAN = PAN;
	    this.adhaarNumber =adhaarNumber;
	    this.name = name;
	  }

	  public String getPAN() {
	    return PAN;
	  }

	  public void setPAN(String PAN) {
	    this.PAN = PAN;
	  }

	  public long getAdhaarNumber() {
	    return adhaarNumber;
	  }

	  public void setAdhaarNumber(long adhaarNumber) {
	    this.adhaarNumber = adhaarNumber;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    TaxPayer taxPayer = (TaxPayer) o;
	    return adhaarNumber == taxPayer.adhaarNumber && PAN.equals(taxPayer.PAN);
	  }

	  @Override
	  public int hashCode() {
	    int result = PAN.hashCode();
	    result = 31 * result + (int) (adhaarNumber ^ (adhaarNumber >>> 32));
	    return result;
	  }

	  @Override
	  public String toString() {
	    return "Name: " + name + ", PAN: " + PAN + ", Adhaar Number: " + adhaarNumber;
	  }
	}

	class Demo {
	  static boolean checkPAN(String PAN) {
	    String regex = "[A-Za-z]{5}[0-9]{4}[A-Za-z]";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(PAN);
	    return matcher.matches();
	  }

	  static boolean checkAdhaar(long adhaarNumber) {
	    String adhaarNumberString = String.valueOf(adhaarNumber);
	    String regex = "[0-9]{12}";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(adhaarNumberString);
	    return matcher.matches();
	  }

	  static boolean addTaxPayer(TaxPayer[] tpArr, TaxPayer newTP) {
	    for (TaxPayer tp : tpArr) {
	      if (tp != null && tp.equals(newTP)) {
	        return false;
	      }
	    }
	    for (int i = 0; i < tpArr.length; i++) {
	      if (tpArr[i] == null) {
	        tpArr[i] = newTP;
	        return true;
	      }
	    }
	    return false;
	  }


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    //Create an array of objects
	    TaxPayer tpArr[] = new TaxPayer[5];
	    int totalTaxPayers = 0;

	    while(true) {
	      System.out.print("Please enter name, PAN and adhaar Number ");
	      String name = sc.next();
	      String panNumber = sc.next();
	      long adhaarNumber = sc.nextLong();
	      if(checkPAN(panNumber) && checkAdhaar(adhaarNumber)) {
	        //you are here means PAN and adhaar are in correct format
	        if(addTaxPayer(tpArr, new TaxPayer(panNumber, adhaarNumber, name))) {
	          //you are here means tax payer has added to the array
	          System.out.println("Yahoo! Tax payer added\n");
	          if(++totalTaxPayers == tpArr.length)
	            //the array is full so better to break the loop
	            break;
	        }else {
	          System.out.println("Tax Payer with this PAN & adhaar already exists\n");
	        }
	      }else {
	        System.out.println("Enter correct PAN & adhaar number\n");
	      }
	    }

	    System.out.println("Details of tax payers are as follow-");
	    for(TaxPayer tp: tpArr)
	      System.out.println(tp);
	    sc.close();
	  }
	
}
