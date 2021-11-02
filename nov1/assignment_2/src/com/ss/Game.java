package ss;

import java.util.Scanner;
import java.lang.Math;

public class Game
{
    private int targetValue;
    private int userInput;
    private int lives;
    private Scanner s;

    public Game()
    {
        this.targetValue = (int)((Math.random() * 100) % 101);
        this.userInput = -1;
        this.lives = 5;

        this.s = new Scanner(System.in);

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
        getFirstUserInput();
        playGame();
        this.s.close();
    }

    public void getFirstUserInput()
    {
        System.out.print("Enter a number between 0 and 100: ");
        this.userInput = this.s.nextInt();
    }

    public void getNextUserInput()
    {
        String[] responses = new String[] { "Nope", "Nah", "Wrong", "No", "Not quite" };
        int random_idx = (int)((Math.random() * 100) % (responses.length - 1));

        String response = responses[random_idx];
        System.out.print("\n" + response + ". ");

        System.out.println("Lives left: " + this.lives);
        System.out.print("Try again: ");

        this.userInput = this.s.nextInt();
    }

    public void playGame()
    {
        while (!(this.userInput > targetValue - 10 && this.userInput < targetValue + 10))
        {
            // play the game
            this.lives--;
            if (this.lives == 0)
            {
                defeat();
                return;
            }
            else
            {
                getNextUserInput();
            }
        }
        victory();
    }

    public void defeat()
    {
        System.out.println("\nYou lost!");
        System.out.print("The number was: ");
        System.out.println(targetValue);
    }

    public void victory()
    {
        System.out.println("\nVictory!");
        System.out.print("The number was: ");
        System.out.println(targetValue);
    }
}
