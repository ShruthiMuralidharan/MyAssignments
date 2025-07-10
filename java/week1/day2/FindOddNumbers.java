package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		System.out.println("Printing odd numbers between 1 and 10");
		for (int maxRange = 0; maxRange <= 10; maxRange++) {
			if (maxRange % 2 != 0) {
				System.out.println(maxRange);
			}
		}
	}
}
