import java.util.Scanner;
import java.util.Random;

public class MontyHallComplete 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("How many rounds should be simulated: ");
		int rounds = scan.nextInt();
		
		while (rounds < 10 || rounds > 10000)
		{
			System.out.println("Must enter a number between 10 and 10,000");
			rounds = scan.nextInt();
		}
		int wins = 0;

		System.out.println("Should the player switch or stay? ");
		String SwOSt = scan.nextLine();
		SwOSt = scan.nextLine();
		
		for (int i = 0; i <= rounds; i++)
		{
			int win = rand.nextInt(3) + 1;
			int start = rand.nextInt(3) + 1;
			
			while (!SwOSt.equals("switch") && !SwOSt.equals("stay"))
			{
				System.out.println("Must enter either \"switch\" or \"stay\"");
				SwOSt = scan.nextLine();
			}
			if (SwOSt.equals("switch") && win != start)
			{
				wins++;
			}				
			else if (SwOSt.equals("stay") && win == start)
			{
				wins++;
			}
				
		}	
		double ratio1  = (double)wins / rounds;
		double ratio2 = ratio1 * 100;
			
		System.out.println("the player won " + wins + "/" + rounds + " (" + ratio2 + "%)");
	}
}