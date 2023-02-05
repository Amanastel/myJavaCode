package com.masai;
class WatchPriceCalculator{
	  double getWatchPrice(String watchType, int age, String gender){
	    double costPrice = 0.0;
	    double profitPercentage = 0.0;
	    double gst = 0.0;

	    if (watchType.equals("Titan")) {
	      costPrice = 7999;
	      profitPercentage = 12.5;
	      gst = 7.5;
	    } else if (watchType.equals("Rolex")) {
	      costPrice = 10999;
	      profitPercentage = 13.5;
	      gst = 12.5;
	    }

	    double price = costPrice + costPrice * profitPercentage / 100 + costPrice * gst / 100;
	    if (gender.equals("female") && age < 60) {
	      price = price - price * 2 / 100;
	    } else if (age >= 60) {
	      price = price - price * 3 / 100;
	    }

	    return Math.round(price * 100.0) / 100.0;
	  }
	}
public class WatchPriceTester {
	public static void main(String[] args) {
		WatchPriceCalculator wcOne = new WatchPriceCalculator();
		System.out.println(wcOne.getWatchPrice("Titan", 25, "female"));
		System.out.println(wcOne.getWatchPrice("Titan", 61, "male"));
		System.out.println(wcOne.getWatchPrice("Titan", 61, "male"));
		System.out.println(wcOne.getWatchPrice("Titan", 25, "male"));
	}
}
