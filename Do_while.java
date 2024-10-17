import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {

		int num;
		System.out.print("Enter any number");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		do
		{
			System.out.print("spread love");
		}
		while(num<0);
	}

}
