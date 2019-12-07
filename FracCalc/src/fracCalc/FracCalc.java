package fracCalc;
import java.util.*;

public class FracCalc {

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

    static String produceAnswer(String input)
    {
        //splits up the equation into the first and second operands and the operator
        String[] operands = input.split(" ");


        //error checking
        //checking for valid characters
        String acceptedChars = "1234567890-_+/* ";
        for (String character : input.split(""))
        {
           if (!acceptedChars.contains(character)) {return "bruh... why?";}
        }
        try {String check = operands[2];}
        catch (ArrayIndexOutOfBoundsException e) {return "no";}
        String result = "";
        for (int i = 0; i < operands.length - 2; i += 2)
        {
            result = caculateMore(operands[i], operands[i+1], operands[i+2]);
            operands[i+2] = result;
        }
        return result;
    }

    //simplifying fractions

    public static String caculateMore (String operandOne, String operator, String operandTwo)
    {
        int[] firstImproperFrac = toImproper(operandOne);
        int[] secondImproperFrac = toImproper(operandTwo);

        //makes second operand negative or flips the fraction
        caculate(operator, secondImproperFrac);

        //caculating the fractions
        int combinedNumerator = 0;
        if (operator.equals("+") || operator.equals("-"))
        {
            combinedNumerator = (firstImproperFrac[0] * secondImproperFrac[1]) +
                    (secondImproperFrac[0] * firstImproperFrac[1]);
        }
        if (operator.equals("*") || operator.equals("/"))
        {
            combinedNumerator = (firstImproperFrac[0] * secondImproperFrac[0]);
        }
        int combindedDenominator = (firstImproperFrac[1] * secondImproperFrac[1]);

        //simplifying fractions
        if (combinedNumerator == 0) {return "0";}
        if (combindedDenominator == 1) {return ""+combinedNumerator;}
        if (combinedNumerator == combindedDenominator) {return "1";}
        int reverseNumerator = absValue(combinedNumerator);
        if ((combinedNumerator) > (combindedDenominator) || reverseNumerator > combinedNumerator)
        {
            int combinedWhole = combinedNumerator/combindedDenominator;
            combinedNumerator = ((combinedNumerator%combindedDenominator));
            int commonFactor = gcf(combinedNumerator, combindedDenominator);
            if (combinedNumerator == 0 ) {return "" + combinedWhole;}
            combinedNumerator /= commonFactor;
            combindedDenominator /= commonFactor;
            if (combinedWhole == 0)
            {
                if (combindedDenominator < 0)
                    return (combinedNumerator * -1) + "/" + (combindedDenominator * -1);
                return (combinedNumerator) + "/" + (combindedDenominator);
            }
            return String.format("%s_%s/%s",(combinedWhole),
                    absValue(combinedNumerator), absValue(combindedDenominator));
        }

        //return statement
        int commonFactor = gcf(combinedNumerator, combindedDenominator);
        if (combindedDenominator/commonFactor < 0)
        {
            return String.format("%s/%s",(combinedNumerator/commonFactor) * -1,(combindedDenominator/commonFactor) * -1);
        }
        else
        {
            return String.format("%s/%s",combinedNumerator/commonFactor,combindedDenominator/commonFactor);
        }
    }
    public static int caculate (String operator, int[] secondImproperFrac)
    {
        if (operator.equals("-")) {return secondImproperFrac[0] *= -1;}
        if (operator.equals("/"))
        {
            int temporary;
            temporary = secondImproperFrac[0];
            secondImproperFrac[0] = secondImproperFrac[1];
            secondImproperFrac[1] = temporary;
        }
        return secondImproperFrac[0];
    }

    public static String toMixed(String input)
    {
        if (!input.contains("_") && !input.contains("/")) {input += "_";}
        if (!input.contains("_")) {input = "0_" + input;}
        if (!input.contains("/")) {input += "0/1";}
        return input;
    }

    public static int[] toImproper(String input)
    {
        input = toMixed(input);
        int[] fraction = new int[2];
        int whole = Integer.parseInt(input.split("_")[0]);
        int numerator = Integer.parseInt(input.split("/")[0].split("_")[1]);
        //fraction [0] is numerator
        //fraction [1] is denominator
        fraction[1] = Integer.parseInt(input.split("/")[1]);
        fraction[0] = (whole * fraction[1]);
        if (fraction[0] < 0) {fraction[0] -= numerator;}
        else {fraction[0] += numerator;}
        return fraction;
    }


    public static boolean isDivisibleBy(int inputOne, int inputTwo)
    {
        if (inputOne == 0 || inputTwo == 0)
            throw new IllegalArgumentException("cannot divide by zero");
        return ((inputOne % inputTwo) == 0);
    }

    public static int gcf(int inputOne, int inputTwo)
    {
        return (inputTwo == 0) ? inputOne : gcf(inputTwo, inputOne%inputTwo);
    }

    public static int min(int inputOne, int inputTwo)
    {
        int output = inputOne;
        if (inputTwo < inputOne)
            output = inputTwo;
        return output;
    }

    public static int absValue(int inputOne)
    {
        if(inputOne < 0)
            inputOne *= -1;
        return inputOne;
    }
}
