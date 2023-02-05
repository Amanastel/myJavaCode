package com.masai;


class SimpleInterest{
	void setValues(double pa, double tp, double ir){
	    //write code to assign a value here
		System.out.println(Math.round( (pa*tp*ir) /100 * 100) /100.0);
		
	}
	
//	double getInterestAmount(){
//	    //write code to computer and return the interest amount rounded to two decimal places
//	}
}




public class Main {
	public static void main(String[] args) {
	  SimpleInterest siOne = new SimpleInterest();
      SimpleInterest siTwo = new SimpleInterest();
      siOne.setValues(1005, 2, 7.5);
      siTwo.setValues(1235.50, 2.5, 8.25);
	}
}
