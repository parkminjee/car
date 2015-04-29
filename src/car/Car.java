package car;

public class Car {
	String name;
	int speed;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}

	static int numberOfCars;
	
	public Car(){
		name="MyCar";
		speed = 0;
		numberOfCars++;
	}
}
