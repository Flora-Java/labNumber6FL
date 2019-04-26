import java.util.Random;
import java.util.Scanner;

public class DiceRollingEx {

	public static void main(String[] args) {
		int sides;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Casino");
		System.out.println("Please tell me how many sides your dice has: ");
		sides = scan.nextInt();
		int counting = 1;
		String decision;
		do {
		  System.out.println("Roll: " + counting);
   		  int firstRoll = generateRandomDieRoll(sides) + 1;
		  int secondRoll = generateRandomWithJava(sides) + 1;
		  System.out.println(firstRoll);
		  System.out.println(secondRoll);
		  if (firstRoll == 1 && secondRoll == 1) {
			System.out.println("You got snake eyes!!");
			} 
		// Craps is 2 and 1 or 1 and 2
		  if ((firstRoll + secondRoll) == 3) { 
		  	 System.out.println("Crap, that was great!!");
		   }
		   if (firstRoll == 6 && secondRoll == 6) {
			  System.out.println("Hey you got box cars!!");
		    } 
		   System.out.println("Roll again? (y/n) ");
		   decision = scan.next();
		   counting ++;
		  } while (decision.equalsIgnoreCase("y"));
		}
		

			
		
		public static int generateRandomDieRoll(int num) {
			
			Random rand = new Random();
			// Obtain a number between [0 - num].
			return rand.nextInt(num);
		}
		public static int generateRandomWithJava(int num) {
			int random = (int)(Math.random() * num );
			return random;
		}
}
