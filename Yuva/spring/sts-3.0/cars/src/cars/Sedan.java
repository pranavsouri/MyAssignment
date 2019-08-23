package cars;

public class Sedan extends Car{
	String model;

	public String getModel() {
		return model;
	}

	public Sedan(String color, String make, String model) {
		super(color, make);
		this.model = model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
