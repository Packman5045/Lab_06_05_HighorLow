import java.util.Scanner;
//this code allows us to use an input function for the user
import java.util.Random;
//this is the tool used to generate the random numbers using java

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //this is our code for the scanner, and RNG(RandomNumberGenerator)

        int lucky = random.nextInt(10)+1;
        //this is the code that makes the random number
        int user = 0;
        String trash = "";

    System.out.println("Can you guess the number I'm thinking of from 1 through 10?");

    if(scan.hasNextInt())
    {
        user = scan.nextInt();
        scan.nextLine();
    }
    else
        {
            trash = scan.nextLine();
            System.out.println("ERROR. Please input a number between 1 and 10. " + trash + " is not a valid input.");
        System.exit(1);
        }

    if (user == lucky)
        {
            System.out.println("WOW! Must be your lucky day! ");
        }

   else if (user > lucky)
    {
        System.out.println("You were a bit too high. ");
    }
    else if (user < lucky)
    {
        System.out.println("You were a bit too low. ");
    }

        System.out.println(lucky + " was my number!");








    }
}