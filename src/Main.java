public class Main
{
    public static void main(String[] args)
    {
        //A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        System.out.print("|");
        for (int i = 0; i <= 30; i++)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        //A loop that counts down by 1 from 30 to 0
        System.out.print("|");
        for (int i = 30; i >= 0; i--)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        //A loop that counts up by 3 from 0 to 18
        System.out.print("|");
        for (int i = 0; i <= 18; i += 3)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        //A loop that counts down by 2 from 10 to 0
        System.out.print("|");
        for (int i = 10; i >= 0; i-=2)
        {
            System.out.printf("%3d |", i);
        }
        System.out.print("\n");

        //fancy figure grows
        System.out.print("\n");
        for (int i = 0; i < 5; i++)
        {
            for (int c = 0; c <= i; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //fancy figure shrinks
        System.out.print("\n");
        for (int i = 5; i > 0; i--)
        {
            for (int c = 0; c < i; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //fancy figure as a 5 square
        System.out.print("\n");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("*****");
            System.out.print("\n");
        }

        //first name time
        System.out.print("\n");
        for (int i = 0; i < 6; i++)
        {
            if (i == 0 || i == 5)
            {
                System.out.print("*****");
                System.out.print("\n");
            }
            else if (i == 1)
            {
                System.out.print("   **");
                System.out.print("\n");
            }
            else if (i == 2)
            {
                System.out.print("  ** ");
                System.out.print("\n");
            }
            else if (i == 3)
            {
                System.out.print(" **  ");
                System.out.print("\n");
            }
            else //i == 4
            {
                System.out.print("**   ");
                System.out.print("\n");
            }
        }
    }
}