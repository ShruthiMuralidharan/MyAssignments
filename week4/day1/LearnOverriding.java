package week4.day1;

public class LearnOverriding extends LearnOverloading{
	
	// Method Overriding:method name and parameter should be same
	
	public void add()// up arrow indicates overriding
	{
		int a=3;
		int b=4;
		System.out.println(a+b);
	}
	public void add(int a, int b)// method not overriding even with same name as different parameters are given
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverriding lo = new LearnOverriding();
		lo.add();// due to overriding performing the latest addition values 3+4 and not using values from LearnOverloading
		lo.add(5,6);
	}

}
