package week4.day1;

public class JavaOverloading {
	
	public void reportStep(String msg, String status)
	{
		System.out.println("Message is : "+msg);
		System.out.println("Status is : "+status);
	}
	public void reportStep(String msg, String status, boolean snap)
	{
		System.out.println("Message is : "+msg);
		System.out.println("Status is : "+status);
		System.out.println("Snapshot needed? "+snap);
	}

	public static void main(String[] args) {
		JavaOverloading jo = new JavaOverloading();
		jo.reportStep("Msg1", "Open");
		jo.reportStep("Msg2", "Close", false);

	}

}
