package Objects;

class Person {
	
	private String name;
	private String eyeColor;
	private String shirtColor;
	private String hairColor;
	private int age;
	private int weight;
	
	// Constructor
	Person(String name, String eyeColor, String shirtColor,
			String hairColor, int age, int weight)
	{
		
		this.name = name;
		this.eyeColor = eyeColor;
		this.shirtColor = shirtColor;
		this.hairColor = hairColor;
		this.age = age;
		this.weight = weight;		
		
	}
	
	void printInfo()
	{
		
		System.out.println(name + " is " + age + " years old, "
				+ weight + "lbs, with " + eyeColor + " eyes, a "
				+ shirtColor + " shirt and has " + hairColor
				+ " hair! ");
		
	}
	
	// Getter and Setter
	String getName()
	{
		return name;
	}
	
	String getEyeColor()
	{
		return eyeColor;
	}
	
	String getShirtColor()
	{
		return shirtColor;
	}
	
	String getHairColor()
	{
		return hairColor;
	}
	
	int getAge()
	{
		return age;
	}
	
	int getWeight()
	{
		return weight;
	}
	
	void setName(String newName)
	{
		name = newName;
	}
	
	void setEyeColor(String newEyeColor)
	{
		eyeColor = newEyeColor;
	}
	
	void setShirtColor(String newShirtColor)
	{
		shirtColor = newShirtColor;
	}
	
	void setHairColor(String newHairColor)
	{
		hairColor = newHairColor;
	}
	
	void setAge(int newAge)
	{
		age = newAge;
	}

	void setWeight(int newWeight)
	{
		weight = newWeight;
	}

}
