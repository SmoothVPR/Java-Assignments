package com.ss.assn.two;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Handle command line arguments
        if (args.length != 1)
        {
            printUsageError();
            System.exit(1);
        }
        String input = args[0];

        // Open file and begin prompt
        File target = new File(input);
        try
        {
            getInputAndAppend(input, target);
        }
        catch (IOException e)
        {
            // IOExecption
        }
        catch (Exception e)
        {
            // Unknown exception
        }
    }

    public static void printUsageError()
    {
        System.err.println("Usage: ./run_sh <path/to/text.txt>");
        System.err.println("");
        System.err.println("positional arguments:");
        System.err.println("  path/to/text.txt");
        System.err.println("example:");
        System.err.println("  ./run_sh test.txt");
    }

    public static void getInputAndAppend(String input, File target) throws IOException
    {
        if (!target.exists())
        {
            System.err.println("File '" + input + "' not found.");
            System.exit(1);
        }

        System.out.println("Enter the text you would like to append to the file '" + input + "': \n");
        Scanner s = new Scanner(System.in);
        String textToAppend = s.nextLine();
        s.close();

        FileWriter fw = new FileWriter(target, true);
        fw.write(textToAppend);
        fw.close();
    }
}
