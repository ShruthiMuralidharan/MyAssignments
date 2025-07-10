package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int number = 123;
		int input = number;
		int output = 0;
		int reminder;
		for (int i = number; i > 0;) {
			reminder = i % 10;
			output = output * 10 + reminder;
			i = i / 10;
		}
		if (input == output) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}
	}
}