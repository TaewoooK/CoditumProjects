package obj;

public class Car_Tester {

	public static void main(String[] args) {

		Car c=new Car("Tesla", "123ABC", "Model S", 2017);
		c.setTo60(2.28);
		System.out.println(c.getManufacturer());
		System.out.println(c.getPlate());
		System.out.println(c.getModel());
		System.out.println(c.getYear());

	}

}
