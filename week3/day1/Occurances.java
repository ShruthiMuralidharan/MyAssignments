package week3.day1;

public class Occurances {

	public static void main(String[] args) {
		String input="saranya";
		
		int count=0;
		
		char[]characters = input.toCharArray();
		
		for (int i = 0; i < characters.length; i++) {
			
			if (characters[i]=='a') {
				
				count++;
				
			}
			
		}
		System.out.println(count);

	}
}
