//Clayton lau

import java.util.*;

public class Split
{
    public static void main(String[] args)
    {
        System.out.println("Example 1:");
        String[] ex1 = "I like apples!".split("");
        System.out.println(Arrays.toString(ex1));

        System.out.println("Example 2:");
        String[] ex2 = "I really like really red apples!".split("really");
        System.out.println(Arrays.toString(ex2));

        System.out.println("Example 3:");
        String[] ex3 = "I reallyreally likeapples".split("really");
        System.out.println(Arrays.toString(ex3));

        String[] meals = {
                "applespineapplesbreadbreadlettucebreadtomatobaconmayohambreadcheese",
                "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
        };
        System.out.println(insides("applespineapplesbreadbreadlettucebreadtomatobaconmayohambreadcheese"));
    }

    public static String insides(String input)
    {
        String[] splitMeal = input.split("bread");
        String inside = "";

        if (splitMeal.length < 3)
            return "Not a sandwich";

        for (int index = 1; index < splitMeal.length - 1; index++)
            inside += splitMeal[index];

        return "You have a " + inside + " sandwich.";
    }

    public static String insidesTwo(String input)
    {
        String processingInput = "", inside = "";

        String[] spacelessSandwich = input.split(" ");

        for (String parts : spacelessSandwich)
            processingInput += parts;

        String[] splitMeal = processingInput.split("bread");

        for (int index = 1; index < splitMeal.length - 1; index++)
            inside += splitMeal[index] + " ";
        return "You have a " + inside + "sandwich.";
    }
}
