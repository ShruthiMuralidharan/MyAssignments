package week3.day2;

public class BMW extends Car{ //Multilevel Inheritance
	
	public void voiceCommand()
	{
		System.out.println("voice command is enabled--->BMW");
	}
	
	public void turnOnAC()
	{
		System.out.println("AC is turned ON --->BMW");
	}

	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBreak();
		b.applyGear();
		b.steering();
		b.voiceCommand();
		b.turnOnAC();

	}

}
