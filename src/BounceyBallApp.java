import java.util.ArrayList;
import java.util.Scanner;

public class BounceyBallApp {

	public static void main(String[] args) {
		// Greet user
		System.out.println("Welcome to the Bouncey Ballz App!\n");
		
		Scanner sc = new Scanner(System.in);
		// Prompt user for input to determine number of bouncey ballz
		int numBallz = Validator.getInt(sc, "How many Ballz would YOU like to play with? ", 1, 100);
		ArrayList<Ball> ballArray = new ArrayList<>();
		for (int i=1; i <= numBallz; i++)
		{
			int randomBounces = (int)(Math.random() * 10);
			Ball b = new Ball(i, randomBounces);
			Ball.totalBounces += randomBounces;
			System.out.println("Ball ID: " + b.getId() + "\tBounces: " + b.getBounces() + "\tTotal Bounces: "+ Ball.getTotalBounces());
			ballArray.add(b);			
		}
		/*
		for (Ball b : ballArray)
		{
			System.out.println("Ball ID: " + b.getId() + "\tBounces: " + b.getBounces() + "\tTotal Bounces: "+ b.getTotalBounces());
		}
		*/

	}

}
