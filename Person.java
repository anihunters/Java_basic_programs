
public class Person {

	int age=21;
	int weight=72;
	java.lang.String color="light";
	
	void eat()
	{
		System.out.println("I am eating ");
	}
	void sleep()
	{
		System.out.println("I am sleeping");
	}
	
	public static void main(String[]args) {
	
	Person P=new Person(); 
	System.out.println(P.age);
	System.out.println(P.weight);
	System.out.println(P.color);
	
	P.eat();  P.sleep();
	}

}
