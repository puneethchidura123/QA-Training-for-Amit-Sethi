package Java_OOPs_1;

public class Animals {

	String animalName;
	int noOfLegs;
	boolean canFly;
	static boolean hasEyes;
	String type;
	float heartBeatRate;
	
	Animals(String animalName,int nooflegs,boolean canfly,String type,float heartBeatRate)
	{
		System.out.println("an object of animal is created");
		this.animalName = animalName;
		this.noOfLegs = nooflegs;
		this.canFly = canFly;
		this.type = type;
		this.heartBeatRate = heartBeatRate;
	}
	
	public static void sleep()
	{
		System.out.println("animal  is sleeping");
	}
	
	public void run()
	{
		System.out.println(animalName+"   is running");
	}
	
	public void eatMeat()
	{
		if(type.equals("Carnivores"))
		{
			System.out.println(animalName+" can eat meat");
		}
		else if(type.equals("herbivores"))
		{
			System.out.println(animalName+" cannot eat meat");
		}
		else
		{
			System.out.println(animalName+" can eat meat");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animals Cat = new Animals("cat",12,false,"omnivores",124.453f);
		
		int nooflegs = Cat.noOfLegs;
		System.out.println("no of legs of cat :: "+nooflegs);
		
//		Animals Dog = new Animals();
//		Animals Kangaroo = new Animals();
		
	}

}
