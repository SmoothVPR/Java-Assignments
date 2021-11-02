import java.util.Scanner;

public class Game
{
    private int userInput;
    private Scanner s;

    public Game()
    {
        System.out.println("Welcome to SmoothVPR's Guessing Game!");
        System.out.println("\nThe rules are as follows:");
        System.out.println("- You must guess and enter a number between 1 and 100");
        System.out.println("- If the guess is NOT within 10 (+ or -) units of the correct answer,");
        System.out.println("  the game will continue"); 
        System.out.println("- You have 5 lives at the start of the game and every wrong guess costs");
        System.out.println("  you a life\n");
    }

    public void start()
    {
        // Initial prompt
        getFirstUserInput();
        // while loop
        playGame();
        // end game message
        // ask to play again
        gameOverOutput();
    }

    public void getFirstUserInput()
    {
        System.out.print("Enter a number between 0 and 100: ");

        this.s = new Scanner(System.in);
        this.userInput = s.nextInt();

        s.close();
    }

    public void getNextUserInput()
    {
    }

    public void playGame()
    {
    }

    public void gameOverOutput()
    {
    }
}
