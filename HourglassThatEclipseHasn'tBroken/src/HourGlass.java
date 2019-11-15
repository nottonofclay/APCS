import java.util.*;

public class HourGlass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How big do you want your hourglass to be?");
        int input = sc.nextInt();
        System.out.println(hourglass(input));
    }

    public static String hourglass(int scale)
    {
        String finishedHourglass = "";

        //making the ends thingys
        String ends = "|";
        for(int i = 0; i < scale; i++)
        {
            ends += "\"";
        }
        ends += "|\n";

        //everything below first line and above the ||
        String topMiddleLines = "";
        int counter = 1;
        int numberOfDots = 0;
        for (int i = scale - 2; i >= 2; i -= 2) {
            for (int j = 0; j < counter; j++) {
                topMiddleLines += " ";
            }
            topMiddleLines += "\\";
            for (int j = 0; j < i; j++) {
                topMiddleLines += ":";
            }
            numberOfDots = i;
            topMiddleLines += "/\n";
            counter++;
        }

        //middle
        String middle = "";
        for (int i = 0; i < counter; i++) {
            middle += " ";
        }
        middle += "||\n";

        //everything below the || and above the last line
        String bottomMiddleLines = "";
        int bottomCounter = counter - 1;
        for (int i = 0; i < (counter - 1); i++)
        {
            for (int j = 0; j < (bottomCounter); j++)
            {
                bottomMiddleLines += " ";
            }
            bottomMiddleLines += "/";
            for (int j = 0; j < numberOfDots; j++) {
                bottomMiddleLines += ":";
            }
            numberOfDots += 2;
            bottomCounter -= 1;
            bottomMiddleLines += "\\";
            bottomMiddleLines += "\n";
        }

        finishedHourglass = ends + topMiddleLines + middle + bottomMiddleLines + ends;
        return finishedHourglass;
    }
}
