package AbirAhmed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int tries = 0;
	    int correct = 1;
	    int max = 100;
	    int start = 0;
	    Scanner reader = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String playerName = reader.nextLine();
        System.out.println("Hi " + playerName + ", let's play the guessing game");
        System.out.println("Think of a number between 1-100, and I will guess it based on binary search.");
        int compGuess = 50;
        while (correct == 1)
        {
            System.out.println("I guess " + compGuess + ", is your number higher, lower, or correct?");
            String binary = reader.nextLine();
            if (binary.equals("lower"))
            {
                max = compGuess - 1;
                compGuess = (start + max)/2;
                tries++;
            }
            else if (binary.equals("higher"))
            {
                start = compGuess + 1;
                compGuess = (start + max)/2;
                tries++;
            }
            else if (binary.equals("correct"))
            {
                correct++;
                System.out.println("Yes! I have guessed your correct answer in " + tries + " guesses. Your number was " + compGuess "");
            }
        }
    }
}
