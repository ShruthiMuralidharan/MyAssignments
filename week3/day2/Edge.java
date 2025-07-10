package week3.day2;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("Take a snap of " +browserName);
	}
	
	public void clearCookies()
	{
		System.out.println("Clear Cookies for " +browserName);
	}

	public static void main(String[] args) {
		Edge e=new Edge();
		e.browserName="Edge";
		e.browserVersion=100.0f;
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();

	}

}
