import java.util.Scanner;

public class CToF
{
    public static void main(String[] args)
    {
        //Use a do while loop to bulletproof the user input
        //Now, when the user fails to enter a valid number, the program will display an error msg
        //Then loop and prompt them again to try again to input the value correctly
        //So, the program will block and repeat until they get it right
        //Be sure to thoroughly test your program

        //Include screenshots output copies here that show the tests and output

        Scanner in = new Scanner(System.in);
        String trash;
        String userCOrF;
        boolean validInput = false;
        boolean findingC = false;
        double tempC = 0.0f;
        double tempF = 0.0f;

        do
        {
            System.out.print("Finding Celsius or Fahrenheit [C F]: ");
            userCOrF = in.nextLine();
            if (userCOrF.equalsIgnoreCase("C"))
            {
                findingC = true;
                validInput = true;
            }
            else if (userCOrF.equalsIgnoreCase("F"))
            {
                validInput = true;
            }
            else
            {
                trash = userCOrF;
                System.out.println("You incorrectly entered " + trash);
            }
        } while(!validInput);

        do
        {
            validInput = false;
            System.out.print("Enter your temperature: ");
            if (in.hasNextDouble())
            {
                validInput = true;
                if (findingC)
                {
                    tempF = in.nextDouble();
                    in.nextLine();
                }
                else //findingF
                {
                    tempC = in.nextDouble();
                    in.nextLine();
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered " + trash);
            }
        } while(!validInput);

        if (findingC)
        {
            //celsius = (fahrenheit - 32) * 1.8
            tempC = (tempF - 32.0) * 1.8;
            System.out.println("Your new temperature is " + tempC);
        }
        else //findingF
        {
            //fahrenheit = (celsius / 1.8) + 32
            tempF = (tempC / 1.8) + 32.0;
            System.out.println("Your new temperature is " + tempF);
        }
    }
}
