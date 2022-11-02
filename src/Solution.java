import java.util.Scanner;
import java.lang.Math;
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner
		Scanner input = new Scanner(System.in);

		//declare variables
		double weight;
		int feet;
		int inches;

		//prompt user
		System.out.print("Enter weight in pounds: ");
		weight = input.nextFloat();

		System.out.print("Enter feet: ");
		feet = input.nextInt();

		System.out.print("Enter inches: ");
		inches = input.nextInt();

		//convert measurements
		double weightInKilos = weight * 0.453592;
		double heightInMeters = (((feet * 12) + inches) * .0254);
		double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
		//      double bmi = weightInKilos / (heightInMeters * heightInMeters);

		//display output
		System.out.println("Your BMI is: " + bmi);


	}
}
