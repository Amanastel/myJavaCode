package com.masai;



class JoyInfocom{
	double getBillAmount(boolean usingCallService, boolean usingDataService,boolean  usingSMSService){
		double sum=0;
		if (usingCallService==true) {
			sum+=300;
		}
		if (usingDataService==true) {
			sum+=125;
		}
		if (usingSMSService==true) {
			sum+=50;
		}
		return sum;
	}
}
public class JoyInfocomTester {
	public static void main(String args[]) {
		JoyInfocom joy = new JoyInfocom();
		System.out.println(joy.getBillAmount(true, true, false));
		System.out.println(joy.getBillAmount(true, false, false));
		System.out.println(joy.getBillAmount(true, true, true));
	}
}
