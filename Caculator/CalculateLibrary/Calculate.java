package CalculateLibrary;

public class Calculate 
{
    public static int square(int input)
    {
    	return (input * input);
    }

    public static int cube(int input)
    {
    	return (input * input * input);
    }

    public static double average(double inputOne, double inputTwo)
    {
    	return ((inputOne + inputTwo) / 2.0);
    }    

    public static double average(double inputOne, double inputTwo, double inputThree)
    {
    	return ((inputOne + inputTwo + inputThree) / 3);
    }

    public static double toDegrees(double radians)
    {
    	return (radians * (57.2958279088));
    }

    public static double toRadians(double degress){
    	return (degress * (0.01745327777));
    }

    public static double discriminant(double a, double b, double c)
    {
    	return ((b * b) - (4 * a * c));
    }

    public static String toImproperFrac(int wholeNum, int numerator, int denominator) 
    {
    	return (((wholeNum * denominator) + numerator) + "/" + denominator);
    }

    public static String toMixedNum(int numerator, int denominator) 
    {
    	return ((numerator / denominator) + "_" + (numerator % denominator) + "/" + denominator);
    }

    public static String foil(int inputOne, int inputTwo, int inputThree, int inputFour, String variable) 
    {
    	return ((inputOne * inputThree) + variable + "^2 + " + ((inputOne * inputFour) + (inputTwo * inputThree)) + "n + " + (inputTwo * inputFour));
    }
    public static boolean isDivisibleBy(int inputOne, int inputTwo) 
    {
    	return ((inputOne % inputTwo) == 0);
    }
    public static double absValue(double inputOne)
    {
    	if(inputOne < 0) 
    	{
    		inputOne *= -1;
    	}
    		return inputOne;
    }

    public static double max(double inputOne, double inputTwo) 
    {
    	double output = inputOne;
    	if(inputTwo > inputOne) 
    	{
    		output = inputTwo;
    	}
    	return output;		
    }

    public static double min(double inputOne, double inputTwo) 
    {
    	double output = inputOne;
    	if(inputTwo < inputOne)
    	{
    		output = inputTwo;
    	}
    	return output;
    }

    public static double round2(double inputOne)
    {
    	return 0; //("%2f", inputOne);
    }
}
