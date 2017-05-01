
public class Functions_Temperature {

	
	//Function that converts fahrenheit to celsius 
	public static double ftoc (float temperature)
	{
		double f=(temperature-32)/1.8;
		return f;
	}

	//Function that converts celsius to fahrenheit
	public static double ctof (float temperature)
	{
		double c=temperature*1.8+32;
		return c;
	}


	public static void main(String[] args) {

		double f=ftoc(90);
		System.out.println(f);

		double c=ctof(25);
		System.out.println(c);

	}

}
