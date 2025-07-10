package week3.day2; //hierarchical Inheritance

public class Auto extends Vehicle{
	
	public void applyMeter()
	{
		System.out.println("pay the amount ---->Auto");
	}

	public static void main(String[] args) {
		Auto a=new Auto();
		a.applyBreak();
		a.applyGear();
		a.applyMeter();

	}

}
