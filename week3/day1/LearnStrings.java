package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		String name="Testleaf";
		String name1="testLeaf";
		String str = new String("Testleaf");
		String str1 = new String("Testleaf");
		
		int length = name.length();
		System.out.println(length);
		
		boolean equals = str.equals(name1);
		System.out.println(equals);
		
		if (str.equals(name1)) {
			System.out.println("values are same");
		} else {
			System.out.println("values are not same");

		}
		// == checks for memory location
		if (str==name) {
			System.out.println("content is same");
		} else {
			System.out.println("content is not same");

		}
		
		//ignore case sensitive --- checks content alone
		boolean equalsIgnoreCase = str.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		
		if (str.contains(name1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");

		}

	}

}
