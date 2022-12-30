package Java_OOPS;

public class Car {

	
	static int noOfwheels;
	String brand;
	int enginecapacity;
	
	Car()
	{
	  System.out.println(" an object of car is created successfully");
	}
	
	Car(String Brand)
	{
	  System.out.println(" an object of "+Brand+" is created successfully");
	}
	
	
	public static void start()
	{
		System.out.println("car has started");
	}
	
	public static void stop()
	{
		System.out.println("car has stopped");
	}
	
	public void isElectric(String Brand)
	{
		if(Brand.equals("MercedesBenz"))
		{
			System.out.println(Brand+ " is an electric car");
		}
		else
		{
			System.out.println(Brand+ " is not an electric car");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car tatacar = new Car("tatacar");
		Car BMWCar = new Car("BMWCar");
		Car Ferrari = new Car("Ferrari");
		Car MercedesBenz = new Car("MercedesBenz");
		
		
		

		
//		Car.start();
//		Car.stop();
//		tatacar.isElectric("tatacar");
	}

}
