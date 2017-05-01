
public class Function_Circle_Area {

	//Function that finds the area of a circle
	public static double circlearea(float radius)
	{
		double a=3.14*(radius*radius);
		return a;
	}

	//Function that finds the circumference of a circle
	public static double circlecir(float radius)
	{
		double c=3.14*(2*radius);
		return c;
	}
	
	public static void main(String[] args) {

		double a=circlearea(5);
		System.out.println(a);
		double c=circlecir(9);
		System.out.println(c);
	}

}
