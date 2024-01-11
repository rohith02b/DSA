class Car {
	private String name;
	private float speed;
	
	public Car(String name ,float speed)
	{
		this.name = name;
		this.speed = speed;
	}


	public void display()
	{
		System.out.println("Name of car : " + this.name);
		System.out.println("This speed of the car is : " + this.speed);
	}
}


class classesAndObjects {
 public static void main(String[] args)
 {
	 Car tesla = new Car("Tesla 1",2.5f);
	 tesla.display();
 }
}