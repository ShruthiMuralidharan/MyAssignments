package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f0 = 0;
		int f1 = 1;
		int range = 8;
		System.out.println(f0);
		System.out.println(f1);
		int f2;
		for (int i = 2; i < range; i++) {
			f2 = f0 + f1;
			System.out.println(f2);
			f0 = f1;
			f1 = f2;

		}

	}

}