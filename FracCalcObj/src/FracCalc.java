//Clayton Lau
import java.util.*;

public class FracCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (!quit)
        {
            System.out.print("\nInput: ");
            String input = sc.nextLine();
            if (input.equals("quit"))
            {
                System.out.print("lmao i never wanted to be with you anyways");
                quit = true;
            }
            else
            {
                System.out.println("Answer: " + produceAnswer(input));
            }
        }
        sc.close();
    }

    public static String produceAnswer(String input)
    {
        return "";
    }
}
