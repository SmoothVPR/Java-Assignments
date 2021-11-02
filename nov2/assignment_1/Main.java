public class Main
{
    public static void main(String[] args)
    {
        // Handle command line args;
        int res = 0;
        for (String arg : args)
        {
            try
            {
                res += Integer.parseInt(arg);
            }
            catch (Exception e)
            {
                System.err.println(arg + " Is not an integer");
            }
        }

        System.out.println("Result: " + res);
    }
}
