import java.util.*;

public class ProcessingNumbers
{
    public static void main(String[] args)
    {
        //declaring variables
        Scanner sc = new Scanner(System.in);
        int input;
        int amount = 0;
        int min;
        int max;
        int evenMax = 1;
        int evenSum = 0;

        //prompting user, and intializing variables
        while (amount < 1)
        {
            System.out.println("How many numbers would you like to print?");
            amount = sc.nextInt();
            if (amount < 1)
            {
                System.out.println("There's nothing to print and-i-loop (try again)\n\n");
            }
        }
        System.out.println("What is the number 1?");
        input = sc.nextInt();
        min = input;
        max = input;
        if (input % 2 == 0)
        {
            evenMax = input;
            evenSum = input;
        }

        //LOOPY TIMEEE
        for (int i = 2; i <= amount; i++) {
            System.out.printf("What is number %d?\n", i);
            input = sc.nextInt();
            //checking for min
            if (input < min)
                min = input;
            if (input > max)
                max = input;
            if (input % 2 == 0)
            {
                evenSum += input;
                if (input > evenMax)
                {
                    evenMax = input;
                }
            }
        }

        //printing all the things
        System.out.printf("The smallest number is %d\n", min);
        System.out.printf("The largest number is %d\n", max);
        if (evenMax == 1)
            System.out.println("There are no even numbers\n");
        else
            {
            System.out.printf("The sum of all even numbers is %d\n", evenSum);
            System.out.printf("The largest even number is %d\n", evenMax);
        }

        sc.close();
    }
}