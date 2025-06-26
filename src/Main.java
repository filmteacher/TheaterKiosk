import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int age = 0; // num age = 0
        String trash = ""; // use for bad input which will read as a String

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: "); // output "Enter your age: "

        if(in.hasNextInt()) // OK safe to read in an integer
        {
            age = in.nextInt();  // input age
            in.nextLine(); // clears the newline from the buffer

            if (age >=21) // if age >= 21 then
            {
                System.out.println("Your age is: "+age+". You are 21 or older. You get a wrist band."); // output "You are 21 or older. You get a wrist band."
            }
            else // else
            {
                System.out.println("Your age is: "+age+". You are not old enough to enter."); // output "You aren't old enough to enter."
            } // end if
        }
        else // Not an int can't use nextInt() read as String with nextLine() instead
        {
            trash = in.nextLine(); // Ok have to read the input as a String
            System.out.println("You said your age was: " + trash);
            System.out.println("Run the program again and enter a valid age.");
        }
    }
}