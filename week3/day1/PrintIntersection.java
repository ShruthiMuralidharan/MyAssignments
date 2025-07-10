package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		int num[] = { 3, 4, 2, 5, 6 };
		int num1[] = { 2, 4, 7, 8, 9 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {

				if (num[i] == num1[j]) {
					System.out.println("intersection is:" + num[i]);

				}

			}

		}

	}

}
