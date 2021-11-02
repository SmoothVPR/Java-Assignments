public class Main
{
    public static void main(String[] args)
    {
        // Handle command line args;
        int res = 0;
        for (String arg : args)
        {
            res += Integer.parseInt(arg);
        }

        System.out.println(res);
    }
}
