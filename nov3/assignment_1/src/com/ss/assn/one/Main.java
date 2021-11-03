package com.ss.assn.one;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        // Handle command line args
        if (args.length != 1)
        {
            printUsageError();
            System.exit(1);
        }
        String input = args[0];

        // Ensure directory is valid
		File root = new File(input);
        if (!root.exists())
        {
            System.err.println("Directory '" + input + "' does not exist!\n\nExiting...");
            System.exit(1);
        }

        // Begin directory walk
        try
        {
            for (File file : root.listFiles())
            {
                int depth = 0;
                if (file != null)
                {
                    walkDirectory(file, depth);
                }
            }
        }
        catch (NullPointerException e)
        {
            System.err.println("You supplied a file, not a directory.\n");
            System.err.println("Ensure you are supplying a directory as an argument.");
            System.exit(1);

        }
        catch (Exception e)
        {
            System.err.println("Unknown error.\n");
            System.err.println("Ensure you are supplying a directory as an argument.");
            System.exit(1);
        }
    }

    public static void printUsageError()
    {
        System.err.println("Usage: ./run_sh <path/to/search/>");
        System.err.println("");
        System.err.println("positional arguments:");
        System.err.println("  path/to/search/");
        System.err.println("example:");
        System.err.println("  ./run_sh .");
    }

    private static void walkDirectory(File file, int depth)
    {
        // Indentation of subdir
        for (int i = 0; i < depth; i++)
        {
            System.out.print("  ");
        }

        // Handle file or directory
        if (file.isFile())
        {
            System.out.println(file.getName());
        }
        else
        {
            System.out.println(file.getName());

            File[] files = file.listFiles();
            for (File token: files)
            {
                walkDirectory(token, ++depth);
            }
        }
    }
}
