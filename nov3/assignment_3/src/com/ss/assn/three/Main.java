package com.ss.assn.three;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        // Handle command line arguments
        if (args.length != 2)
        {
            printUsageError();
            System.exit(1);
        }
        String input = args[0];
        String chars = args[1];

        // Open file and begin counting chars
        File target = new File(input);
        try
        {
            getCharacterCount(input, chars, target);
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
        System.err.println("Usage: ./run_sh <path/to/text.txt> <character string>");
        System.err.println("");
        System.err.println("positional arguments:");
        System.err.println("  path/to/text.txt, character string");
        System.err.println("");
        System.err.println("example:");
        System.err.println("  ./run_sh test.txt abcdefg");
    }

    public static void getCharacterCount(String input, String chars, File target) throws IOException
    {
        if (!target.exists())
        {
            System.err.println("File '" + input + "' not found.");
            System.exit(1);
        }

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] charArray = chars.toCharArray();
        for (char c : charArray)
        {
            charMap.putIfAbsent(c, 0);
        }

        System.out.println("Finding each char of '" + chars + "' in file '" + target + "'...");
        Scanner s = new Scanner(target);
        while (s.hasNextLine())
        {
            String line = s.nextLine();
            for (char c : line.toCharArray())
            {
                System.out.print(c);
                if (charMap.containsKey(c))
                {
                    charMap.put(c, charMap.get(c) + 1);
                }
            }
        }
        s.close();

        System.out.println("");
        for (HashMap.Entry<Character, Integer> entry : charMap.entrySet())
        {
            System.out.println(entry);
        }
    }
}
