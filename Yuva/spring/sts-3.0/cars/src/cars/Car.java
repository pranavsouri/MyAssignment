package cars;

public class Car {
	String color;
	String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + "]";
	}
	public Car(String color, String make) {
		super();
		this.color = color;
		this.make = make;
	}
	
}
