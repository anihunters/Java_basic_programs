import java.util.Scanner;

public class Fitnessapp {

	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your current weight: ");
	    double weight = input.nextDouble();
	    System.out.print("Enter your target weight: ");
	    double targetWeight = input.nextDouble();
	    double remainingWeight = targetWeight - weight;
	    System.out.println("You need to lose " + remainingWeight + " kilograms to reach your target.");
	    System.out.println("This means you need to burn " + (remainingWeight * 7700) + " calories.");
	  }
	}

}
