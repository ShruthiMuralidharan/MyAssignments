package week1.day2;

public class IsPrime {

	public int IsPrimeNumber(int n) {
		for (int i = 2; i <= (n - 1); i++) {
			if (n % i == 0) {
				System.out.println(n + "is not Prime");
				
			} else {
				System.out.println(n + "is Prime");
				
			}
		}
		return n;
	}

	public static void main(String[] args) {

		IsPrime ip = new IsPrime();
		ip.IsPrimeNumber(13);

	}

}
