import java.util.Arrays;
import java.util.Scanner;

public class Id_array {

	public static void main(String[] args) {

		int a[]=new int[5];
		System.out.print("Enter Array element");
          Scanner s=new  Scanner(System.in);
		for (int i=0;i<5;i++)		
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print("\nArray elements: ");
		for (int b:a)
		{
			
			System.out.print(b+" ");
		}
		
		
	}

}
