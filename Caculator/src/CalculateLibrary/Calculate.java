package CalculateLibrary;

public class Calculate
{
    //squares the input
    public static int square(int input)
    {
    	return input * input;
    }

    //cubes the input
    public static int cube(int input)
    {
    	return input * input * input;
    }

    //finds average for two doubles
    public static double average(double inputOne, double inputTwo)
    {
    	return (inputOne + inputTwo) / 2;
    }

    //find average for three doubles
    public static double average(double inputOne, double inputTwo, double inputThree)
    {
    	return (inputOne + inputTwo + inputThree) / 3;
    }

    //converts radians to degrees
    public static double toDegrees(double radians)
    {
    	return radians * (57.2958279088);
    }

    //converts degrees to radians
    public static double toRadians(double degress){
    	return degress * (0.01745327777);
    }

    //finds b^2 - 4ac (discriminant)
    public static double discriminant(double a, double b, double c)
    {
    	return ((b * b) - (4 * a * c));
    }

    //converts mixed numbers to improper fractions
    public static String toImproperFrac(int wholeNum, int numerator, int denominator)
    {
    	return (((wholeNum * denominator) + numerator) + "/" + denominator);
    }

    //converts improper fractions to mixed numbers
    public static String toMixedNum(int numerator, int denominator)
    {
    	return ((numerator / denominator) + "_" + (numerator % denominator) + "/" + denominator);
    }

    //foils numbers
    public static String foil(int inputOne, int inputTwo, int inputThree, int inputFour, String variable)
    {
    	return ((inputOne * inputThree) + variable + "^2 + " + ((inputOne * inputFour) +
            (inputTwo * inputThree)) + "n + " + (inputTwo * inputFour));
    }

    //finds if the first number is divisible by the second
    public static boolean isDivisibleBy(int inputOne, int inputTwo)
    {
    	return ((inputOne % inputTwo) == 0);
    }

    //finds absolute value of the number given
    public static double absValue(double inputOne)
    {
    	if(inputOne < 0)
    		inputOne *= -1;
    	return inputOne;
    }

    //finds maximum of two numbers
    public static double max(double inputOne, double inputTwo)
    {
    	double output = inputOne;
    	if(inputTwo > inputOne)
    		output = inputTwo;
    	return output;
    }

    //finds maximum of three numbers
    public static double max(double inputOne, double inputTwo, double inputThree)
    {
        double output = inputOne;
        if(inputTwo > inputOne)
            output = inputTwo;
        if(inputThree > output)
            output = inputThree;
        return output;
    }

    //finds minimum of two numbers
    public static int min(int inputOne, int inputTwo)
    {
        int output = inputOne;
    	if (inputTwo < inputOne)
    		output = inputTwo;
    	return output;
    }

    //rounds a double to 2 decimal places
    public static double round2(double inputOne)
    {
        if (((int) (inputOne * 1000)) %  10 >= 5)
        {
            inputOne += 0.01;
        }
        inputOne = (int) (inputOne * 100);
    	return inputOne /= 100;
    }

    //put the first input to the power of the second
    public static double exponent(double base, int power)
    {
        if (power == 0)
        {
            throw new IllegalArgumentException("exponent is equal to 0");
        }
        if (power < 0)
        {
            throw new IllegalArgumentException("exponent is smaller than 0");
        }
        double multiplier = base;
        while (power > 0)
        {
            base *= multiplier;
            power--;
        }
        return base;

    }

    //fatorials the input
    public static double factorial(int inputOne)
    {
        for(int counter = inputOne - 1; counter > 0; counter--)
        {
            inputOne *= counter;
        }
        return inputOne;
    }

    //checks if the input is prime
    public static boolean isPrime(int inputOne)
    {
        boolean returner = true;
        for (int i = 2; i < inputOne; i++)
        {
            if (isDivisibleBy(inputOne, i))
            {
                returner = false;
            }
        }
        return returner;
    }

    //finds greatest common factor between two integers
    public static int gcf(int inputOne, int inputTwo)
    {
        for(int i = min(inputOne, inputTwo); i >= 1; i--)
        {
            if (isDivisibleBy(inputOne, i) && isDivisibleBy(inputTwo, i))
            {
                return i;
            }
        }
        //should never reach here
        return 1;
    }

    //finds square root of the numbre things
    public static double sqrt(double squareRoot)
    {
        double originalNum = squareRoot;
        double attempt = squareRoot / 2;
        while (true)
        {
            squareRoot = 0.5 * (originalNum / attempt + attempt);
            if ((squareRoot * squareRoot) - originalNum <= 0.05)
            {
                return round2(squareRoot);
            }
            attempt = squareRoot;
        }
    }

    public static String quadForm(int a, int b, int c)
    {
        if ((b * b + (4 * a * c))  < 0)
        {
            return ("no real roots");
        }
        else if((b * b + (4 * a * c)) == 0)
        {
             return ("1 real root");
        }
        else 
        {
            return ("dos real roots");
        }
    }
}
