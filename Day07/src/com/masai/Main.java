package com.masai;

class FeeExpenses{
	  private double tuitionFee;
	  private double serviceTax;

	  public FeeExpenses(double tuitionFee, double serviceTax) {
	    this.tuitionFee = tuitionFee;
	    this.serviceTax = serviceTax;
	  }

	  public double getTotalFee() {
	    return tuitionFee + tuitionFee * serviceTax / 100;
	  }
	}

	class FeeWithCess extends FeeExpenses{
	  private double cess;

	  public FeeWithCess(double tuitionFee, double serviceTax, double cess) {
	    super(tuitionFee, serviceTax);
	    this.cess = cess;
	  }

	  @Override
	  public double getTotalFee() {
	    return super.getTotalFee() * cess / 100;
	  }
	}

	public class Main{
	  public static void main(String args[]){
	    FeeExpenses fe = new FeeExpenses(45000.0, 10.0);
	    System.out.println("Total fee is " + fe.getTotalFee());
	    FeeWithCess fc = new FeeWithCess(50000.0, 11.5, 2.5);
	    System.out.println("Total fee is " + fc.getTotalFee());
	  }
	}

