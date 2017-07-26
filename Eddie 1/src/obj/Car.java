package obj;

public class Car {
	private int numWheels=4;
	private int numDoors=4;
	private int numSeats=5;
	private String plate;
	private int numHeadlights=2;
	private int topSpeed=155;
	private String manufacturer;
	private String model;
	private int year;
	private double to60=6;

	public Car(String manufacturer, String plate, String model, int year)
	{
		this.manufacturer = manufacturer;
		this.plate = plate;
		this.model = model;
		this.year = year;
	}
	
	public int getAge(int currentYear)
	{
		return currentYear - year;
	}

	public int getNumWheels()
	{
		return numWheels;
	}
	
	public void setNumWheels(int numWheels)
	{
		this.numWheels=numWheels;
	}
	
	public int getNumDoors()
	{
		return numDoors;
	}
	public void setNumDoors(int numDoors)
	{
		this.numDoors=numDoors;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getNumHeadlights() {
		return numHeadlights;
	}

	public void setNumHeadlights(int numHeadlights) {
		this.numHeadlights = numHeadlights;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getTo60() {
		return to60;
	}

	public void setTo60(double to60) {
		this.to60 = to60;
	}
	
	
}
