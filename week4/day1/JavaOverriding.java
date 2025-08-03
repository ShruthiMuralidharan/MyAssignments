package week4.day1;

public class JavaOverriding extends JavaOverloading{
	
	public void reportStep(String msg, String status)
	{
		System.out.println("Message is : "+msg);
		System.out.println("Status is : "+status);
	}
	
	
	public static void main(String[] args) {
		JavaOverriding jor = new JavaOverriding();
		jor.reportStep("Msg3", "Pending");

	}

}
