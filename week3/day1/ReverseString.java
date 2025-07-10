package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName = "Testleaf";
		char cN[] = companyName.toCharArray();
		String rev = "";
		for (int i = cN.length-1; i >=0 ; i--) {
			rev+= cN[i];
		
		}
		System.out.println(rev);

	}

}
