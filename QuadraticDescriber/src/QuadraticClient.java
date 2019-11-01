/*
Clayton Lau
APCS 3rd Period
 */

import java.util.*;

public class QuadraticClient
{
    public static void main(String[] args)
    {
        //initializing variables
        boolean carryOn = true;
        String input;
        String characterError = "Input cannot contain non-numbers, please try again";
        Scanner sc = new Scanner(System.in);

        //prompting and greeting user
        System.out.println("Welcome to the Quadratic Describer");
        System.out.println("Provide values for coefficients a, b, and c\n");

        while(carryOn)
        {
            //takes 'a' variable, tries again if there aren't numbers
            System.out.print("a: ");
            input = sc.next();
            if (Quadratic.notNumber(input))
            {
                System.out.println(characterError);
                System.out.print("a: ");
                input = sc.next();
            }
            double a = Double.parseDouble(input);

            //takes 'b' variable, tries again if there aren't numbers
            System.out.print("b: ");
            input = sc.next();
            if (Quadratic.notNumber(input))
            {
                System.out.println(characterError);
                System.out.print("b: ");
                input = sc.next();
            }
            double b = Double.parseDouble(input);

            //takes 'c' variable, tries again if there aren't numbers
            System.out.print("c: ");
            input = sc.next();
            if (Quadratic.notNumber(input))
            {
                System.out.println(characterError);
                System.out.print("b: ");
                input = sc.next();
            }
            double c = Double.parseDouble(input);

            //does the fancy quadratic things
            Quadratic.quadrDescriber(a, b, c);

            //prompts users to continue or not
            System.out.print("\nDo you want to keep doing? (Type \"quit\" to end)\n");
            input = sc.next();
            if (input.toUpperCase().charAt(0) == 'Q') {
                carryOn = false;
            }

        }
        //closes scanner yay :)
        sc.close();
    }
}
