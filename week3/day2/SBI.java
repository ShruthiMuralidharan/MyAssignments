package week3.day2;

public class SBI extends Axis implements RBI,Inter{ // multi level interface
	


	public void withDrawalLimit() { //overriden by Axis
		System.out.println("10,000");
		
	}


	public void knowYourCustomer() {
		System.out.println("pancard");
		
	}
	
	public void goldLoan()
	{
		System.out.println("interest rate is 8%");
	}
	
	public static void main(String[] args) {
		SBI s=new SBI();
		s.withDrawalLimit();
		s.knowYourCustomer();
		s.goldLoan();
		s.housingLoan(); //coming from Axis class
		s.systemDesign();
	}


	@Override
	public void systemDesign() {
		System.out.println("design is ready");
		
	}

}
