package week3.day2;

public class Chrome extends Browser{
	
	public void openIncognito()
	{
		System.out.println("Open " +browserName+ " in Incognito Mode");
	}
	
	public void clearCache()
	{
		System.out.println("Clear Casche for " +browserName);
	}

	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.browserName="Chrome";
		c.browserVersion=100.0f;
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();

	}

}
