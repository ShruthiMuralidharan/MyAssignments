package week3.day2; //Simple Inheritance

public class Car extends Vehicle{  //need not give main method in vehicle class when extends is used
	
	public void steering()
	{
		System.out.println("adjusting the controls--->car");
	}

	public static void main(String[] args) {
		Car c=new Car(); //as car is an extention of vehicle, no need to create seperate object for vehicle
		c.steering();
		c.applyBreak();
		c.applyGear();

	}

}
