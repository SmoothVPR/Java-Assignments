public class Main
{
    public static void main(String[] args)
    {
        print_one();
        print_two();
        print_three();
        print_four();
    }

    static void print_one()
    {
        System.out.println("1)");
        for (int i = 1; i < 5; i++)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(".........");
    }

    static void print_two()
    {
        System.out.println("2)");
        System.out.println("..........");
        for (int i = 4; i > 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void print_three()
    {
        System.out.println("3)");
        for (int i = 5, stars = 1; i > 1; i--, stars+=2)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int _i = 0; _i < stars; _i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("...........");
    }

    static void print_four()
    {
        System.out.println("4)");
        System.out.println("............");
        for (int i = 2, stars = 7; i < 6; i++, stars-=2)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int _i = 0; _i < stars; _i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
