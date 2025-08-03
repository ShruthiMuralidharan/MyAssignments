package week4.day1;

public class LearnOverloading {

	//Overloading : the method signature (method name) is same but different input parameters

public void add()
{
	int a=10;
	int b=5;
	System.out.println(a+b);
}

public void add(int a, int b, String name) // giving different parameters, so not throwing error
{
	System.out.println(a+b);
}

public void add(int a, String name, int b) // giving same parameters, but different order. so not throwing error
{
	System.out.println(a+b);
}

public void add(int a, int b, float c) // giving same parameters, but different order. so not throwing error
{
	System.out.println(a+b-c);
}

public static void main(String[] args) {
	LearnOverloading l=new LearnOverloading();
	l.add(5,6,10);
}

}
