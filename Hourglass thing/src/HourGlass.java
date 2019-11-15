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
        String finishedHourglass;

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
        for (int i = scale - 2; i >= 2; i -= 2) {
            for (int j = 0; j < counter; j++) {
                topMiddleLines += " ";
            }
            topMiddleLines += "\\";
            for (int j = 0; j < i; j++) {
               topMiddleLines += ":";
            }
            topMiddleLines += "/\n";
            counter++;
        }

        //middle
        String middle = "";
        for (int i = 0; i < counter; i++) {
            middle += " ";
        }
        middle += "||\n";


        finishedHourglass = ends + topMiddleLines + middle + ends;
        return finishedHourglass;
    }
}
