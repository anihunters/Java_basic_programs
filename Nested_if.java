
public class Nested_if {

	public static void main(String[] args) {

		int num1=10,num2=20,num3=60;

		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.print("Maximum number: +num1");
			}
			else
			
				System.out.print("Maximum number: +num3");
            }
			else
			{
				if(num2>num3)
				{
					System.out.print("Maximum number: +num2");

				}
				else
				{
					System.out.print("Maximum number: +num3");

				}
			
		}
	}

}
